package app;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

import dao.CTHDDao;
import dao.HoaDonDao;
import dao.KhachHangDao;
import dao.LoaiThuocDao;
import dao.NhaCungCapDao;
import dao.NhanVienDao;
import dao.NuocSXDao;
import dao.TaiKhoanDao;
import dao.ThuocDao;
import entity.LoaiThuoc;

import entity.Thuoc;

public class AddObject {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		SecurityManager securityManager = System.getSecurityManager();
		if(securityManager == null) {
			System.setProperty("java.security.policy","rmi/quanLyBanThuoc.policy");
			System.setSecurityManager(new SecurityManager());
		}
		
		CTHDDao cthdDao =  (CTHDDao) Naming.lookup("rmi://192.168.1.9:9999/cthdDao");
		HoaDonDao hoaDonDao =  (HoaDonDao) Naming.lookup("rmi://192.168.1.9:9999/hoaDonDao");
	    KhachHangDao khachHangDao = (KhachHangDao) Naming.lookup("rmi://192.168.1.9:9999/khachHangDao");
		LoaiThuocDao loaiThuocDao =  (LoaiThuocDao) Naming.lookup("rmi://192.168.1.9:9999/loaiThuocDao");
		NhaCungCapDao NCCDao =  (NhaCungCapDao) Naming.lookup("rmi://192.168.1.9:9999/nhaCungCapDao");
		NhanVienDao nhanVienDao =  (NhanVienDao) Naming.lookup("rmi://192.168.1.9:9999/nhanVienDao");
		NuocSXDao nuocSXDao =  (NuocSXDao) Naming.lookup("rmi://192.168.1.9:9999/nuocSXDao");
		TaiKhoanDao tkDao =  (TaiKhoanDao) Naming.lookup("rmi://192.168.1.9:9999/taiKhoanDao");
		ThuocDao thuocDao =  (ThuocDao) Naming.lookup("rmi://192.168.1.9:9999/thuocDao");
		
//		NhanVien nv1 = new NhanVien("NV1", "Phạm Vũ Hoài An", "Nữ", new Date(2000-1900,4-1,20), "0966105479", "60 Thống Nhất, p10, Q.Gò Vấp","Nhân viên bán hàng", 5000000, "Đang lam viec", new TaiKhoan("NV1", "123"));
//		nhanVienDao.addNhanVien(nv1);
//		
//		KhachHang kh1 = new KhachHang("Đoàn Phạm Bích Hợp", "Nữ", new Date(2001-1900,3-1,01), "0708985897");
//		khachHangDao.addKhachHang(kh1);
//		
//	
//		LoaiThuoc lt1 = new LoaiThuoc("Thuốc kháng dị ứng");
//		NuocSX nsx1 = new NuocSX("Pháp");
//		NhaCungCap ncc1 = new NhaCungCap("Sanofi Aventis", "Xa lộ Hà Nội, Long Bình, Quận 9, Thành phố Hồ Chí Minh, Vietnam");
//		
//		Thuoc t1 = new Thuoc("Telfast HD 180mg ", 75000.00, 500, new Date(2020-1900,9-1,9), new Date(2022-1900,5-1,15), "Còn bán", lt1, nsx1 , ncc1 );
//		thuocDao.addThuoc(t1);
//		
//		
		List<LoaiThuoc> lsLT = loaiThuocDao.getAllLoaiThuoc();
		for(LoaiThuoc lt : lsLT) {
			
			List<Thuoc> ls = thuocDao.getThuocTheoMaLoai(lt.getId());
			System.out.println(ls);
			LoaiThuoc lt1 = loaiThuocDao.getLoaiThuocTheoTen(lt.getTenLoai());
			System.out.println(lt1);
		}
		
		
	
		
		//tài : thuốc --> nsx, ncc, loại --> tài
		//		hóa đơn --> CTHD --> tài
		
		
		
		
		//Thanh: Thêm nv-->TK --> mã tk == maNV -->Thanh
		//		KH --> Thanh

		
		
		

		
	}
}
