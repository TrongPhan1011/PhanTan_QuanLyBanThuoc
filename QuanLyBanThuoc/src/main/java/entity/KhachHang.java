package entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="dsKhachHang")
public class KhachHang {
	@Id
	private String maKhachHang;
	@Column(name = "ten_Khach_Hang")
	private String tenKhachHang;
	@Column(name = "gioi_Tinh")
	private String gioiTinh;
	@Column(name = "ngay_Sinh")
	private Date ngaySinh;
	private String sdt;
	
	
	
}
