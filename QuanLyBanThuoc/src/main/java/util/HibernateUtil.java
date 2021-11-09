package util;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.ogm.OgmSessionFactory;
import org.hibernate.ogm.boot.OgmSessionFactoryBuilder;
import org.hibernate.ogm.cfg.OgmProperties;
import org.hibernate.service.ServiceRegistry;

import entity.CTHD;
import entity.HoaDon;
import entity.KhachHang;
import entity.LoaiThuoc;
import entity.NhaCungCap;
import entity.NhanVien;
import entity.NuocSX;
import entity.TaiKhoan;
import entity.Thuoc;

public class HibernateUtil {
	private static HibernateUtil instance;
	private OgmSessionFactory sessionFactory;
	
	private HibernateUtil() {
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySetting(OgmProperties.ENABLED, true)
				.configure("hibernate.cfg.xml")
				.build();
		Metadata metadata = new MetadataSources(serviceRegistry)
				.addAnnotatedClass(CTHD.class)
				.addAnnotatedClass(HoaDon.class)
				.addAnnotatedClass(KhachHang.class)
				.addAnnotatedClass(LoaiThuoc.class)
				.addAnnotatedClass(KhachHang.class)
				.addAnnotatedClass(NhaCungCap.class)
				.addAnnotatedClass(NhanVien.class)
				.addAnnotatedClass(TaiKhoan.class)
				.addAnnotatedClass(NuocSX.class)
				.addAnnotatedClass(Thuoc.class)
				.getMetadataBuilder()
				.build();
		sessionFactory = metadata.getSessionFactoryBuilder()
				.unwrap(OgmSessionFactoryBuilder.class)
				.build();
	}
	public synchronized static HibernateUtil getInstance() {
		if(instance == null) {
			instance = new HibernateUtil();
		}
			
		return instance;
		
	}
	
	public OgmSessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
}
