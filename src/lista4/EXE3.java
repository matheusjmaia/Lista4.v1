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
public class EXE3 {
    
    public static double fatorial (double n){
        double soma = 1;
        for (int i=1;i<=n;i++){
            soma = soma * i;
        }
        return soma;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Insira um valor:");
        double n = console.nextInt();
        double r = fatorial(n);
        System.out.println(r);
    }
}
