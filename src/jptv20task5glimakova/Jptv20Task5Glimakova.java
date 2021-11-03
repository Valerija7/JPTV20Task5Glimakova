/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv20task5glimakova;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class Jptv20Task5Glimakova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[][] ZubMas = new int[5][];
    ZubMas[0] = new int[3];
    ZubMas[1] = new int[5];
    ZubMas[2] = new int[7];
    ZubMas[3] = new int[8];
    ZubMas[4] = new int[9];
    System.out.println("несортированный массив");
    System.out.println("");
    for (int i = 0; i < ZubMas.length; i++) {
            for (int j = 0; j < ZubMas[i].length; j++) {
                ZubMas[i][j] = random.nextInt(100);
            if(ZubMas[i][j]<50){
                ZubMas[i][j]+=50;   
            }
            System.out.printf("%4d",ZubMas[i][j]);
            }
            System.out.println("");
    }
            
        for (int i = 0; i < ZubMas.length; i++) {
            for (int j = 0; j < ZubMas[i].length; j++) {
            
                for(int k = 0; k<ZubMas.length;k++){
                    for (int m = 0; m < ZubMas[k].length; m++) {

                   if(ZubMas[i][j]<ZubMas[k][m]){
                        ZubMas[i][j]=ZubMas[i][j] + ZubMas[k][m];
                        ZubMas[k][m]=ZubMas[i][j] - ZubMas[k][m];
                        ZubMas[i][j] = ZubMas[i][j] - ZubMas[k][m];
                    }
                }
            }
            }
        }
        System.out.println("");
        System.out.println("сортированный массив");
        System.out.println("");
    for (int i = 0; i < ZubMas.length; i++) {
            for (int j = 0; j < ZubMas[i].length; j++) {
            System.out.printf("%4d",ZubMas[i][j]);
            }
            System.out.println("");
    }
    
    }
    }