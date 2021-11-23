package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

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
			em.persist(hoaDon);
			
			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		
		return false;
	}
	
	

}
