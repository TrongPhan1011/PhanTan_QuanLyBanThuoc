package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.NuocSX;

public interface NuocSXDao extends Remote {
	public boolean addNSX(NuocSX nuocSX) throws RemoteException;
	public List<NuocSX> getAllNuocsc()throws RemoteException;
	public NuocSX getnuocsanxuat(String nuocSX) throws RemoteException;
}
