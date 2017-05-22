package lista4;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matheus.jmaia
 */
public class EXE9 {
    
    public static int converter (int a,int m, int d){
        int anos = a*365;
        int mes = m*30;
        return anos+mes+d;
    }
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Insira a quantidade de anos: ");
        int a = console.nextInt();
        System.out.print("Insira a quantidade de meses: ");
        int m = console.nextInt();
        System.out.print("Insira a quantidade de dias: ");
        int d = console.nextInt();
        int r = converter(a, m, d);
        System.out.println(r+" dias.");
    }
}
