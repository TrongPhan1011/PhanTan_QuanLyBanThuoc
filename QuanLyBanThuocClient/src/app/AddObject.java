package app;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.Date;
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
//		
//		//Id của Trọng
//		CTHDDao cthdDao =  (CTHDDao) Naming.lookup("rmi://192.168.1.9:9999/cthdDao");
//		HoaDonDao hoaDonDao =  (HoaDonDao) Naming.lookup("rmi://192.168.1.9:9999/hoaDonDao");
//	    KhachHangDao khachHangDao = (KhachHangDao) Naming.lookup("rmi://192.168.1.9:9999/khachHangDao");
//		LoaiThuocDao loaiThuocDao =  (LoaiThuocDao) Naming.lookup("rmi://192.168.1.9:9999/loaiThuocDao");
//		NhaCungCapDao NCCDao =  (NhaCungCapDao) Naming.lookup("rmi://192.168.1.9:9999/nhaCungCapDao");
//		NhanVienDao nhanVienDao =  (NhanVienDao) Naming.lookup("rmi://192.168.1.9:9999/nhanVienDao");
//		NuocSXDao nuocSXDao =  (NuocSXDao) Naming.lookup("rmi://192.168.1.9:9999/nuocSXDao");
//		TaiKhoanDao tkDao =  (TaiKhoanDao) Naming.lookup("rmi://192.168.1.9:9999/taiKhoanDao");
//		ThuocDao thuocDao =  (ThuocDao) Naming.lookup("rmi://192.168.1.9:9999/thuocDao");
<<<<<<< HEAD
		
//		//Id của Thanh
		CTHDDao cthdDao =  (CTHDDao) Naming.lookup("rmi://192.168.1.8:9999/cthdDao");
		HoaDonDao hoaDonDao =  (HoaDonDao) Naming.lookup("rmi://192.168.1.8:9999/hoaDonDao");
	    KhachHangDao khachHangDao = (KhachHangDao) Naming.lookup("rmi://192.168.1.8:9999/khachHangDao");
		LoaiThuocDao loaiThuocDao =  (LoaiThuocDao) Naming.lookup("rmi://192.168.1.8:9999/loaiThuocDao");
		NhaCungCapDao NCCDao =  (NhaCungCapDao) Naming.lookup("rmi://192.168.1.8:9999/nhaCungCapDao");
		NhanVienDao nhanVienDao =  (NhanVienDao) Naming.lookup("rmi://192.168.1.8:9999/nhanVienDao");
		NuocSXDao nuocSXDao =  (NuocSXDao) Naming.lookup("rmi://192.168.1.8:9999/nuocSXDao");
		TaiKhoanDao tkDao =  (TaiKhoanDao) Naming.lookup("rmi://192.168.1.8:9999/taiKhoanDao");
		ThuocDao thuocDao =  (ThuocDao) Naming.lookup("rmi://192.168.1.8:9999/thuocDao");
=======
//		
//		//Id của Thanh
//		CTHDDao cthdDao =  (CTHDDao) Naming.lookup("rmi://192.168.1.8:9999/cthdDao");
//		HoaDonDao hoaDonDao =  (HoaDonDao) Naming.lookup("rmi://192.168.1.8:9999/hoaDonDao");
//	    KhachHangDao khachHangDao = (KhachHangDao) Naming.lookup("rmi://192.168.1.8:9999/khachHangDao");
//		LoaiThuocDao loaiThuocDao =  (LoaiThuocDao) Naming.lookup("rmi://192.168.1.8:9999/loaiThuocDao");
//		NhaCungCapDao NCCDao =  (NhaCungCapDao) Naming.lookup("rmi://192.168.1.8:9999/nhaCungCapDao");
//		NhanVienDao nhanVienDao =  (NhanVienDao) Naming.lookup("rmi://192.168.1.8:9999/nhanVienDao");
//		NuocSXDao nuocSXDao =  (NuocSXDao) Naming.lookup("rmi://192.168.1.8:9999/nuocSXDao");
//		TaiKhoanDao tkDao =  (TaiKhoanDao) Naming.lookup("rmi://192.168.1.8:9999/taiKhoanDao");
//		ThuocDao thuocDao =  (ThuocDao) Naming.lookup("rmi://192.168.1.8:9999/thuocDao");
		
		CTHDDao cthdDao = (CTHDDao) Naming.lookup("rmi://192.168.1.6:9999/cthdDao");
		HoaDonDao hoaDonDao = (HoaDonDao) Naming.lookup("rmi://192.168.1.6:9999/hoaDonDao");
		KhachHangDao khachHangDao = (KhachHangDao) Naming.lookup("rmi://192.168.1.6:9999/khachHangDao");
		LoaiThuocDao loaiThuocDao = (LoaiThuocDao) Naming.lookup("rmi://192.168.1.6:9999/loaiThuocDao");
		NhaCungCapDao NCCDao = (NhaCungCapDao) Naming.lookup("rmi://192.168.1.6:9999/nhaCungCapDao");
		NhanVienDao nhanVienDao = (NhanVienDao) Naming.lookup("rmi://192.168.1.6:9999/nhanVienDao");
		NuocSXDao nuocSXDao = (NuocSXDao) Naming.lookup("rmi://192.168.1.6:9999/nuocSXDao");
		TaiKhoanDao tkDao = (TaiKhoanDao) Naming.lookup("rmi://192.168.1.6:9999/taiKhoanDao");
		ThuocDao thuocDao = (ThuocDao) Naming.lookup("rmi://192.168.1.6:9999/thuocDao");
