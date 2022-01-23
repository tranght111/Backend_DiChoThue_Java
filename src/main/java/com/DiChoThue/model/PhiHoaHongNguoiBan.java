package com.DiChoThue.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@NamedQuery(name = "PhiHoaHongNguoiBan.calcCommissionByMonthAndYear",
//query = "select dbo.CalcCommissionByMonthInYear")
@Table (name ="PhiHoaHongNguoiBan")
public class PhiHoaHongNguoiBan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IDPhiHoaHong")
	public Integer phiHoaHongId;
	@Column(name="PhiHoaHong")
    public float phiHoaHong;
    @Column(name="Thang")
    public Integer thang;
    @Column(name="Nam")
    public Integer nam;
	@Column(name="NguoiBanId")
    public Integer nguoiBanId;
    @Column(name="TrangThai")
    public float trangThai;
}
