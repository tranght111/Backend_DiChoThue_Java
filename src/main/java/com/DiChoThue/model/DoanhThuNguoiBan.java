package com.DiChoThue.model;

import java.io.Serializable;

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
@Table (name ="DoanhThuNguoiBan")
public class DoanhThuNguoiBan implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="IDDoanhThu")
	public Integer doanhThuNguoiBanId;
	@Column(name="NguoiBanId")
    public Integer nguoiBanId;
    @Column(name="Thang")
    public Integer thang;
    @Column(name="Nam")
    public Integer nam;
    @Column(name="DoanhThu")
    public float doanhThu;
}
