package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dao.HoaDonDao;

public class ImplHoaDon extends UnicastRemoteObject implements HoaDonDao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6500597230454124721L;
	public ImplHoaDon() throws RemoteException {
	}

}
