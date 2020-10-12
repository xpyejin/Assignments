/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hanye
 */
package com.yejin.assignments;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class DogGenetics {
    public static void main(String[] args){
        String DogName=" ";
        double var1, var2, var3, var4, var5;
        Random mr = new Random();
        var1 = mr.nextDouble();
        var2 = mr.nextDouble();
        var3 = mr.nextDouble();
        var4 = mr.nextDouble();
        var5 = mr.nextDouble();
        double sum=var1+var2+var3+var4+var5;
        Scanner ms = new Scanner(System.in);
        System.out.println("What is your dog's name?");
        DogName = ms.nextLine();
        System.out.println("Well then, I have this highly reliable report on " + DogName + "'s");
        System.out.println("prestigious background right here.");
        System.out.println("\n" + DogName + " is:");
        System.out.println("\n" + rf(var1, sum) + "% St. Bernard");
        System.out.println(rf(var2, sum) + "% Chihuahua");
        System.out.println(rf(var3, sum) + "% Dramatic RedNosed Asian Pug");
        System.out.println(rf(var4, sum) + "% Common Cur");
        System.out.println(rf(var5, sum) + "% King Doberman");
        System.out.println("\nWow, that's QUITE the dog!");
    }
    
    public static long rf(double par1, double par2){
        return Math.round(par1/par2*100);
    }
}
