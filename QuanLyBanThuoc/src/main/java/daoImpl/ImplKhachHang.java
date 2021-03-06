package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.KhachHangDao;
import entity.KhachHang;
import util.HibernateUtil;

public class ImplKhachHang extends UnicastRemoteObject implements KhachHangDao {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6664970320028235951L;
	private EntityManager em;

	public ImplKhachHang() throws RemoteException {
		em = HibernateUtil.getInstance().getEntityManager();
	}

	@Override
	public boolean addKhachHang(KhachHang khachHang) throws RemoteException {

		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(khachHang);
			
			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return false;
	}

	@Override
	public KhachHang getKHTheoSDT(String sdt) throws RemoteException {
		
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();

			KhachHang kh  = (KhachHang) em.createNativeQuery("db.dsKhachHang.find({'sdt' : '"+sdt+"'})",KhachHang.class).getSingleResult();
		

//				KhachHang kh  = (KhachHang) em.createNativeQuery("db.dsKhachHang.findOne({'sdt' : '"+sdt+"'})",KhachHang.class).getSingleResult();

			tr.commit();
			
			return kh;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		
		return null;
	}

	@Override

	public List<KhachHang> getAllKhachHang() throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			@SuppressWarnings("unchecked")
			List<KhachHang> kh =  em.createNativeQuery("db.dsKhachHang.find({})",KhachHang.class).getResultList();
			
		
			tr.commit();
			return kh;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		
		return null;
	}

	public boolean updateKhachHang(KhachHang khachHang) throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(khachHang);
			
			tr.commit();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}

		return false;

	}


}
