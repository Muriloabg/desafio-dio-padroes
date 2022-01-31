package com.dio.hospital.service.impl;

import com.dio.hospital.service.EntityService;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PatientService extends EntityServiceMaster {
    @Override
    public void printInfo(){

        System.out.println("Patient: " + super.getName() + "\n"
            + "CPF: " + super.getId() + "\n"
            + "Admission date: " + super.getDateIn() + "\n"
        );
    }
}
