package com.dio.hospital.service.impl;

import com.dio.hospital.service.EntityService;

import java.time.LocalDate;

public class DoctorService extends EntityServiceMaster {
    @Override
    public void printInfo(){

        System.out.println("Doctor: " + super.getName() + "\n"
                + "CRM: " + super.getId() + "\n"
                + "Hiring date: " + super.getDateIn() + "\n"
        );
    }
}
