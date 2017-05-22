
package lista4;

import java.util.Scanner;

/**
 *
 * @author matheus.jmaia
 */
public class EXE2 {
    
        static double somatoria (double n){
        double soma = 0;
        for (int i=1;i<=n;i++){
            soma = soma + i;
        }
        return soma;
    }
    
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Insira um valor:");
        double n = console.nextInt();
        double r = somatoria(n);
        System.out.println(r);
        
    }
}
