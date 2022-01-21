package com.DiChoThue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DiChoThue.model.TrangThaiDonHang;
import com.DiChoThue.repository.TrangThaiDonHangRepository;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/api")
public class TrangThaiDonHangController {
	@Autowired
	TrangThaiDonHangRepository TrangThaiDonHangRepository;
	
	@PostMapping("/trangthaidonhang")
    public ResponseEntity<TrangThaiDonHang> createNewOrderStatus(@RequestBody TrangThaiDonHang trangThaiDonHang) {
        return new ResponseEntity<>(TrangThaiDonHangRepository.save(trangThaiDonHang), HttpStatus.OK);
	}
}
