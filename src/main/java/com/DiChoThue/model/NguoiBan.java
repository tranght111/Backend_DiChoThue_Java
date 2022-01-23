package com.DiChoThue.model;

import lombok.*;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name ="NguoiBan")
public class NguoiBan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer NguoiBanId;
    @Column(name = "TenCuaHang")
    public String tenCuaHang;
    @Column(name = "HoSoDangKyBanHangId")
    public Integer hoSoDangKyBanHangId;
    @Column(name = "CMND")
    public String cmnd;

}
