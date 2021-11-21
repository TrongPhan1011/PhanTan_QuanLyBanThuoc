package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;

import entity.NuocSX;

public interface NuocSXDao extends Remote {
	public boolean addNSX(NuocSX nuocSX) throws RemoteException;
}
