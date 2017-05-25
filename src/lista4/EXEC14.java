/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista4;

import java.util.Scanner;

/**
 *
 * @author matheus.jmaia
 */
public class EXEC14 {
    
    static double ss (int a, int n){
        if (n<0 || n ==0){
            return -1;
        }else{
            return a+n;
        }
    }
    
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Insira o valor de A:");
        int a = console.nextInt();
        System.out.println("Insira o valor de N:");
        int N = console.nextInt();
        double result = ss(a, N);
        System.out.println(result);
    }
}
