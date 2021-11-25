package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.NhaCungCapDao;
import entity.NhaCungCap;
import util.HibernateUtil;

public class ImplNhaCungCap extends UnicastRemoteObject implements NhaCungCapDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8013774533281096789L;
	private EntityManager em;
	public ImplNhaCungCap()  throws RemoteException {
		em = HibernateUtil.getInstance().getEntityManager();
	}
	@Override
	public boolean addNCC(NhaCungCap nhaCungCap) throws RemoteException {

		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
				em.persist(nhaCungCap);
			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return false;
	}
	@Override
	public List<NhaCungCap> getAllnhacungcap() throws RemoteException {

		EntityTransaction tr = em.getTransaction();
		try {
			
			tr.begin();
			
			@SuppressWarnings("unchecked")
			List<NhaCungCap>ls = em.createNativeQuery("db.dsNCC.find({})",NhaCungCap.class).getResultList();
			
			tr.commit();
			return ls ;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return null;
	}
	
	
}
