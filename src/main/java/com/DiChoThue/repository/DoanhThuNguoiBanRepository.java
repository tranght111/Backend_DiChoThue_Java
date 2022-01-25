package com.DiChoThue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.DiChoThue.model.DoanhThuNguoiBan;

public interface DoanhThuNguoiBanRepository extends JpaRepository<DoanhThuNguoiBan, Long> {
	@Query(value = "select dbo.CalcRevenueByMonthInYear(:thang, :nam, :nguoiBanId)", nativeQuery = true)
	Integer calcRevenueByMonthAndYear(@Param("thang") Integer thang, @Param("nam") Integer nam, @Param("nguoiBanId") Integer nguoiBanId);
}