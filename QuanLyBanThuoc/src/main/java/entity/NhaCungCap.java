package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.bson.types.ObjectId;

@Entity
@Table(name = "dsNCC")
public class NhaCungCap implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1080041726017648550L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ObjectId id;
	@Column(name = "ten_NCC")
	private String tenNCC;
	@Column(name = "dia_Chi_NCC")
	private String diaChiNCC;
	public String getTenNCC() {
		return tenNCC;
	}
	public void setTenNCC(String tenNCC) {
		this.tenNCC = tenNCC;
	}
	public String getDiaChiNCC() {
		return diaChiNCC;
	}
	public void setDiaChiNCC(String diaChiNCC) {
		this.diaChiNCC = diaChiNCC;
	}
	public ObjectId getId() {
		return id;
	}
	public NhaCungCap(ObjectId id, String tenNCC, String diaChiNCC) {
		super();
		this.id = id;
		this.tenNCC = tenNCC;
		this.diaChiNCC = diaChiNCC;
	}
	public NhaCungCap(String tenNCC, String diaChiNCC) {
		super();
		this.tenNCC = tenNCC;
		this.diaChiNCC = diaChiNCC;
	}
	public NhaCungCap() {
		super();
	}
	@Override
	public String toString() {
		return "NhaCungCap [id=" + id + ", tenNCC=" + tenNCC + ", diaChiNCC=" + diaChiNCC + "]";
	}
	
	
}
