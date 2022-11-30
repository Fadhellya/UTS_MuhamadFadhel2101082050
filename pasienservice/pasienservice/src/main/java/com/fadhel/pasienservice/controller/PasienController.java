/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fadhel.pasienservice.controller;

import com.fadhel.pasienservice.entity.Pasien;
import com.fadhel.pasienservice.service.PasienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */
@RestController
@RequestMapping("/pasien")
public class PasienController {
    @Autowired
    private PasienService pasienService;
    
    @PostMapping("/")
    public Pasien savePasien(@RequestBody Pasien pasien){
        return pasienService.savePasien(pasien);
    }
    
    @GetMapping("/{id}")
    public Pasien findPasienById(@PathVariable("id") Long pasienId){
        return pasienService.findPasienById(pasienId);
    }
}
