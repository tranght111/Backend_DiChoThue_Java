package com.DiChoThue.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DiChoThue.model.TrangThaiDonHang;

public interface TrangThaiDonHangRepository extends JpaRepository<TrangThaiDonHang, Long>{
	TrangThaiDonHang save(TrangThaiDonHang trangThaiDonHang);
}
