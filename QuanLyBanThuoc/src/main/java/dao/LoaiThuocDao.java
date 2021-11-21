package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;

import entity.HoaDon;
import entity.LoaiThuoc;

public interface LoaiThuocDao extends Remote {
	public boolean addLoaiThuoc(LoaiThuoc loaiThuoc) throws RemoteException;
	
}
