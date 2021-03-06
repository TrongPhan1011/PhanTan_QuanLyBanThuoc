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
			em.merge(thuoc);

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
			String query = "db.dsThuoc.aggregate([{"
					+ "    '$match': {"
					+ "        'LoaiThuoc_Id': ObjectId('"+maLoai+"'),"
					+ "        'trangThaiThuoc': 'Còn bán'"
					+ "    }"
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
	@Override
	public Thuoc getThuocTheoTenVaMaLoai(String tenThuoc, ObjectId maLoai) throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			
			tr.begin();
			String query = "db.dsThuoc.aggregate([{"
					+ "    '$match': {"
					+ "        'tenThuoc': '"+tenThuoc+"' ,'LoaiThuoc_Id': ObjectId('"+maLoai+"'),"
					+ "        'trangThaiThuoc': 'Còn bán'"
					+ "    }\r\n"
					+ "}])";
			
			Thuoc t = (Thuoc) em.createNativeQuery(query,Thuoc.class).getSingleResult();
			

			tr.commit();
			return t;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return null;
	}
	@Override
	public List<Thuoc> getAllThuoc() throws RemoteException {
		// TODO Auto-generated method stub
		EntityTransaction tr=em.getTransaction();
		try {
			tr.begin();
			String query="db.dsThuoc.find({'trangThaiThuoc':'Còn bán'})";
			@SuppressWarnings("unchecked")
			List<Thuoc>ls=em.createNativeQuery(query,Thuoc.class).getResultList();
			tr.commit();
			return ls;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
	@Override
	public boolean updateThuoc(Thuoc thuoc) throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			
			tr.begin();
			em.merge(thuoc);

			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return false;
	}
	@Override
	public List<Thuoc> timkiemthuoc(String key) throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			
			tr.begin();
			
			String query="db.dsThuoc.find({ $text: { $search: '"+key+"' } } )";
			
			@SuppressWarnings("unchecked")
			List<Thuoc> ls=em.createNativeQuery(query,Thuoc.class).getResultList();

			tr.commit();
			return ls;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		
		return null;
	}
	

}
