package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.NuocSXDao;
import entity.NhaCungCap;
import entity.NuocSX;
import entity.Thuoc;
import util.HibernateUtil;

public class ImplNuocSX extends UnicastRemoteObject implements NuocSXDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6359836878482532372L;
	private EntityManager em;
	public ImplNuocSX() throws RemoteException {
		em = HibernateUtil.getInstance().getEntityManager();
	}

	@Override
	public boolean addNSX(NuocSX nuocSX) throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			
			tr.begin();
			em.persist(nuocSX);

			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return false;
	}

	@Override
	public List<NuocSX> getAllNuocsc() throws RemoteException {
		// TODO Auto-generated method stub
		EntityTransaction tr=em.getTransaction();
		try {
			tr.begin();
			String query="db.dsNuocSX.find({})";
			List<NuocSX>ls=em.createNativeQuery(query,NuocSX.class).getResultList();
			tr.commit();
			return ls;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	@Override
	public NuocSX getnuocsanxuat(String nuocSX) throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			
			NuocSX nsx =  (NuocSX) em.createNativeQuery("db.dsNuocSX.find({'ten_NuocSX': '"+nuocSX+"'})",NuocSX.class).getSingleResult();
			
		
			tr.commit();
			return nsx;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return null;
	}

}
