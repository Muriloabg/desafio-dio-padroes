package com.dio.hospital.service;

import com.dio.pharmacy.PharmacyService;

public class Medicate {

    private static class Holder{
        private static Medicate instance = new Medicate();
    }

    private Medicate(){
        super();
    }

    public static Medicate getInstance(){
        return Holder.instance;
    }

    public void findMedicine(String name){
        PharmacyService instance = PharmacyService.getInstance();
        String id = instance.getMedId();
        String dose = instance.getMedDosage();
        String frequency = instance.getMedTimes();


    }
}
