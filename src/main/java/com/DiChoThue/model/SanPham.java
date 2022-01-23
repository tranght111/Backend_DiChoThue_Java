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

}
