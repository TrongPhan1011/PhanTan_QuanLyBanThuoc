package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.LoaiThuoc;

public interface LoaiThuocDao extends Remote {
	public boolean addLoaiThuoc(LoaiThuoc loaiThuoc) throws RemoteException;
	public List<LoaiThuoc>	 getAllLoaiThuoc() throws RemoteException;
	public LoaiThuoc getLoaiThuocTheoTen(String tenLoai) throws RemoteException;

	
}
