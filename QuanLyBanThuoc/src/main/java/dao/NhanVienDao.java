package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;

import entity.NhanVien;

public interface NhanVienDao extends Remote {
	public boolean addNhanVien(NhanVien nhanVien) throws RemoteException;
}
