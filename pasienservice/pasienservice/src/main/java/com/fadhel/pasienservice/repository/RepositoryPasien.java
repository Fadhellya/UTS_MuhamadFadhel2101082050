/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fadhel.pasienservice.repository;

import com.fadhel.pasienservice.entity.Pasien;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ASUS
 */
public interface RepositoryPasien extends JpaRepository<Pasien, Long>{
    public Pasien findByPasienId(Long pasienId);
}
