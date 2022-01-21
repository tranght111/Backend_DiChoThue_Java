package com.DiChoThue.model;

import java.util.Date;

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
@Table (name ="TrangThaiDonHang")
public class TrangThaiDonHang {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IDTrangThai")
	public Integer trangThaiDonHangId;
	@Column(name="NgayCapNhat")
    public Date ngayCapNhat;
	@Column(name="TrangThai")
    public String trangThai;
	@Column(name="DonHangId")
    public Integer donHangId;
}
