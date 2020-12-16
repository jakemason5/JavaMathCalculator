/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamathcalculator;
import java.util.Scanner;

/*Java Math Calculator Program
 *By: Jacob Mason
 *Version 1.1.1*/
public class JavaMathCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char val = 'Y';
        
        //Welcoming the user and indtroducing the program  
        System.out.println("Welcome to the Java Math Calculator!");
        System.out.println("This program will work just like a calculator and help you solve problems");
        do{

        //Letting the user input the variables and the operator
        System.out.print("Enter the first number: "); //First Var
        Scanner input = new Scanner(System.in);
        double FirstVar = input.nextDouble();
        
        System.out.print("Enter the second number: ");//Second Var
        Scanner input2 = new Scanner(System.in);
        double SecondVar = input2.nextDouble();
        
        //Inputting Operator
        System.out.print("Now enter the operation you would like\n" +
                "a - for addition\n"+
                "s - for subtraction\n"+
                "d - for division\n"+
                "m - for multiplication\n");
        Scanner input3 = new Scanner(System.in);
        char Operator = input3.next().charAt(0);
        
      
        System.out.print("The answer is ");
        
        //Testing for which operator was used, setting up the equation and
        //displaying the answer
        double Answer;
        if(Operator == 'a'){
            Answer = FirstVar + SecondVar;
         System.out.printf("%.2f\n", Answer);}
        if(Operator == 's'){
            Answer = FirstVar - SecondVar;
                 System.out.printf("%.2f\n", Answer);}
        if(Operator == 'd'){
            Answer = FirstVar / SecondVar;
                 System.out.printf("%.2f\n", Answer);}
        if(Operator == 'm'){
            Answer = FirstVar * SecondVar;
                 System.out.printf("%.2f\n", Answer);}
        
        
            System.out.print("\nWould you like to run the program agian?(Y/N): ");
            Scanner inputq = new Scanner(System.in);
            val = inputq.next().charAt(0);
        }while(val == 'Y');
        
         System.out.println("Thank you for using the Java Math Calculator. "
                + "Goodbye!");
         
    }
    
}
