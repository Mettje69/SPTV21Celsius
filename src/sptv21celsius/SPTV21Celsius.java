/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv21celsius;

import java.util.Scanner;

/**
 *
 * @author Anatoli
 */
public class SPTV21Celsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        int cel = scanner.nextInt();
        int far = cel*9/5+32;
        
        System.out.println("Temparatue in Farenheit: "+far);
        
        
        int x = new Scanner(System.in).nextInt();
        int sum = 0;
        System.out.println("Ones: " + x / 1 % 10);
        System.out.println("Tens: " + x / 10 % 10);
        System.out.println("Hundreds: " + x / 100 % 10); 
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        System.out.println("Total: " + sum);
    
    }
    
}
