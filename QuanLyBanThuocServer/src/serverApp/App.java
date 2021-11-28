package serverApp;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import javax.naming.NamingException;

import dao.CTHDDao;
import dao.HoaDonDao;
import dao.KhachHangDao;
import dao.LoaiThuocDao;
import dao.NhaCungCapDao;
import dao.NhanVienDao;
import dao.NuocSXDao;
import dao.TaiKhoanDao;
import dao.ThuocDao;
import daoImpl.ImplCTHD;
import daoImpl.ImplHoaDon;
import daoImpl.ImplKhachHang;
import daoImpl.ImplLoaiThuoc;
import daoImpl.ImplNhaCungCap;
import daoImpl.ImplNhanVien;
import daoImpl.ImplNuocSX;
import daoImpl.ImplTaiKhoan;
import daoImpl.ImplThuoc;



public class App {
	public static void main(String[] args) throws RemoteException, NamingException {
		SecurityManager securityManager = System.getSecurityManager();
		if(securityManager == null) {
			System.setProperty("java.security.policy","rmi/quanLyBanThuoc.policy");
			System.setSecurityManager(new SecurityManager());
		}
		
		
		
		try {
			LocateRegistry.createRegistry(9999);
			CTHDDao cthdDao = new ImplCTHD();
			HoaDonDao hoaDonDao = new ImplHoaDon();
			KhachHangDao khachHangDao = new ImplKhachHang();
			LoaiThuocDao loaiThuocDao = new ImplLoaiThuoc();
			NhaCungCapDao nhaCungCapDao = new ImplNhaCungCap();
			NhanVienDao nhanVienDao = new ImplNhanVien();
			NuocSXDao nuocSXDao = new ImplNuocSX();
			TaiKhoanDao taiKhoanDao = new ImplTaiKhoan();
			ThuocDao thuocDao = new ImplThuoc();
			
			String ip ="";
			try {
				ip = InetAddress.getLocalHost().getHostAddress();
			} catch (UnknownHostException e1) {
				e1.printStackTrace();
			}
			
			Naming.bind("rmi://"+ip+":9999/cthdDao", cthdDao);
			Naming.bind("rmi://"+ip+":9999/hoaDonDao", hoaDonDao);
			Naming.bind("rmi://"+ip+":9999/khachHangDao", khachHangDao);
			Naming.bind("rmi://"+ip+":9999/loaiThuocDao", loaiThuocDao);
			Naming.bind("rmi://"+ip+":9999/nhaCungCapDao", nhaCungCapDao);
			Naming.bind("rmi://"+ip+":9999/nhanVienDao", nhanVienDao);
			Naming.bind("rmi://"+ip+":9999/nuocSXDao", nuocSXDao);
			Naming.bind("rmi://"+ip+":9999/taiKhoanDao", taiKhoanDao);
			Naming.bind("rmi://"+ip+":9999/thuocDao", thuocDao);
			
			
			
			System.out.println("Ready...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
