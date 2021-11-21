package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.hibernate.Transaction;
import org.hibernate.ogm.OgmSession;
import org.hibernate.ogm.OgmSessionFactory;

import dao.NuocSXDao;
import entity.NuocSX;
import util.HibernateUtil;

public class ImplNuocSX extends UnicastRemoteObject implements NuocSXDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6359836878482532372L;
	private OgmSessionFactory sessionFactory;
	public ImplNuocSX() throws RemoteException {
		sessionFactory = HibernateUtil.getInstance().getSessionFactory();
	}

	@Override
	public boolean addNSX(NuocSX nuocSX) throws RemoteException {
		OgmSession session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		try {
			
			tr.begin();
			session.save(nuocSX);

			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return false;
	}

}
