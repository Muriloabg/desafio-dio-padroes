package com.dio.hospital.service;

import java.time.LocalDate;

public interface EntityService {

    public String getId();

    public void setId(String id);

    public String getName();

    public void setName(String name);

    public LocalDate getDateIn();

    public void setDateIn(LocalDate dateIn);

    public void printInfo();
}