>>>>>>> c02bc1f8b54e5f4f3853e399d33ceb45b37dd3b2
//	
//
//	
////		//Test SK
////		List<LoaiThuoc> lsLT = loaiThuocDao.getAllLoaiThuoc();
////		for(LoaiThuoc lt : lsLT) {
////			
////			List<Thuoc> ls = thuocDao.getThuocTheoMaLoai(lt.getId());
////			System.out.println(ls);
////			LoaiThuoc lt1 = loaiThuocDao.getLoaiThuocTheoTen(lt.getTenLoai());
////			System.out.println(lt1);
////		}
////		
////		
////		//Thanh: Thêm nv-->TK --> mã tk == maNV -->Thanh
////		//		KH --> Thanh
//		NhanVien nv1 = new NhanVien("NV1", "Phạm Vũ Hoài An", "Nữ", new Date(2000-1900,4-1,20), "0966105479", "60 Thống Nhất, p10, Q.Gò Vấp","Quản lý", 5000000, "Đang làm việc", new TaiKhoan("NV1", "123"));
//		nhanVienDao.addNhanVien(nv1);
//		NhanVien nv2 = new NhanVien("NV2", "Nguyễn Tuấn Thanh", "Nam", new Date(2001-1900,5-1,20), "0374779028", "56 Đường số 4, p Hiệp Bình Phước, Q.Thủ Đức","Nhân viên bán hàng", 5000000, "Đang làm việc", new TaiKhoan("NV2", "123"));
//		nhanVienDao.addNhanVien(nv2);
//		
//		NhanVien nv3 = new NhanVien("NV3", "Phạm Thị Hoa", "Nữ", new Date(2000-1900,6-1,20), "0966712345", "170 Thống Nhất, p10, Q.Gò Vấp","Nhân viên bán hàng", 5000000, "Đã nghỉ việc", new TaiKhoan("NV3", "123"));
//		nhanVienDao.addNhanVien(nv3);
//		NhanVien nv4 = new NhanVien("NV4", "Phạm Vũ Hoài An", "Nữ", new Date(2000-1900,4-1,20), "0966105479", "60 Thống Nhất, p10, Q.Gò Vấp","Nhân viên bán hàng", 5000000, "Đang làm việc", new TaiKhoan("NV4", "123"));
//		nhanVienDao.addNhanVien(nv4);
//		
//		KhachHang kh1 = new KhachHang("Đoàn Phạm Bích Hợp", "Nữ", new Date(2001-1900,3-1,01), "0708985897");
//		khachHangDao.addKhachHang(kh1);
//		KhachHang kh2 = new KhachHang("Đoàn Thị Thủy", "Nữ", new Date(2001-1900,4-1,01), "0708985977");
//		khachHangDao.addKhachHang(kh2);
//		KhachHang kh3 = new KhachHang("Nguyễn Công Danh", "Nam", new Date(1999-1900,3-1,01), "0374479123");
//		khachHangDao.addKhachHang(kh3);
//
//	
//		
//		//tài : thuốc --> nsx, ncc, loại --> tài
//		//		hóa đơn --> CTHD --> tài
//		
//		LoaiThuoc lt1 = new LoaiThuoc("Thuốc kháng dị ứng");
//		NuocSX nsx1 = new NuocSX("Pháp");
//		NhaCungCap ncc1 = new NhaCungCap("Sanofi Aventis", "Xa lộ Hà Nội, Long Bình, Quận 9, Thành phố Hồ Chí Minh, Vietnam");
//		
//		Thuoc t1 = new Thuoc("Telfast HD 180mg ", 75000.00, 500, new Date(2020-1900,9-1,9), new Date(2022-1900,5-1,15), "Còn bán", lt1, nsx1 , ncc1 );
//		thuocDao.addThuoc(t1);
//		//loaithuoc
		LoaiThuoc lt1=new LoaiThuoc("Thuốc kháng dị ứng");
		LoaiThuoc lt2=new LoaiThuoc("Thuốc kháng viêm");
		LoaiThuoc lt3=new LoaiThuoc("Thuốc ngừa thai");
		LoaiThuoc lt4=new LoaiThuoc("Thuốc cảm lạnh");
		LoaiThuoc lt5=new LoaiThuoc("Thuốc da liễu");
		LoaiThuoc lt6=new LoaiThuoc("Thuốc giảm cân");
		LoaiThuoc lt7=new LoaiThuoc("Thuốc Mắt/Tai/Mũi");
		LoaiThuoc lt8=new LoaiThuoc("Thuốc tiêu hóa");
		LoaiThuoc lt9=new LoaiThuoc("Thuốc thần kinh");
		LoaiThuoc lt10=new LoaiThuoc("Giảm đau, hạ sốt");
		LoaiThuoc lt11=new LoaiThuoc("Dầu gió, dầu cù là...");
		LoaiThuoc lt12=new LoaiThuoc("Thuốc dành cho phụ nữ");
		LoaiThuoc lt13=new LoaiThuoc("Thuốc dành cho nam");
		LoaiThuoc lt14=new LoaiThuoc("Thuốc cơ xương khớp");
		LoaiThuoc lt15=new LoaiThuoc("Vitamin & Khoáng chất");
		LoaiThuoc lt16=new LoaiThuoc("Khác");
