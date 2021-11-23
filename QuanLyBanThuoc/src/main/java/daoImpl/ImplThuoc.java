package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.bson.types.ObjectId;

import dao.ThuocDao;
import entity.Thuoc;
import util.HibernateUtil;

public class ImplThuoc  extends UnicastRemoteObject implements ThuocDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3692853915209401270L;
	private EntityManager em;
	public ImplThuoc() throws RemoteException {
		em = HibernateUtil.getInstance().getEntityManager();
	}
	@Override
	public boolean addThuoc(Thuoc thuoc) throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			
			tr.begin();
			em.persist(thuoc);

			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return false;
	}
	
	
	@Override
	public List<Thuoc> getThuocTheoMaLoai(ObjectId maLoai) throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			
			tr.begin();
			String query = "db.dsThuoc.aggregate([{\r\n"
					+ "    '$match': {\r\n"
					+ "        'LoaiThuoc_Id': ObjectId('"+maLoai+"'),\r\n"
					+ "        'trangThaiThuoc': 'Còn bán'\r\n"
					+ "    }\r\n"
					+ "}])";
			@SuppressWarnings("unchecked")
			List<Thuoc> ls = em.createNativeQuery(query,Thuoc.class).getResultList();
			

			tr.commit();
			return ls;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		
		return null;
	}

}
