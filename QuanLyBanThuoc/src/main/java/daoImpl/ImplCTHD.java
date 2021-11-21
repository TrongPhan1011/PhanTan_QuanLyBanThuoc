package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.hibernate.Transaction;
import org.hibernate.ogm.OgmSession;
import org.hibernate.ogm.OgmSessionFactory;

import dao.CTHDDao;
import entity.CTHD;
import util.HibernateUtil;

public class ImplCTHD extends UnicastRemoteObject implements CTHDDao {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6341664070505503845L;

	
	private OgmSessionFactory  sessionFactory;
	
	public ImplCTHD() throws RemoteException{
		sessionFactory = HibernateUtil.getInstance().getSessionFactory();
	}
	

	@Override
	public boolean addCTHD(CTHD cthd) throws RemoteException {
		OgmSession session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		try {
			tr.begin();
			session.save(cthd);
			
			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		
		
		return false;
	}

}