//	//addloaithuoc
		loaiThuocDao.addLoaiThuoc(lt4);
		loaiThuocDao.addLoaiThuoc(lt5);
		loaiThuocDao.addLoaiThuoc(lt6);
		loaiThuocDao.addLoaiThuoc(lt7);
		loaiThuocDao.addLoaiThuoc(lt8);
		loaiThuocDao.addLoaiThuoc(lt9);
		loaiThuocDao.addLoaiThuoc(lt10);
		loaiThuocDao.addLoaiThuoc(lt11);
		loaiThuocDao.addLoaiThuoc(lt12);
		loaiThuocDao.addLoaiThuoc(lt13);
		loaiThuocDao.addLoaiThuoc(lt14);
		loaiThuocDao.addLoaiThuoc(lt15);
		loaiThuocDao.addLoaiThuoc(lt16);
////		//nuoc san xuat
		NuocSX nsx1=new NuocSX("Pháp");
		NuocSX nsx2=new NuocSX("Việt Nam");
		NuocSX nsx3=new NuocSX("Hungary");
		NuocSX nsx4=new NuocSX("Đức");
		NuocSX nsx5=new NuocSX("Anh");
		NuocSX nsx6=new NuocSX("Nhật Bản");
		NuocSX nsx7=new NuocSX("Khác");
		nuocSXDao.addNSX(nsx4);
		nuocSXDao.addNSX(nsx5);
		nuocSXDao.addNSX(nsx6);
		nuocSXDao.addNSX(nsx7);
