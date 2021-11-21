package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;

import entity.Thuoc;

public interface ThuocDao extends Remote {
	public boolean addThuoc(Thuoc thuoc) throws RemoteException;
}
