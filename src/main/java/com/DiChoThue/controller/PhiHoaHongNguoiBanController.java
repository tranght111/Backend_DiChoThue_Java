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
import com.DiChoThue.model.PhiHoaHongNguoiBan;
import com.DiChoThue.repository.DoanhThuNguoiBanRepository;
import com.DiChoThue.repository.NguoiBanRepository;
import com.DiChoThue.repository.PhiHoaHongNguoiBanRepository;
@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api")
public class PhiHoaHongNguoiBanController {
	@Autowired
	NguoiBanRepository nguoiBanRepository;
	
	@Autowired
	PhiHoaHongNguoiBanRepository PhiHoaHongNguoiBanRepository;

	@GetMapping("/phihoahong")
	public ResponseEntity<List<PhiHoaHongNguoiBan>> calcCommissionByMonthAndYear(@RequestParam(required = false) Integer thang, @RequestParam(required = false) Integer nam) {
		try {
			List<PhiHoaHongNguoiBan> PhiHoaHongs = new ArrayList<PhiHoaHongNguoiBan>();
			
			// B1: Fetch ds id
			List<Integer> nguoiBanIds = new ArrayList<Integer>();
			List<NguoiBan> ngbanList = new ArrayList<NguoiBan>();
			ngbanList = nguoiBanRepository.findAll();
			for(NguoiBan i: ngbanList) {
				nguoiBanIds.add(i.getNguoiBanId());			
			}
			
			for (int id: nguoiBanIds) {
				float phiHoaHong = PhiHoaHongNguoiBanRepository.calcCommissionByMonthAndYear(thang, nam, id);
				PhiHoaHongNguoiBan phiHoaHongNguoiBan = new PhiHoaHongNguoiBan();
				phiHoaHongNguoiBan.thang = thang;
				phiHoaHongNguoiBan.nam = nam;
				phiHoaHongNguoiBan.nguoiBanId = id;
				phiHoaHongNguoiBan.phiHoaHong = phiHoaHong;		
				PhiHoaHongs.add(phiHoaHongNguoiBan);
			}

			if (PhiHoaHongs.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(PhiHoaHongs, HttpStatus.OK);
		} catch (Exception e) {
			System.out.print(e);
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
