package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;

import entity.NhaCungCap;

public interface NhaCungCapDao extends Remote {
	public boolean addNCC(NhaCungCap nhaCungCap) throws RemoteException;
}
