package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dsLoaiThuoc")
public class LoaiThuoc {
	@Id
	private String maLoai;
	@Column(name = "ten_Loai_Thuoc")
	private String tenLoai;
}
