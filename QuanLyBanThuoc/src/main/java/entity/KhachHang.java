package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.bson.types.ObjectId;

@Entity
@Table(name ="dsKhachHang")
public class KhachHang implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 336216348033772704L;
	@Id
	private ObjectId id;
	@Column(name = "ten_Khach_Hang")
	private String tenKhachHang;
	@Column(name = "gioi_Tinh")
	private String gioiTinh;
	@Column(name = "ngay_Sinh")
	private Date ngaySinh;
	private String sdt;
	public String getTenKhachHang() {
		return tenKhachHang;
	}
	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
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
	public ObjectId getId() {
		return id;
	}
	
	public KhachHang(ObjectId id, String tenKhachHang, String gioiTinh, Date ngaySinh, String sdt) {
		super();
		this.id = id;
		this.tenKhachHang = tenKhachHang;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.sdt = sdt;
	}
	
	public KhachHang(String tenKhachHang, String gioiTinh, Date ngaySinh, String sdt) {
		super();
		this.tenKhachHang = tenKhachHang;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.sdt = sdt;
	}
	public KhachHang() {
		super();
	}
	@Override
	public String toString() {
		return "KhachHang [id=" + id + ", tenKhachHang=" + tenKhachHang + ", gioiTinh=" + gioiTinh + ", ngaySinh="
				+ ngaySinh + ", sdt=" + sdt + "]";
	}
	
	
	
	
	
}