//		//nhacungcap
		NhaCungCap ncc1 = new NhaCungCap("Sanofi Aventis", "Xa lộ Hà Nội, Long Bình, Quận 9, Thành phố Hồ Chí Minh, Vietnam");
		NhaCungCap ncc2 = new NhaCungCap("Merap Group", "89 Trần Thiện Chánh, Phường 12, Quận 10, Thành phố Hồ Chí Minh, Vietnam");
		NhaCungCap ncc3 = new NhaCungCap("Gedeon Richter", "Budapest, Gyömrői út 19-21, 1103 Hungary");
		NhaCungCap ncc4 = new NhaCungCap("Engelhard", "Industriestraße 8, 85072 Eichstätt, Germany");
		NhaCungCap ncc5 = new NhaCungCap("Bidiphar", "67 Đ. Số 12, Phường 10, Gò Vấp, Thành phố Hồ Chí Minh, Vietnam");
		NhaCungCap ncc6 = new NhaCungCap("Pymepharco", "44 Đồng Nai, Phường 15, Quận 10, Thành phố Hồ Chí Minh, Vietnam");
		NhaCungCap ncc7 = new NhaCungCap("Rohto-Mentholatum", "Lầu 18 Phòng 1808, Trade Tower, 37 Đ. Tôn Đức Thắng, Bến Nghé, Quận 1, Thành phố Hồ Chí Minh, Vietnam");
		NhaCungCap ncc8 = new NhaCungCap("Janssen", "Room 1203, 12th Floor, Harbour View Tower 35 Nguyen Hue St. Ben Nghe Ward, District 1, HCMC, Bến Nghé, Quận 1, Thành phố Hồ Chí Minh, Vietnam");
		NhaCungCap ncc9 = new NhaCungCap("Tanganil", "23 Chemin de Penchenery, 81100 Castres, Pháp");
		NhaCungCap ncc10 = new NhaCungCap("Panadol", "New Frontiers Science Park, Third Ave, Harlow CM19 5AW, Vương quốc Anh");
		NhaCungCap ncc11= new NhaCungCap("Truong Son", "43/2 Hoà Bình, P. Tân Thới Hoà, Q. Tân Phú, TP. HCM, Việt Nam");
		NhaCungCap ncc12 = new NhaCungCap("Gynofar", "367 Nguyễn Trãi, P. Nguyễn Cư Trinh, Quận 1, TP. Hồ Chí Minh, Việt Nam");
		NhaCungCap ncc13 = new NhaCungCap("Danapha", "Lô 14 Đường số 8, Tân Tạo A, Bình Tân, TP. Hồ Chí Minh, Việt Nam");
		NhaCungCap ncc14 = new NhaCungCap("SPM", "Lô 51, Đường số 2, KCN Tân Tạo, Q.Bình Tân, TP.HCM, Việt Nam");
		NhaCungCap ncc15 = new NhaCungCap("BristolMyersSquibb", "3 Rue Joseph Monier, 92506 Rueil-Malmaison, Pháp");
		NCCDao.addNCC(ncc4);
		NCCDao.addNCC(ncc5);
		NCCDao.addNCC(ncc6);
		NCCDao.addNCC(ncc7);
		NCCDao.addNCC(ncc8);
		NCCDao.addNCC(ncc9);
		NCCDao.addNCC(ncc10);
		NCCDao.addNCC(ncc11);
		NCCDao.addNCC(ncc12);
		NCCDao.addNCC(ncc13);
		NCCDao.addNCC(ncc14);
		NCCDao.addNCC(ncc15);
//		//thuoc
		Thuoc t1 = new Thuoc("Telfast HD 180mg", 75000.00, 500, new Date(2020-9-9), new Date(2022-05-15), "Còn bán", lt1, nsx1 , ncc1 );
		Thuoc t2 = new Thuoc("Medoral (Chai 250ml) ", 85000.00, 30, new Date(2020-06-02), new Date(2022-06-16), "Còn bán", lt2, nsx2 , ncc2 );
		Thuoc t3 = new Thuoc("Postinor 1 1.5mg", 33000.00, 130, new Date(2021-01-9), new Date(2022-02-12), "Còn bán", lt3, nsx3 , ncc3 );
		thuocDao.addThuoc(t1);
		thuocDao.addThuoc(t2);
		thuocDao.addThuoc(t3);
		
		
<<<<<<< HEAD
		//LoaiThuoc lt = loaiThuocDao.getLoaiThuocTheoTen(lt2.getTenLoai());
		
//		Thuoc t4 = new Thuoc("Telfast HD 180mg", 75000.00, 500, new Date(2020-9-9), new Date(2022-05-15), "Còn bán", lt, nsx1 , ncc1 );
//		Thuoc t5 = new Thuoc("Telfast HD 140mg", 75000.00, 500, new Date(2020-9-9), new Date(2022-05-15), "Còn bán", lt, nsx1 , ncc1 );
//		
//		
//		System.out.println("before: \n"+t1.toString());
//		
//		t1.setLoaiThuoc(lt);
//		
//		thuocDao.updateThuoc(t1);
//		System.out.println("Update: \n"+t1.toString());
		
		
//		thuocDao.addThuoc(t4);
//		thuocDao.addThuoc(t5);
		
		
		
//		t1.setLoaiThuoc(lt12);
//		thuocDao.updateThuoc(t1);
		//Thuoc t2 = new Thuoc("Teladf", 75000.00, 500, new Date(2020-9-9), new Date(2022-05-15), "Còn bán", lt1, nsx1 , ncc1 );
		
//		HoaDon hd = new HoaDon(ngaylap, nhanvienlap, khachhang, listCTHD)
=======
		
		
>>>>>>> c02bc1f8b54e5f4f3853e399d33ceb45b37dd3b2
		

		
		
		

//		
	}
}
