package com.DiChoThue.model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class DonHang {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer donHangId;
	public Date ngayDat;
	public float phiShip;
	public float tongTien;
	public String hinhThucThanhToan;
	public Integer nguoiBanId;
	public Integer khachHangId;
}
