/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labweek2.rodrigolima;

import java.util.Scanner;

/**
 *
 * @author rodrigolima
 */
public class LabWeek2RodrigoLima {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    
    {
                System.out.print("Please enter your first favorite app: ");
                Scanner keyboard = new Scanner(System.in);
                String firstapp = keyboard.nextLine();
                
                System.out.print("Please enter your second favorite app: ");
              
                String secondapp = keyboard.nextLine();
                
                System.out.print("Please enter your third favorite app: ");
                
                String thirdapp = keyboard.nextLine();
                
                System.out.printf("Your favourite apps are: %s, %s and %s.%n", firstapp, secondapp, thirdapp);
    }
    
}
