package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import org.bson.types.ObjectId;

import entity.Thuoc;

public interface ThuocDao extends Remote {
	public boolean addThuoc(Thuoc thuoc) throws RemoteException;
	public List<Thuoc> getThuocTheoMaLoai(ObjectId maLoai) throws RemoteException;
	public Thuoc getThuocTheoTenVaMaLoai(String tenThuoc,ObjectId maLoai) throws RemoteException;
	
}
