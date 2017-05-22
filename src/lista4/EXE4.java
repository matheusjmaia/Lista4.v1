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
public class EXE4 {
    
    public static double divisao (double n1, double n2){
        return n1/n2;
    }
    
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Insira um valor:");
        double n = console.nextDouble();
        EXE3 exe3 = new EXE3 ();
        EXE2 exe2 = new EXE2 ();
        double f = exe3.fatorial(n);
        double s = exe2.somatoria(n);
        double r = divisao(f, s);
        System.out.println("Resultado: "+r);
        
        
        
    }
}
