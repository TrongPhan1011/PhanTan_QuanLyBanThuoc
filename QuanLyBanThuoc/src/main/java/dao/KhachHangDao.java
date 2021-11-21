package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;

import entity.KhachHang;

public interface KhachHangDao extends Remote {
	public boolean addKhachHang(KhachHang khachHang) throws RemoteException;
}
