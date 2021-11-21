package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.hibernate.Transaction;
import org.hibernate.ogm.OgmSession;
import org.hibernate.ogm.OgmSessionFactory;

import dao.HoaDonDao;
import entity.HoaDon;
import util.HibernateUtil;

public class ImplHoaDon extends UnicastRemoteObject implements HoaDonDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6500597230454124721L;
	private OgmSessionFactory sessionFactory;
	public ImplHoaDon() throws RemoteException {
		sessionFactory = HibernateUtil.getInstance().getSessionFactory();
		
	}
	@Override
	public boolean addHoaDon(HoaDon hoaDon) throws RemoteException {
		OgmSession session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		try {
			tr.begin();
			session.save(hoaDon);
			
			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		
		return false;
	}
	
	
	public boolean themHoaDon(HoaDon hoaDon) throws RemoteException {
		OgmSession session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		try {
			tr.begin();
			session.save(hoaDon);
			
			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		
		return false;
	}
	
	

}
