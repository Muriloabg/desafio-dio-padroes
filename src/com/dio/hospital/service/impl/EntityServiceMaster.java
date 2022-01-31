package com.dio.hospital.service.impl;

import com.dio.hospital.service.EntityService;

import java.time.LocalDate;

public class EntityServiceMaster implements EntityService {
    private String crm;
    private String name;
    private LocalDate dateIn;

    private static class Holder{
        private static EntityServiceMaster instance = new EntityServiceMaster();
    }

    protected EntityServiceMaster(){
        super();
    }

    public static EntityServiceMaster getInstance(){
        return Holder.instance;
    }


    @Override
    public String getId() {
        return crm;
    }

    @Override
    public void setId(String id) {
        crm = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public LocalDate getDateIn() {
        return dateIn;
    }

    @Override
    public void setDateIn(LocalDate dateIn) {
        this.dateIn = dateIn;
    }

    @Override
    public void printInfo() {

    }
}
