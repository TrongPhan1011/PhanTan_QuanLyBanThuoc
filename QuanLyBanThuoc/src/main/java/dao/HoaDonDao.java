package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.List;

import entity.HoaDon;

public interface HoaDonDao extends Remote {
	public boolean addHoaDon(HoaDon hoaDon) throws RemoteException;
	public List<HoaDon> getHoaDonTheoNgay(Date ngayDen, Date ngayKT) throws RemoteException;
}
