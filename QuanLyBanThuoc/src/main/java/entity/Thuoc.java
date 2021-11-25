package entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.bson.types.ObjectId;

@Entity
@Table(name = "dsThuoc",indexes = {
		@Index(columnList = "tenThuoc",name="tenThuoc_Indexes")
})
public class Thuoc implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2101165558644982762L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ObjectId id;
	private String tenThuoc;
	private double donGia;
	private int soLuongTon;
	private Date ngaySX;
	private Date hanSD;
	private String trangThaiThuoc;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "LoaiThuoc_Id")
	private LoaiThuoc loaiThuoc;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "NuocSX_id")
	private NuocSX nuocSX;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "NCC_id")
	private NhaCungCap ncc;

	public String getTenThuoc() {
		return tenThuoc;
	}

	public void setTenThuoc(String tenThuoc) {
		this.tenThuoc = tenThuoc;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public int getSoLuongTon() {
		return soLuongTon;
	}

	public void setSoLuongTon(int soLuongTon) {
		this.soLuongTon = soLuongTon;
	}

	public Date getNgaySX() {
		return ngaySX;
	}

	public void setNgaySX(Date ngaySX) {
		this.ngaySX = ngaySX;
	}

	public Date getHanSD() {
		return hanSD;
	}

	public void setHanSD(Date hanSD) {
		this.hanSD = hanSD;
	}

	public String getTrangThaiThuoc() {
		return trangThaiThuoc;
	}

	public void setTrangThaiThuoc(String trangThaiThuoc) {
		this.trangThaiThuoc = trangThaiThuoc;
	}

	public LoaiThuoc getLoaiThuoc() {
		return loaiThuoc;
	}

	public void setLoaiThuoc(LoaiThuoc loaiThuoc) {
		this.loaiThuoc = loaiThuoc;
	}

	public NuocSX getNuocSX() {
		return nuocSX;
	}

	public void setNuocSX(NuocSX nuocSX) {
		this.nuocSX = nuocSX;
	}

	public NhaCungCap getNcc() {
		return ncc;
	}

	public void setNcc(NhaCungCap ncc) {
		this.ncc = ncc;
	}

	public ObjectId getId() {
		return id;
	}
	

	public Thuoc(ObjectId id, String tenThuoc, double donGia, int soLuongTon, Date ngaySX, Date hanSD,
			String trangThaiThuoc, LoaiThuoc loaiThuoc, NuocSX nuocSX, NhaCungCap ncc) {
		super();
		this.id = id;
		this.tenThuoc = tenThuoc;
		this.donGia = donGia;
		this.soLuongTon = soLuongTon;
		this.ngaySX = ngaySX;
		this.hanSD = hanSD;
		this.trangThaiThuoc = trangThaiThuoc;
		this.loaiThuoc = loaiThuoc;
		this.nuocSX = nuocSX;
		this.ncc = ncc;
	}

	public Thuoc(String tenThuoc, double donGia, int soLuongTon, Date ngaySX, Date hanSD, String trangThaiThuoc,
			LoaiThuoc loaiThuoc, NuocSX nuocSX, NhaCungCap ncc) {
		super();
		this.tenThuoc = tenThuoc;
		this.donGia = donGia;
		this.soLuongTon = soLuongTon;
		this.ngaySX = ngaySX;
		this.hanSD = hanSD;
		this.trangThaiThuoc = trangThaiThuoc;
		this.loaiThuoc = loaiThuoc;
		this.nuocSX = nuocSX;
		this.ncc = ncc;
	}

	public Thuoc() {
		super();
	}

	@Override
	public String toString() {
		return "Thuoc [id=" + id + ", tenThuoc=" + tenThuoc + ", donGia=" + donGia + ", soLuongTon=" + soLuongTon
				+ ", ngaySX=" + ngaySX + ", hanSD=" + hanSD + ", trangThaiThuoc=" + trangThaiThuoc + ", loaiThuoc="
				+ loaiThuoc + ", nuocSX=" + nuocSX + ", ncc=" + ncc + "]";
	}
	
	
	
}
