//package com.company;

public class FractionPower extends Power{
    public FractionPower(){

    }

    @Override
    public double pow(double base, double power){
        double result;
        result = Math.exp(power * Math.log(Math.abs(base)));
        return result;
    }
}