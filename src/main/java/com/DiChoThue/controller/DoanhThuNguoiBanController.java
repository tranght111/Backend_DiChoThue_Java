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
import com.DiChoThue.model.NguoiBan;
import com.DiChoThue.repository.DoanhThuNguoiBanRepository;
import com.DiChoThue.repository.NguoiBanRepository;
@RestController
@CrossOrigin(origins = "http://localhost:8080") 
@RequestMapping("/api")
public class DoanhThuNguoiBanController {
	@Autowired
	NguoiBanRepository nguoiBanRepository;
	
	@Autowired
	DoanhThuNguoiBanRepository DoanhThuNguoiBanRepository;

	@GetMapping("/doanhthu")
	public ResponseEntity<List<DoanhThuNguoiBan>> calcRevenueByMonthAndYear(@RequestParam(required = false) Integer thang, @RequestParam(required = false) Integer nam) {
		try {
			List<DoanhThuNguoiBan> DoanhThus = new ArrayList<DoanhThuNguoiBan>();
			
			// B1: Fetch ds id
			List<Integer> nguoiBanIds = new ArrayList<Integer>();
			List<NguoiBan> ngbanList = new ArrayList<NguoiBan>();
			ngbanList = nguoiBanRepository.findAll();
			for(NguoiBan i: ngbanList) {
				nguoiBanIds.add(i.getNguoiBanId());			
			}
			
			for (int id: nguoiBanIds) {
				float doanhThu = DoanhThuNguoiBanRepository.calcRevenueByMonthAndYear(thang, nam, id);
				DoanhThuNguoiBan doanhthuNguoiBan = new DoanhThuNguoiBan();
				doanhthuNguoiBan.thang = thang;
				doanhthuNguoiBan.nam = nam;
				doanhthuNguoiBan.nguoiBanId = id;
				doanhthuNguoiBan.doanhThu = doanhThu;		
				DoanhThus.add(doanhthuNguoiBan);
			}

			if (DoanhThus.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(DoanhThus, HttpStatus.OK);
		} catch (Exception e) {
			System.out.print(e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
