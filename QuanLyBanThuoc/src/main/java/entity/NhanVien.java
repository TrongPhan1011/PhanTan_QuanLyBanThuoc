package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.bson.types.ObjectId;

@Entity
@Table(name = "dsNhanVien")
public class NhanVien implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6735862733378529418L;
	@Id
	private ObjectId id;
	@Column(name = "so_NhanVien")
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
	@Column(name = "taiKhoan_Id")
	private TaiKhoan taiKhoan;

	public String getMaNhanVien() {
		return maNhanVien;
	}

	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public double getLuong() {
		return luong;
	}

	public void setLuong(double luong) {
		this.luong = luong;
	}

	public String getTrangThaiLamViec() {
		return trangThaiLamViec;
	}

	public void setTrangThaiLamViec(String trangThaiLamViec) {
		this.trangThaiLamViec = trangThaiLamViec;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public ObjectId getId() {
		return id;
	}

	public NhanVien(ObjectId id, String maNhanVien, String tenNhanVien, String gioiTinh, Date ngaySinh, String sdt,
			String diaChi, double luong, String trangThaiLamViec, TaiKhoan taiKhoan) {
		super();
		this.id = id;
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.sdt = sdt;
		this.diaChi = diaChi;
		this.luong = luong;
		this.trangThaiLamViec = trangThaiLamViec;
		this.taiKhoan = taiKhoan;
	}

	public NhanVien(String maNhanVien, String tenNhanVien, String gioiTinh, Date ngaySinh, String sdt, String diaChi,
			double luong, String trangThaiLamViec, TaiKhoan taiKhoan) {
		super();
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.sdt = sdt;
		this.diaChi = diaChi;
		this.luong = luong;
		this.trangThaiLamViec = trangThaiLamViec;
		this.taiKhoan = taiKhoan;
	}

	public NhanVien() {
		super();
	}

	@Override
	public String toString() {
		return "NhanVien [id=" + id + ", maNhanVien=" + maNhanVien + ", tenNhanVien=" + tenNhanVien + ", gioiTinh="
				+ gioiTinh + ", ngaySinh=" + ngaySinh + ", sdt=" + sdt + ", diaChi=" + diaChi + ", luong=" + luong
				+ ", trangThaiLamViec=" + trangThaiLamViec + ", taiKhoan=" + taiKhoan + "]";
	}
	
	

}
