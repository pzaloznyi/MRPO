package com.pzaloznyi;

import cw.FileNumbersCalculator;
import lab1.Lab1;
import lab3.FlowerShopProgram;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {
        try{
//        Lab1.Lab1_1();
//        new FlowerShopProgram().Run();
            new FileNumbersCalculator().Run();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
