package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.HoaDonDao;
import entity.HoaDon;
import util.HibernateUtil;

public class ImplHoaDon extends UnicastRemoteObject implements HoaDonDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6500597230454124721L;
	private EntityManager em;
	public ImplHoaDon() throws RemoteException {
		em = HibernateUtil.getInstance().getEntityManager();
		
	}
	@Override
	public boolean addHoaDon(HoaDon hoaDon) throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(hoaDon);
			
			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		
		return false;
	}
	
	@Override
	public List<HoaDon> getHoaDonTheoNgay(Date ngayDen, Date ngayKT) throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			Format sf = new SimpleDateFormat("yyyy-MM-dd");
			String query = "db.dsHoaDon.aggregate([{'$match' : {'$and' : [{'ngay_Lap' : {'$lte' : ISODate('"+sf.format(ngayKT)+"')}},{'ngay_Lap' : {'$gte' : ISODate('"+sf.format(ngayDen)+"')}}]}}])";
			@SuppressWarnings("unchecked")
			List<HoaDon> ldHD = em.createNativeQuery(query,HoaDon.class).getResultList();
			
			
			
			tr.commit();
			return ldHD;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return null;
	}
	
	

}
