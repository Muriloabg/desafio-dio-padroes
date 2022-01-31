package com.dio.hospital.service.impl;

import com.dio.hospital.service.EntityService;

import java.time.LocalDate;

public class NurseService extends EntityServiceMaster {
    @Override
    public void printInfo(){

        System.out.println("Nurse: " + super.getName() + "\n"
                + "CRE: " + super.getId() + "\n"
                + "Hiring date: " + super.getDateIn() + "\n"
        );
    }
}
