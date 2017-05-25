
package lista4;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class EXEC15 {
    
    static int elevado (int x, int z){
        int r = 0;
        for (int i = 1; i < z;i++){
        r = r + x*x;
    }
        return r;
}

public static void main (String []args){
    Scanner console = new Scanner (System.in);
    System.out.print("Insira o valor de X: ");
    int x = console.nextInt();
    System.out.print("Insira o valor de Z: ");
    int z = console.nextInt();
    int r = elevado(x, z);
    System.out.println(x+" elevado a "+z+" é igual a "+r);
}
    
}