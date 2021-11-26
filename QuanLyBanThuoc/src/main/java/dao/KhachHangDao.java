package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.KhachHang;
import entity.Thuoc;

public interface KhachHangDao extends Remote {
	public boolean addKhachHang(KhachHang khachHang) throws RemoteException;
	public KhachHang getKHTheoSDT(String sdt) throws RemoteException;
	public List<KhachHang> getAllKhachHang ()throws RemoteException;
}
