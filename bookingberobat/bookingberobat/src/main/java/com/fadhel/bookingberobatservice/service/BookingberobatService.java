/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fadhel.bookingberobatservice.service;

import com.fadhel.bookingberobatservice.VO.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fadhel.bookingberobatservice.entity.Bookingberobat;
import com.fadhel.bookingberobatservice.repository.BookingberobatRepository;
import com.fadhel.bookingberobatservice.VO.Pasien;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author ASUS
 */
@Service
public class BookingberobatService {

    @Autowired
    private BookingberobatRepository bookingberobatRepository;

    private RestTemplate restTemplate;

    public Bookingberobat saveBookingberobat(Bookingberobat bookingberobat) {
        return bookingberobatRepository.save(bookingberobat);
    }

    public ResponseTemplateVO getBookingberobat(Long bookingberobatId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Bookingberobat bookingberobat = bookingberobatRepository.findByBookingberobatId(bookingberobatId);
        Pasien pasien = restTemplate.getForObject("http://localhost:9002/pasien/"
                + bookingberobat.getPasienId(), Pasien.class);
        vo.setBookingberobat(bookingberobat);
        vo.setPasien(pasien);
        return vo;
    }
}
