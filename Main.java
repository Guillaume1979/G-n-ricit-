package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CalculatriceGenerique<Integer> calc = new CalculatriceInteger(10,2);
        System.out.println(calc.addition());
        CalculatriceGenerique<Float> calc2 = new CalculatriceFloat(2.3F,new Float(4.7));//les 2 écritures fonctionnenent
        System.out.println(calc2.addition());

    }
}
