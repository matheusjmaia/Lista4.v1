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
public class EXE7 {
    public static double volume (double r){
        return ((4/3) * 3.141592 * (r*r*r));}
     
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Digite o raio da esfera: ");
        double r = console.nextDouble();
        double volume = volume (r);
        System.out.println("O volume dessa esfera é: "+volume);
    }

}
