package com.company;

public class CalculatriceFloat extends CalculatriceGenerique<Float>{

    public CalculatriceFloat(Float X1, Float X2){
        super(X1, X2);
    }
        public Float addition(){
            return X1+X2;
        }
}
