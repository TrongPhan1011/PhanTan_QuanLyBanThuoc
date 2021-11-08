package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "dsTaiKhoan")
public class TaiKhoan {
	@Id
	private String maTK;
	@Column(name = "mat_Khau")
	private String matKhau;
	
	@OneToOne
	@MapsId
	@JoinColumn(name = "maNhanVien")
	private NhanVien nhanVien;
	

}
