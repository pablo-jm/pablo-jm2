/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraybidimensionales;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author DAW TARDE
 */
public class ArrayBidimensionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] matriz = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };
        // System.out.println(matriz[0].length);
        // Recorrer elemento a elemento
        /*
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][2] + "");
                break;
            }
          */
        // Mostrar elementos de la tercera columna
        /*
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][2] + "");
        }
         */
        // Mostrar elementos de la primera fila
        /*for (int i = 0; i < matriz[0].length; i++) {
            System.out.println(matriz[0][i] + "");
        }*/
        
        
        /*String[][] tresRaya = new String[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca fila:");
        int fila = sc.nextInt();
        System.out.println("Introduzca columna:");
        int columna = sc.nextInt();
        if(tresRaya[fila][columna]==null){
            tresRaya[fila][columna] = "Jugador1";
        }
        
        for (int i = 0; i < tresRaya.length; i++) {
            for (int j = 0; j < tresRaya[i].length; j++) {
            System.out.println(matriz[0][i] + "    ");
            
        }
            System.out.println();*/
        
            
        /*int[][] matriz2 = {
            {1, 2, 3},
            { 4, 5, 6},
            {7, 8, 9}
        };    
            
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz[i][j] + "   ");     
            }
             System.out.println();
        }*/
        
        
        /*int[][] matriz2 = new int[4][3];
        Random random = new Random();
        
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                 matriz2[i][j] = random.nextInt(100)+1;  
                 System.out.println(matriz2[i][j]);
            }
        }*/
        
        /*int[][] matriz3 = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        int sum = 0;
        int[] array = new int[3];
        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                 sum = sum + matriz3[i][j];
        }
        array[i] = sum;
        sum = 0;
    }*/

        
        int[][] matriz4 = new int[3][3];
        
        for (int i = 0; i < matriz4.length; i++) {
            for (int j = 0; j < matriz4[i].length; j++) {
                 if(i == j){
                     matriz4[i][j] = 1;
                 }
            }
        }

        
        
        
        
        
        
        
        
    }
}