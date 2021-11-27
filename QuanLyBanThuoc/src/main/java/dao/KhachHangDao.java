package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import entity.KhachHang;
import entity.NhanVien;
import entity.Thuoc;

public interface KhachHangDao extends Remote {
	public boolean addKhachHang(KhachHang khachHang) throws RemoteException;
	public KhachHang getKHTheoSDT(String sdt) throws RemoteException;

	public List<KhachHang> getAllKhachHang ()throws RemoteException;

	public boolean updateKhachHang(KhachHang khachHang) throws RemoteException;
	

}
