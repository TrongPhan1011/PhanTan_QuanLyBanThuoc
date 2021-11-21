package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;

import entity.CTHD;

public interface CTHDDao extends Remote {
	public boolean addCTHD(CTHD cthd) throws RemoteException;
}
