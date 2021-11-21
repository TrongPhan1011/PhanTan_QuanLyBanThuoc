package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;

import entity.HoaDon;

public interface HoaDonDao extends Remote {
	public boolean addHoaDon(HoaDon hoaDon) throws RemoteException;
}
