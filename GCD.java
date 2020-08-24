/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1;

/**
 *
 * @author Pressy
 */

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        int num1, num2, temp, GCD=0;
        
        //Reading the input numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = scanner.nextInt();
        
        System.out.print("Enter second number:");
        num2 = scanner.nextInt();
        
        //closing the scanner to avoid memory leaks
        scanner.close();
         while (num2 != 0)
             {
        	      temp=num2;
                num2=num1%num2;
                num1 =temp;
              }
      GCD=num1;
        //displaying the result
        System.out.println("GCD of given numbers is: " + GCD);
    }

}
