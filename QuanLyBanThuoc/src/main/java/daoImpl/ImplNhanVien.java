package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.hibernate.Transaction;
import org.hibernate.ogm.OgmSession;
import org.hibernate.ogm.OgmSessionFactory;

import dao.NhanVienDao;
import entity.NhanVien;
import util.HibernateUtil;

public class ImplNhanVien extends UnicastRemoteObject implements NhanVienDao {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -208819529374076682L;
	private OgmSessionFactory sessionFactory;

	public ImplNhanVien() throws RemoteException {
		sessionFactory = HibernateUtil.getInstance().getSessionFactory();
	}

	@Override
	public boolean addNhanVien(NhanVien nhanVien) throws RemoteException {
		OgmSession session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		
		try {
			tr.begin();
				session.save(nhanVien);
			
			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		
		return false;
	}
	

}
