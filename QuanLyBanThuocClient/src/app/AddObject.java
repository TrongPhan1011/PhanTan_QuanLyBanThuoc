package app;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Date;

import dao.CTHDDao;
import dao.HoaDonDao;
import dao.KhachHangDao;
import dao.LoaiThuocDao;
import dao.NhaCungCapDao;
import dao.NhanVienDao;
import dao.NuocSXDao;
import dao.TaiKhoanDao;
import dao.ThuocDao;
import entity.KhachHang;
import entity.LoaiThuoc;
import entity.NhaCungCap;
import entity.NhanVien;
import entity.NuocSX;
import entity.TaiKhoan;
import entity.Thuoc;

public class AddObject {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		SecurityManager securityManager = System.getSecurityManager();
		if(securityManager == null) {
			System.setProperty("java.security.policy","rmi/quanLyBanThuoc.policy");
			System.setSecurityManager(new SecurityManager());
		}
		
//		CTHDDao cthdDao =  (CTHDDao) Naming.lookup("rmi://192.168.1.9:9999/cthdDao");
//		HoaDonDao hoaDonDao =  (HoaDonDao) Naming.lookup("rmi://192.168.1.9:9999/hoaDonDao");
//	    KhachHangDao khachHangDao = (KhachHangDao) Naming.lookup("rmi://192.168.1.9:9999/khachHangDao");
//		LoaiThuocDao loaiThuocDao =  (LoaiThuocDao) Naming.lookup("rmi://192.168.1.9:9999/loaiThuocDao");
//		NhaCungCapDao NCCDao =  (NhaCungCapDao) Naming.lookup("rmi://192.168.1.9:9999/nhaCungCapDao");
//		NhanVienDao nhanVienDao =  (NhanVienDao) Naming.lookup("rmi://192.168.1.9:9999/nhanVienDao");
//		NuocSXDao nuocSXDao =  (NuocSXDao) Naming.lookup("rmi://192.168.1.9:9999/nuocSXDao");
//		TaiKhoanDao tkDao =  (TaiKhoanDao) Naming.lookup("rmi://192.168.1.9:9999/taiKhoanDao");
//		ThuocDao thuocDao =  (ThuocDao) Naming.lookup("rmi://192.168.1.9:9999/thuocDao");
		
		//Thanh
		CTHDDao cthdDao =  (CTHDDao) Naming.lookup("rmi://192.168.1.8:9999/cthdDao");
		HoaDonDao hoaDonDao =  (HoaDonDao) Naming.lookup("rmi://192.168.1.8:9999/hoaDonDao");
	    KhachHangDao khachHangDao = (KhachHangDao) Naming.lookup("rmi://192.168.1.8:9999/khachHangDao");
		LoaiThuocDao loaiThuocDao =  (LoaiThuocDao) Naming.lookup("rmi://192.168.1.8:9999/loaiThuocDao");
		NhaCungCapDao NCCDao =  (NhaCungCapDao) Naming.lookup("rmi://192.1192.168.1.868.1.9:9999/nhaCungCapDao");
		NhanVienDao nhanVienDao =  (NhanVienDao) Naming.lookup("rmi://192.168.1.8:9999/nhanVienDao");
		NuocSXDao nuocSXDao =  (NuocSXDao) Naming.lookup("rmi://192.168.1.8:9999/nuocSXDao");
		TaiKhoanDao tkDao =  (TaiKhoanDao) Naming.lookup("rmi://192.168.1.8:9999/taiKhoanDao");
		ThuocDao thuocDao =  (ThuocDao) Naming.lookup("rmi://192.168.1.8:9999/thuocDao");
		
		NhanVien nv1 = new NhanVien("NV1", "Phạm Vũ Hoài An", "Nữ", new Date(2000-1900,4-1,20), "0966105479", "60 Thống Nhất, p10, Q.Gò Vấp","Nhân viên bán hàng", 5000000, "Đang lam viec", new TaiKhoan("NV1", "123"));
		nhanVienDao.addNhanVien(nv1);
		NhanVien nv2 = new NhanVien("NV2", "Nguyễn Tuấn Thanh", "Nam", new Date(2001-1900,5-1,20), "0374779028", "56 Đường số 4, p Hiệp Bình Phước, Q.Thủ Đức","Nhân viên bán hàng", 5000000, "Đang lam viec", new TaiKhoan("NV2", "123"));
		nhanVienDao.addNhanVien(nv2);
		
		NhanVien nv3 = new NhanVien("NV3", "Phạm Thị Hoa", "Nữ", new Date(2000-1900,6-1,20), "0966712345", "170 Thống Nhất, p10, Q.Gò Vấp","Nhân viên bán hàng", 5000000, "Nghi viec", new TaiKhoan("NV3", "123"));
		nhanVienDao.addNhanVien(nv3);
		
		KhachHang kh1 = new KhachHang("Đoàn Phạm Bích Hợp", "Nữ", new Date(2001-1900,3-1,01), "0708985897");
		khachHangDao.addKhachHang(kh1);
		KhachHang kh2 = new KhachHang("Đoàn Thị Thủy", "Nữ", new Date(2001-1900,4-1,01), "0708985977");
		khachHangDao.addKhachHang(kh2);
		KhachHang kh3 = new KhachHang("Nguyễn Công Danh", "Nam", new Date(1999-1900,3-1,01), "0374479123");
		khachHangDao.addKhachHang(kh3);
	
		LoaiThuoc lt1 = new LoaiThuoc("Thuốc kháng dị ứng");
		NuocSX nsx1 = new NuocSX("Pháp");
		NhaCungCap ncc1 = new NhaCungCap("Sanofi Aventis", "Xa lộ Hà Nội, Long Bình, Quận 9, Thành phố Hồ Chí Minh, Vietnam");
		
		Thuoc t1 = new Thuoc("Telfast HD 180mg ", 75000.00, 500, new Date(2020-1900,9-1,9), new Date(2022-1900,5-1,15), "Còn bán", lt1, nsx1 , ncc1 );
		thuocDao.addThuoc(t1);
		
		//tài : thuốc --> nsx, ncc, loại --> tài
		//		hóa đơn --> CTHD --> tài
		
		
		
		
		//Thanh: Thêm nv-->TK --> mã tk == maNV -->Thanh
		//		KH --> Thanh

		
		
		

		
	}
}
