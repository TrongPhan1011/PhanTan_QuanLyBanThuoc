package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;

import entity.CTHD;
import entity.TaiKhoan;

public interface TaiKhoanDao extends Remote {
	public boolean addTaiKhoan(TaiKhoan taiKhoan) throws RemoteException;
}
