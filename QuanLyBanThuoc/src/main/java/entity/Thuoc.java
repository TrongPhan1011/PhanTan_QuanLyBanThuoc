package entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dsThuoc")
public class Thuoc {
	@Id
	private String maThuoc;
	private String tenThuoc;
	private double donGia;
	private int soLuongTon;
	private Date ngaySX;
	private Date hanSD;
	private String trangThaiThuoc;
	
	@ManyToOne
	@JoinColumn(name = "ma_LoaiThuoc")
	private LoaiThuoc loaiThuoc;
	
	@ManyToOne
	@JoinColumn(name = "ma_NuocSX")
	private NuocSX nuocSX;
	
	@ManyToOne
	@JoinColumn(name = "ma_NCC")
	private NhaCungCap ncc;
}
