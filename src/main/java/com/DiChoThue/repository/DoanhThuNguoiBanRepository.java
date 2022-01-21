package com.DiChoThue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DiChoThue.model.DoanhThuNguoiBan;

public interface DoanhThuNguoiBanRepository extends JpaRepository<DoanhThuNguoiBan, Long> {
	List<DoanhThuNguoiBan> findAll();
	List<DoanhThuNguoiBan> findByThangAndNam(Integer thang, Integer nam);
}