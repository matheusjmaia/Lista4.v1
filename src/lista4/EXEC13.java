
package lista4;

import java.util.Scanner;

/**
 *
 * @author matheus.jmaia
 */
public class EXEC13 {
    
    static String divisores (int n){
        String divisor = "";
        for(int i = 1; i <= 100;i++){
            if(n%i==0){
                divisor = divisor + i + " ";
            }
        }
        return divisor;
    }
 
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.println("Insira N:");
        int n = console.nextInt();
        String r = divisores(n);
        System.out.println(n+" e divisor de "+r);
        
        
    }
    
}
