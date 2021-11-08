package entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CTHDPK implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String hoaDon;
	private String Thuoc;
}
