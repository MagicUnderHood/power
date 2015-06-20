//package com.company;

public class NegativePower extends Power{
    public NegativePower(){

    }

    @Override
    public double pow(double base, double power){
        double result = 1;
        for(int i = 0; i < -power; i++){
            result = base * result;
        }
        return 1/result;
    }
}