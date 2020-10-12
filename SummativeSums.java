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

public class SummativeSums {
    public static void main(String[] args){
        int [] array1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int [] array2 = {999, -60, -77, 14, 160, 301};
        int [] array3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
140, 150, 160, 170, 180, 190, 200, -99};
        //int sum1=FindSum(array1), sum2=FindSum(array2), sum3=Findsum(array3);
        int [] sum = new int [3];
        sum[0] = FindSum(array1);
        sum[1] = FindSum(array2);
        sum[2] = FindSum(array3);
        for(int i=1; i<=3; i++){
            System.out.println("#" + i + " Array Sum: " + sum[i-1]);
        }
    }
    
    public static int FindSum(int[] MyArray){
        int sum=0;
        for(int i=0; i<MyArray.length;i++){
        sum+=MyArray[i];
    }
        return sum;
    }
}
