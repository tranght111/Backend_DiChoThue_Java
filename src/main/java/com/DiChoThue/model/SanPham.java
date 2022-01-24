package com.DiChoThue.model;

import lombok.*;

import javax.persistence.*;

@Table
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SanPham {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SanPhamId")
    private int sanPhamId;
    @Column(name = "TenSP")
    private String tenSP;
    @Column(name = "HinhAnh")
    private String hinhAnh;
    @Column(name = "GiaSP")
    private Double giaSP;
    @Column(name = "DonViTinh")
    private String donViTinh;
    @Column(name = "MoTa")
    private String moTa;
    @Column(name = "SoLuongTon")
    private Integer soLuongTon;
    @Column(name = "DiemTB")
    private Double diemTB;
    @Column(name = "LoaiSanPhamIdLoaiSP")
    private Integer loaiSanPhamIdLoaiSP;
    @Column(name = "NguoiBanId")
    private Integer nguoiBanId;
	public int getSanPhamId() {
		return sanPhamId;
	}
	public void setSanPhamId(int sanPhamId) {
		this.sanPhamId = sanPhamId;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getHinhAnh() {
		return hinhAnh;
	}
	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	public Double getGiaSP() {
		return giaSP;
	}
	public void setGiaSP(Double giaSP) {
		this.giaSP = giaSP;
	}
	public String getDonViTinh() {
		return donViTinh;
	}
	public void setDonViTinh(String donViTinh) {
		this.donViTinh = donViTinh;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public Integer getSoLuongTon() {
		return soLuongTon;
	}
	public void setSoLuongTon(Integer soLuongTon) {
		this.soLuongTon = soLuongTon;
	}
	public Double getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(Double diemTB) {
		this.diemTB = diemTB;
	}
	public Integer getLoaiSanPhamIdLoaiSP() {
		return loaiSanPhamIdLoaiSP;
	}
	public void setLoaiSanPhamIdLoaiSP(Integer loaiSanPhamIdLoaiSP) {
		this.loaiSanPhamIdLoaiSP = loaiSanPhamIdLoaiSP;
	}
	public Integer getNguoiBanId() {
		return nguoiBanId;
	}
	public void setNguoiBanId(Integer nguoiBanId) {
		this.nguoiBanId = nguoiBanId;
	}
    
}
