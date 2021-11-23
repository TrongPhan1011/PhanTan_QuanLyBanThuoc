package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.NuocSXDao;
import entity.NuocSX;
import util.HibernateUtil;

public class ImplNuocSX extends UnicastRemoteObject implements NuocSXDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6359836878482532372L;
	private EntityManager em;
	public ImplNuocSX() throws RemoteException {
		em = HibernateUtil.getInstance().getEntityManager();
	}

	@Override
	public boolean addNSX(NuocSX nuocSX) throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			
			tr.begin();
			em.persist(nuocSX);

			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return false;
	}

}
