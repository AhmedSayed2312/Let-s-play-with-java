package com.mmrproduct;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NumberFormat currency1 =  NumberFormat.getCurrencyInstance();
        String result1 = currency1.format(1234567.891);
        System.out.println(result1);

        NumberFormat percentInstance =  NumberFormat.getPercentInstance();
        String result2 = percentInstance.format(0.1);
        System.out.println(result2);

        String result3 =NumberFormat.getCurrencyInstance().format(0.5); //method chaining{we are chaining multiple methods together}
        System.out.println(result3);
    }
}
