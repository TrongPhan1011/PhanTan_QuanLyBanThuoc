package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.hibernate.Transaction;
import org.hibernate.ogm.OgmSession;
import org.hibernate.ogm.OgmSessionFactory;

import dao.LoaiThuocDao;
import entity.LoaiThuoc;
import util.HibernateUtil;

public class ImplLoaiThuoc extends UnicastRemoteObject implements LoaiThuocDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7629041601287634790L;
	private OgmSessionFactory sessionFactory;
	public ImplLoaiThuoc() throws RemoteException {
		sessionFactory = HibernateUtil.getInstance().getSessionFactory();
	}
	@Override
	public boolean addLoaiThuoc(LoaiThuoc loaiThuoc) throws RemoteException {
		OgmSession session = sessionFactory.getCurrentSession();
		Transaction tr = session.getTransaction();
		try {
			tr.begin();
			session.save(loaiThuoc);
			
			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		
		return false;
	}

}
