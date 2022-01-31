package com.dio.pharmacy;

import java.util.Date;
import java.util.Random;

public class PharmacyService {
    //This represents, through the use of simple random functions, a medicine database

    private static class Holder{
        private static PharmacyService instance = new PharmacyService();
    }

    private PharmacyService(){
        super();
    }

    public static PharmacyService getInstance(){
        return PharmacyService.Holder.instance;
    }
    public String getMedId(){
        return String.valueOf((int) (Math.random() * (1000) + 1));
    }

    public String getMedDosage(){
        return (int) (Math.random() * (10000) + 251) + "mg";
    }

    public String getMedTimes(){
        return (int) (Math.random() * (5) + 1) + "Times a day";
    }
}
