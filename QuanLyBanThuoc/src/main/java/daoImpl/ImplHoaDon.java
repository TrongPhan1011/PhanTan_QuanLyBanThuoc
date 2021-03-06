package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.bson.types.ObjectId;

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
	
	@Override
	public List<HoaDon> getHoaDonTheo1Ngay(Date ngay) throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			Format sf = new SimpleDateFormat("yyyy-MM-dd");
			String query = "db.dsHoaDon.aggregate([{'$match' : {'ngay_Lap' : {'$eq' : ISODate('"+sf.format(ngay)+"')}}}])";
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
	
	@Override

	public List<HoaDon> getHoaDonTheoMaKH(ObjectId maKH) throws RemoteException {
		//  ObjectId('"+maLoai+"'
		
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			String query = "db.dsHoaDon.find({ma_Khach_Hang :  ObjectId('"+maKH.toString()+"')})";
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
			
		


	@Override
	public List<HoaDon> getHoaDonTheoMaHD(String maHD) throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			String query = "db.dsHoaDon.find({_id :  ObjectId('"+maHD.toString()+"')})";
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
