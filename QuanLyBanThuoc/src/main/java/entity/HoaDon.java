package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="dsHoaDon")
public class HoaDon {
	@Id
	private String maHoaDon;
	@Column(name= "ngay_Lap")
	private Date ngayLap;
	
	@ManyToOne
	@JoinColumn(name = "ma_Nhan_Vien")
	private NhanVien nhanVien;
	
	@ManyToOne
	@JoinColumn(name = "ma_Khach_Hang")
	private KhachHang khachHang;
}
