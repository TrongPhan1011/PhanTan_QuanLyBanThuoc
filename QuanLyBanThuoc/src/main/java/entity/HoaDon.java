package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.bson.types.ObjectId;

@Entity
@Table(name="dsHoaDon")
public class HoaDon implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4430769447069649083L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ObjectId id;
	@Column(name= "ngay_Lap")
	private Date ngayLap;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ma_Nhan_Vien")
	private NhanVien nhanVien;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ma_Khach_Hang")
	private KhachHang khachHang;
	
	@ElementCollection
	private List<CTHD> dsCTHD;

	public Date getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public List<CTHD> getDsCTHD() {
		return dsCTHD;
	}

	public void setDsCTHD(List<CTHD> dsCTHD) {
		this.dsCTHD = dsCTHD;
	}

	public ObjectId getId() {
		return id;
	}

	public HoaDon(ObjectId id, Date ngayLap, NhanVien nhanVien, KhachHang khachHang, List<CTHD> dsCTHD) {
		super();
		this.id = id;
		this.ngayLap = ngayLap;
		this.nhanVien = nhanVien;
		this.khachHang = khachHang;
		this.dsCTHD = dsCTHD;
	}

	public HoaDon(Date ngayLap, NhanVien nhanVien, KhachHang khachHang, List<CTHD> dsCTHD) {
		super();
		this.ngayLap = ngayLap;
		this.nhanVien = nhanVien;
		this.khachHang = khachHang;
		this.dsCTHD = dsCTHD;
	}
	

	public HoaDon() {
		super();
	}

	@Override
	public String toString() {
		return "HoaDon [id=" + id + ", ngayLap=" + ngayLap + ", nhanVien=" + nhanVien + ", khachHang=" + khachHang
				+ ", dsCTHD=" + dsCTHD + "]";
	}
	
}
