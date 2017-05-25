
package lista4;

import java.util.Scanner;

/**
 *
 * @author matheus.jmaia
 */
public class EXE8 {
    
    static boolean primo (int n){
        boolean primo = false;
        if(n%2==0){
            primo = false;
        }else {
            primo = true;
        }
        return primo;
    }
        
    public static void main(String[] args) {
        Scanner console = new Scanner (System.in);
        System.out.print("Insira um número: ");
        int n = console.nextInt();
        boolean primo = primo(n);
        System.out.println(primo);
    }
 
}
