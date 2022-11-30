/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fadhel.pasienservice.service;

import com.fadhel.pasienservice.entity.Pasien;
import com.fadhel.pasienservice.repository.RepositoryPasien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ASUS
 */
@Service
public class PasienService {
    @Autowired
    private RepositoryPasien pasienRepository;
    
    public Pasien savePasien(Pasien pasien){
        return pasienRepository.save(pasien);
    }
    
    public Pasien findPasienById(Long pasienId){
        return pasienRepository.findByPasienId(pasienId);
    }
}
