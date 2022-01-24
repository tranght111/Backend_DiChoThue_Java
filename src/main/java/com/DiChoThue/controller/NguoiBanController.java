package com.DiChoThue.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DiChoThue.model.NguoiBan;
import com.DiChoThue.repository.NguoiBanRepository;

@RestController
@CrossOrigin(origins = "http://localhost") 
@RequestMapping("/api")
public class NguoiBanController {
	@Autowired
	NguoiBanRepository nguoiBanRepository;
	
	@GetMapping("/nguoiban")
	
	public ResponseEntity<List<NguoiBan>> getAllNguoiBan() {
		
		try {
			List<NguoiBan> NguoiBans = new ArrayList<NguoiBan>();

				nguoiBanRepository.findAll().forEach(NguoiBans::add);
		
			if (NguoiBans.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(NguoiBans, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
