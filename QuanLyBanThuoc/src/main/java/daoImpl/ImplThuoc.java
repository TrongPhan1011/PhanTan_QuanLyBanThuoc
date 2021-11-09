package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dao.ThuocDao;

public class ImplThuoc  extends UnicastRemoteObject implements ThuocDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3692853915209401270L;
	public ImplThuoc() throws RemoteException {
	}

}
