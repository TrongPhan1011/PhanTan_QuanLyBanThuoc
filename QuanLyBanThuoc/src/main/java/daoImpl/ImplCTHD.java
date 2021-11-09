package daoImpl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import dao.CTHDDao;

public class ImplCTHD extends UnicastRemoteObject implements CTHDDao {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6341664070505503845L;

	public ImplCTHD() throws RemoteException{
	}

}
