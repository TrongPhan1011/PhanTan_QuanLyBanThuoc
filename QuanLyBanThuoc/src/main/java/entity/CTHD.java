package entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class CTHD implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -464940622459165196L;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Thuoc_Id")
	private Thuoc thuoc;
	
	private double soLuong;
	private double tongTien;
	public Thuoc getThuoc() {
		return thuoc;
	}
	public void setThuoc(Thuoc thuoc) {
		this.thuoc = thuoc;
	}
	public double getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(double soLuong) {
		this.soLuong = soLuong;
	}
	public double getTongTien() {
		return tongTien;
	}
	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	public CTHD(Thuoc thuoc, double soLuong) {
		super();
		this.thuoc = thuoc;
		this.soLuong = soLuong;
		this.tongTien = thuoc.getDonGia()*soLuong;
	}
	
	public CTHD() {
		super();
	}
	@Override
	public String toString() {
		return "CTHD [thuoc=" + thuoc + ", soLuong=" + soLuong + ", tongTien=" + tongTien + "]";
	}
	
	

}
