/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fadhel.bookingberobatservice.controller;

import com.fadhel.bookingberobatservice.VO.ResponseTemplateVO;
import com.fadhel.bookingberobatservice.entity.Bookingberobat;
import com.fadhel.bookingberobatservice.service.BookingberobatService;
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
@RequestMapping("/booking")
public class BookingberobatController {

    @Autowired
    private BookingberobatService bookingberobatService;

    @PostMapping("/")
    public Bookingberobat saveBookingberobat(@RequestBody Bookingberobat bookingberobat) {
        return bookingberobatService.saveBookingberobat(bookingberobat);
    }
    
    @GetMapping("/{id}")
    public ResponseTemplateVO getBookingberobat(@PathVariable("id") Long bookingberobatId){
        return bookingberobatService.getBookingberobat(bookingberobatId);
    }
}
