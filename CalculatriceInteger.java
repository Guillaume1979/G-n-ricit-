package com.company;

public class CalculatriceInteger extends CalculatriceGenerique<Integer> {

    public CalculatriceInteger(Integer X1, Integer X2){
        super(X1,X2);
    }

    public Integer addition(){
        return X1+X2;
    }
}
