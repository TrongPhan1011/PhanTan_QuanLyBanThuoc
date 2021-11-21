package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.hibernate.Transaction;
import org.hibernate.ogm.OgmSession;
import org.hibernate.ogm.OgmSessionFactory;

import dao.KhachHangDao;
import entity.KhachHang;
import util.HibernateUtil;

public class ImplKhachHang extends UnicastRemoteObject implements KhachHangDao {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6664970320028235951L;
	private OgmSessionFactory sessionFactory;

	public ImplKhachHang() throws RemoteException {
		sessionFactory = HibernateUtil.getInstance().getSessionFactory();
	}

	@Override
	public boolean addKhachHang(KhachHang khachHang) throws RemoteException {

		OgmSession session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		try {
			tr.begin();
			session.save(khachHang);
			
			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return false;
	}
}
