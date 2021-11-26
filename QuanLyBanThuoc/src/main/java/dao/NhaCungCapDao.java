package dao;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import entity.NhaCungCap;

public interface NhaCungCapDao extends Remote {
	public boolean addNCC(NhaCungCap nhaCungCap) throws RemoteException;
	public List<NhaCungCap> getAllnhacungcap() throws RemoteException;
	public NhaCungCap getnhacungcaptheoten(String nhaCungCap) throws RemoteException;
	public boolean updatediachi(NhaCungCap cap) throws RemoteException;
}
