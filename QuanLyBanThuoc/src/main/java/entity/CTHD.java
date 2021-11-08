package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dsCTHD")
@IdClass(CTHDPK.class)
public class CTHD {
	@Id
	@ManyToOne
	private Thuoc thuoc;
	@Id
	@ManyToOne
	private HoaDon hoaDon;
	
	private double soLuong;
	private double tongTien;

}
