package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dao.TaiKhoanDao;

public class ImplTaiKhoan extends UnicastRemoteObject implements TaiKhoanDao {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5680460319162083507L;

	public ImplTaiKhoan() throws RemoteException {
	}

}
