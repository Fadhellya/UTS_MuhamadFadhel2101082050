/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.fadhel.bookingberobatservice.repository;

import com.fadhel.bookingberobatservice.entity.Bookingberobat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author ASUS
 */
@Repository
public interface BookingberobatRepository extends JpaRepository<Bookingberobat, Long>{

    public Bookingberobat findByBookingberobatId(Long bookingberobatId);
    
}
