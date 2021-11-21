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
@Table(name = "dsNuocSX")
public class NuocSX implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 219121622856710482L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ObjectId id;
	@Column(name = "ten_NuocSX")
	private String tenNuocSX;
	public String getTenNuocSX() {
		return tenNuocSX;
	}
	public void setTenNuocSX(String tenNuocSX) {
		this.tenNuocSX = tenNuocSX;
	}
	public ObjectId getId() {
		return id;
	}
	public NuocSX(ObjectId id, String tenNuocSX) {
		super();
		this.id = id;
		this.tenNuocSX = tenNuocSX;
	}
	public NuocSX(String tenNuocSX) {
		super();
		this.tenNuocSX = tenNuocSX;
	}
	public NuocSX() {
		super();
	}
	@Override
	public String toString() {
		return "NuocSX [id=" + id + ", tenNuocSX=" + tenNuocSX + "]";
	}
	
}
