package com.DiChoThue.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.DiChoThue.model.DoanhThuNguoiBan;
import com.DiChoThue.repository.DoanhThuNguoiBanRepository;
@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api")
public class DoanhThuNguoiBanController {
	@Autowired
	DoanhThuNguoiBanRepository DoanhThuNguoiBanRepository;

	@GetMapping("/doanhthu")
	public ResponseEntity<List<DoanhThuNguoiBan>> getAllDoanhThu(@RequestParam(required = false) Integer thang, @RequestParam(required = false) Integer nam) {
		
		try {
			List<DoanhThuNguoiBan> DoanhThus = new ArrayList<DoanhThuNguoiBan>();

			if (thang == null && nam == null)
				DoanhThuNguoiBanRepository.findAll().forEach(DoanhThus::add);
		
			else
				DoanhThuNguoiBanRepository.findByThangAndNam(thang, nam).forEach(DoanhThus::add);

			if (DoanhThus.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(DoanhThus, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
