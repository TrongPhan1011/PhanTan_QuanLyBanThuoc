package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dsNuocSX")
public class NuocSX {
	@Id
	private String maNuocSX;
	@Column(name = "ten_NuocSX")
	private String tenNuocSX;
	
}
