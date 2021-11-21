package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.hibernate.Transaction;
import org.hibernate.ogm.OgmSession;
import org.hibernate.ogm.OgmSessionFactory;

import dao.ThuocDao;
import entity.Thuoc;
import util.HibernateUtil;

public class ImplThuoc  extends UnicastRemoteObject implements ThuocDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3692853915209401270L;
	private OgmSessionFactory sessionFactory;
	public ImplThuoc() throws RemoteException {
		sessionFactory = HibernateUtil.getInstance().getSessionFactory();
	}
	@Override
	public boolean addThuoc(Thuoc thuoc) throws RemoteException {
		OgmSession session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		try {
			
			tr.begin();
			session.save(thuoc);

			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return false;
	}

}
