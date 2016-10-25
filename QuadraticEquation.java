/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadraticequation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


/**
 *InputStreamReader reader = new InputStreamReader (System.in);
            BufferedReader console = new BufferedReader(reader);
            
            System.out.println("How many pennies do you have?");
            String input = console.readLine();
            int pennies = Integer.parseInt(input);
            
            System.out.println("How many nickels do you have?");
            input = console.readLine();
            int nickels = Integer.parseInt(input);
            
            System.out.println("How many dimes do you have?");
            input = console.readLine();
            int dimes = Integer.parseInt(input);
 * @author patrickbenitez
 */
public class QuadraticEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        InputStreamReader reader = new InputStreamReader (System.in);
        BufferedReader console = new BufferedReader(reader);
            
        System.out.println("What is the value of 'a' in ax^2+by +c?");
        String input = console.readLine();
        int a = Integer.parseInt(input);
            
        System.out.println("What is the value of 'b' in ax^2+by +c?");
        input = console.readLine();
        int b = Integer.parseInt(input);
            
        System.out.println("What is the value of 'c' in ax^2+by +c?");
        input = console.readLine();
        int c = Integer.parseInt(input);
        
        double temp = Math.sqrt(b*b - 4 * a * c);
        double root1 = (-b + temp) / (2*a);
        double root2 = (-b - temp) / (2*a);
        
        //answer = (-b + Math.sqrt(b*b-4*a*c)) / (2*a);
                
        System.out.println("The two roots are: " + root1 + " " + root2);
    }
    catch(IOException e) {
    System.out.println(e);
    System.exit(1);
    }
    }
}
