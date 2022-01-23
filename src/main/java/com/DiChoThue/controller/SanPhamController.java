package com.DiChoThue.controller;

import com.DiChoThue.model.SanPham;
import com.DiChoThue.repository.SanPhamRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(path = "/api/sanPham")
@AllArgsConstructor
public class SanPhamController {

    final private SanPhamRepository sanPhamRepository;

    @GetMapping
    public ResponseEntity<List<SanPham>> getAllSanPham(){
        List<SanPham> result = sanPhamRepository.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SanPham> findSanPhamById(@PathVariable int id){
        Optional<SanPham> sanPham = sanPhamRepository.findById(id);
        if(sanPham.isPresent()){
            return new ResponseEntity<>(sanPham.get(), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        }

    }

    @DeleteMapping("/{id}")
    public String deleteSanPhamById(@PathVariable int id){
        Optional<SanPham> sanPham = sanPhamRepository.findById(id);
        if(sanPham.isPresent()){
            sanPhamRepository.deleteById(id);
            return "Delete successfully!";
        }
        else {
            return "Id doesn't exist!!";
        }

    }
    @PostMapping
    public ResponseEntity<SanPham> addSanPham(@RequestBody SanPham sanPham) {

        sanPhamRepository.save(sanPham);
        return new ResponseEntity<>( sanPhamRepository.save(sanPham), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HashMap<String, String>> updateSanPham(@PathVariable int id, @RequestBody SanPham sanPham){
        Optional<SanPham> newSp = sanPhamRepository.findById(id);
        if(!newSp.isPresent()){
            HashMap result = new HashMap();
            result.put("message", "Id doesn't exist!!");
            return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        }
        else{
            sanPham.setSanPhamId(id);
            sanPhamRepository.save(sanPham);
            HashMap result = new HashMap();
            result.put("message", "update successfullly");
            return new ResponseEntity<>(result, HttpStatus.OK);
        }
    }


}
