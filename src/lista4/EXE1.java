
package lista4;

import java.util.Scanner;


public class EXE1 {

public static double menor (double a, double b, double c){
    if (a<b && a<c){
        return a;
    } else if (b<a && b<c){
        return b;
    } else {
        return c;
    }
}
    
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Insira o N1: ");
        double n1 = console.nextDouble();
        System.out.print("Insira o N2: ");
        double n2 = console.nextDouble();
        System.out.print("Insira o N1: ");
        double n3 = console.nextDouble();
        double menor = menor(n1,n2,n3);
        System.out.println("O menor número é: "+menor);
    }
    
}
