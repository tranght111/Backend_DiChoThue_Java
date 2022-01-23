package com.DiChoThue.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name ="NguoiBan")
public class NguoiBan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="NguoiBanId")
	private Integer nguoiBanId;
	@Column(name="TenCuaHang")
	private String tenCuaHang;
	@Column(name="HoSoDangKyBanHangId")
	private Integer hoSoDangKyBanHangId;
	@Column(name="CMNND")
    private String cMND;
	public Integer getNguoiBanId() {
		return nguoiBanId;
	}
	public void setNguoiBanId(Integer nguoiBanId) {
		nguoiBanId = nguoiBanId;
	}
	public String getTenCuaHang() {
		return tenCuaHang;
	}
	public void setTenCuaHang(String tenCuaHang) {
		tenCuaHang = tenCuaHang;
	}
	public Integer getHoSoDangKyBanHangId() {
		return hoSoDangKyBanHangId;
	}
	public void setHoSoDangKyBanHangId(Integer hoSoDangKyBanHangId) {
		hoSoDangKyBanHangId = hoSoDangKyBanHangId;
	}
	public String getCMND() {
		return cMND;
	}
	public void setCMND(String cMND) {
		cMND = cMND;
	}
	
}
