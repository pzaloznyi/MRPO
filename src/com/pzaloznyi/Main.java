package com.pzaloznyi;

import cw.FileNumbersCalculator;
import lab1.Lab1;
import lab3.FlowerShopProgram;
import utils.ConsoleUtils;

import java.io.BufferedReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {
        try{
            System.out.println("Select Lab work");
            BufferedReader reader = ConsoleUtils.getBufferedReader();
            int value = reader.read();

//        Lab1.Lab1_1();
        new FlowerShopProgram().Run();
//        new FileNumbersCalculator().Run();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
