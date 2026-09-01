package com.uam.paejavafxeventos.model;

public class CoffeeLot {
    private final String code;
    private final String farmer;
    private double qintals;

    public CoffeeLot(String code, String farmer, double qintals) {
        this.code = code;
        this.farmer = farmer;
        this.qintals = qintals;
    }

    public String getCode() {
        return code;
    }

    public String getFarmer() {
        return farmer;
    }

    public double getQintals() {
        return qintals;
    }

    public void setQintals(double qintals) {
        this.qintals = qintals;
    }
}
