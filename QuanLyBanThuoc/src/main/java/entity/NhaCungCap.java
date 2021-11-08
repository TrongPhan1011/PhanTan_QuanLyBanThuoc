package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dsNCC")
public class NhaCungCap {
	@Id
	private String maNCC;
	@Column(name = "ten_NCC")
	private String tenNCC;
	@Column(name = "dia_Chi_NCC")
	private String diaChiNCC;
}
