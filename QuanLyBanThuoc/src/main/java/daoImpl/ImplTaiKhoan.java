package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.hibernate.Transaction;
import org.hibernate.ogm.OgmSession;
import org.hibernate.ogm.OgmSessionFactory;

import dao.TaiKhoanDao;
import entity.TaiKhoan;
import util.HibernateUtil;

public class ImplTaiKhoan extends UnicastRemoteObject implements TaiKhoanDao {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5680460319162083507L;
	private OgmSessionFactory sessionFactory;

	public ImplTaiKhoan() throws RemoteException {
		sessionFactory = HibernateUtil.getInstance().getSessionFactory();
	}

	@Override
	public boolean addTaiKhoan(TaiKhoan taiKhoan) throws RemoteException {
		OgmSession session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		try {
			
			tr.begin();
			session.save(taiKhoan);

			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return false;
	}

}
