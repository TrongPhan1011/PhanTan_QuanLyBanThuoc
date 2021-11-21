package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.hibernate.Transaction;
import org.hibernate.ogm.OgmSession;
import org.hibernate.ogm.OgmSessionFactory;

import dao.NhaCungCapDao;
import entity.NhaCungCap;
import util.HibernateUtil;

public class ImplNhaCungCap extends UnicastRemoteObject implements NhaCungCapDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8013774533281096789L;
	private OgmSessionFactory sessionFactory;
	public ImplNhaCungCap()  throws RemoteException {
		sessionFactory = HibernateUtil.getInstance().getSessionFactory();
	}
	@Override
	public boolean addNCC(NhaCungCap nhaCungCap) throws RemoteException {

		OgmSession session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		try {
			tr.begin();
				session.save(nhaCungCap);
			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return false;
	}
	
	
}
