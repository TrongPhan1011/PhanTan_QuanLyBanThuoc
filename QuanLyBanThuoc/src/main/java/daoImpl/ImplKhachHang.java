package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

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
				KhachHang kh  = (KhachHang) em.createNativeQuery("db.dsKhachHang.findOne({'sdt' : '"+sdt+"'})",KhachHang.class).getSingleResult();
			tr.commit();
			
			return kh;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		
		return null;
	}

	@Override
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
