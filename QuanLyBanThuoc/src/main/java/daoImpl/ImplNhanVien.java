package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.NhanVienDao;
import entity.NhanVien;
import util.HibernateUtil;

public class ImplNhanVien extends UnicastRemoteObject implements NhanVienDao {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -208819529374076682L;
	private EntityManager em;

	public ImplNhanVien() throws RemoteException {
		em = HibernateUtil.getInstance().getEntityManager();
	}

	@Override
	public boolean addNhanVien(NhanVien nhanVien) throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		
		try {
			tr.begin();
				em.persist(nhanVien);
			
			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		
		return false;
	}
	

}
