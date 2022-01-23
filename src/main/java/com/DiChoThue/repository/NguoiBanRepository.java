package com.DiChoThue.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DiChoThue.model.NguoiBan;

public interface NguoiBanRepository extends JpaRepository<NguoiBan, Long>{
	List<NguoiBan> findAll();
}
