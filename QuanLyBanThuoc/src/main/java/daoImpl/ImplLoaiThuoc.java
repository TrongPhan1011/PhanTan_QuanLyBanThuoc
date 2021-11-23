package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import dao.LoaiThuocDao;
import entity.LoaiThuoc;
import util.HibernateUtil;

public  class ImplLoaiThuoc extends UnicastRemoteObject implements LoaiThuocDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7629041601287634790L;
	private EntityManager em;
	public ImplLoaiThuoc() throws RemoteException {
		em = HibernateUtil.getInstance().getEntityManager();
	}
	@Override
	public boolean addLoaiThuoc(LoaiThuoc loaiThuoc) throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(loaiThuoc);
			
			tr.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		
		return false;
	}
	
	@Override
	public List<LoaiThuoc> getAllLoaiThuoc() throws RemoteException {

		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			@SuppressWarnings("unchecked")
			List<LoaiThuoc> ls =  em.createNativeQuery("db.dsLoaiThuoc.find({})",LoaiThuoc.class).getResultList();
			
		
			tr.commit();
			return ls;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		
		return null;
	}
	@Override
	public LoaiThuoc getLoaiThuocTheoTen(String tenLoai) throws RemoteException {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			
			LoaiThuoc lt =  (LoaiThuoc) em.createNativeQuery("db.dsLoaiThuoc.find({'ten_Loai_Thuoc': '"+tenLoai+"'})",LoaiThuoc.class).getSingleResult();
			
		
			tr.commit();
			return lt;
		} catch (Exception e) {
			e.printStackTrace();
			tr.rollback();
		}
		return null;
	}


}
