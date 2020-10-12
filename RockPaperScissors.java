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
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner ms = new Scanner(System.in);
        Random mr = new Random();
        int NumRounds, PlayerOpt, CompOpt, PWins, CWins, Ties, ContPlay;
        do{
            PWins=0; 
            CWins=0;
            Ties=0;
        System.out.println("How many rounds do you want to play? Please choose between 1 and 10:");
        NumRounds = Integer.parseInt(ms.nextLine());
        if(NumRounds<1 || NumRounds>10){
            System.out.println("Error: that option is out of range!");
            break;
        }
        else{
            for(int i=1; i<=NumRounds; i++){
                System.out.println("Rock(1), paper(2) or scissors(3)?");
                PlayerOpt = Integer.parseInt(ms.nextLine());
                CompOpt = mr.nextInt(3)+1;
                if(CompOpt==1){
                    if(PlayerOpt==1){
                        System.out.println("Computer played rock - tied!");
                        Ties++;
                    }
                    else if(PlayerOpt==2){
                        System.out.println("Computer played rock - player wins!");
                        PWins++;
                    }
                    else{
                        System.out.println("Computer played rock - computer wins!");
                        CWins++;
                    }
                }
                else if(CompOpt==2){
                    if(PlayerOpt==1){
                        System.out.println("Computer played paper - computer wins!");
                        CWins++;
                    }
                    else if(PlayerOpt==2){
                        System.out.println("Computer played paper - tied!");
                        Ties++;
                    }
                    else{
                        System.out.println("Computer played paper - player wins!");
                        PWins++;
                    }
                }
                else{
                    if(PlayerOpt==1){
                        System.out.println("Computer played scissors - player wins!");
                        PWins++;
                    }
                    else if(PlayerOpt==2){
                        System.out.println("Computer played scissors - computer wins!");
                        CWins++;
                    }
                    else{
                        System.out.println("Computer played scissors - tied!");
                        Ties++;
                    }
                }
            }
        }
        System.out.println("The game ends with " + Ties + " ties, " + PWins + " player wins, and " + CWins + " computer wins.");
        if(PWins>CWins){
            System.out.println("Player is the final winner!");
        }
        else if(CWins>PWins){
            System.out.println("Computer is the final winner!");
        }
        else{
            System.out.println("Game drawn!");
        }
        System.out.println("Keep playing? Press 1. Otherwise, press anything else:");
        ContPlay = Integer.parseInt(ms.nextLine());
        }while(ContPlay==1);
        System.out.println("Thanks for playing. Goodbye!");
    }
}
