package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.bson.types.ObjectId;

@Entity
@Table(name = "dsLoaiThuoc")
public class LoaiThuoc implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 429038174040995522L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ObjectId id;
	@Column(name = "ten_Loai_Thuoc")
	private String tenLoai;
	

	public String getTenLoai() {
		return tenLoai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	public ObjectId getId() {
		return id;
	}
	
	public LoaiThuoc(String tenLoai) {
		super();
		this.tenLoai = tenLoai;
	}
	
	public LoaiThuoc() {
		super();
	}
	public LoaiThuoc(ObjectId id, String tenLoai) {
		super();
		this.id = id;
		this.tenLoai = tenLoai;
	}
	
	@Override
	public String toString() {
		return "LoaiThuoc [id=" + id + ", tenLoai=" + tenLoai + "]";
	}
	
	
	
}
