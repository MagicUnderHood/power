//package com.company;

public class PositivePower extends Power{
    public PositivePower(){

    }

    @Override
    public double pow(double base, double power){
        double result = 1;
        for(int i = 0; i < power; i++){
            result = base * result;
        }
        return result;
    }
}