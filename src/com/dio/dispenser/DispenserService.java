package com.dio.dispenser;

public class DispenserService {

    private static class Holder{
        private static DispenserService instance = new DispenserService();
    }

    private DispenserService(){
        super();
    }

    public static DispenserService getInstance(){
        return DispenserService.Holder.instance;
    }


    public void getMeds(String medName, String medId, String medDose, String timesADay){

        System.out.printf("Dispensing: Medicine: '%s', ID ='%s', Dosage ='%s', Frequency ='%s'}", medName, medId, medDose, timesADay);

    }
}
