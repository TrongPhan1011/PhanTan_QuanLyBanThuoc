package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dao.KhachHangDao;

public class ImplKhachHang extends UnicastRemoteObject implements KhachHangDao {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6664970320028235951L;

	public ImplKhachHang() throws RemoteException {
	}
}
