package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.CTHDDao;
import entity.CTHD;
import util.HibernateUtil;

public class ImplCTHD extends UnicastRemoteObject implements CTHDDao {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6341664070505503845L;


	private EntityManager em;
	
	public ImplCTHD() throws RemoteException{
	
		em = HibernateUtil.getInstance().getEntityManager();
		
	}
	

	@Override
	public boolean addCTHD(CTHD cthd) throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
				em.persist(cthd);
			
			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		
		
		return false;
	}

}
