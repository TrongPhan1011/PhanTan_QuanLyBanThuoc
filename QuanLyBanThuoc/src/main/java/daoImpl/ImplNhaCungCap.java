package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

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
	
	
}
