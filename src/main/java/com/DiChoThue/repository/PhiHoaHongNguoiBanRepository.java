package com.DiChoThue.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import com.DiChoThue.model.PhiHoaHongNguoiBan;

public interface PhiHoaHongNguoiBanRepository extends JpaRepository<PhiHoaHongNguoiBan, Long> {
	 @Query(value = "select dbo.CalcCommissionByMonthInYear(:thang, :nam, :nguoiBanId)", nativeQuery = true)
	Integer calcCommissionByMonthAndYear(@Param("thang") Integer thang, @Param("nam") Integer nam, @Param("nguoiBanId") Integer nguoiBanId);
	/*@Autowired
	 private JdbcTemplate jdbcTemplate;

	    @Override
	    public String calcCommissionByMonthAndYear(Integer thang, Integer nam) {
	        SimpleJdbcCall jdbcCall = new SimpleJdbcCall(jdbcTemplate)
	                .withCatalogName("PKG_PACKAGE") //package name
	                .withFunctionName("CalcCommissionByMonthInYear"); //function name
	        SqlParameterSource paramMap1 = new MapSqlParameterSource()
	                .addValue("p_param", thang);
	                SqlParameterSource paramMap2 = new MapSqlParameterSource()
	    	                .addValue("p_param", nam);
	        //First parameter is function output parameter type.
	        return jdbcCall.executeFunction(String.class, paramMap1, paramMap1);
	    }*/
}
