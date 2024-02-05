package uk.tw.energy.models;

import lombok.Data;

@Data
public class User {
    private int userId;
    private String name;
    private String address;
    private SmartMeter smartMeter;
    private Company company;
}
