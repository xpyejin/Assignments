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

import java.util.Scanner;
import java.lang.Math;

public class HealthyHearts {
    public static void main(String[] args){
        int age, max;
        Scanner ms = new Scanner(System.in);
        System.out.println("What is your age?");
        age = Integer.parseInt(ms.nextLine());
        max = 220 - age;
        System.out.println("Your maximum heart rate should be " + max + "  beats per minute");
        System.out.println("Your target HR Zone is " + Math.round(0.5*max) + " - " + Math.round(0.85*max) + "  beats per minute");
    }
}
