package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "dsNhanVien")
public class NhanVien {
	@Id
	private String maNhanVien;
	@Column(name = "ten_Nhan_Vien")
	private String tenNhanVien;
	@Column(name = "gioi_Tinh")
	private String gioiTinh;
	@Column(name = "ngay_Sinh")
	private Date ngaySinh;
	private String sdt;
	@Column(name = "dia_Chi")
	private String diaChi;
	private double luong;
	@Column(name = "trang_Thai_Lam_Viec")
	private String trangThaiLamViec;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private TaiKhoan taiKhoan;

}
