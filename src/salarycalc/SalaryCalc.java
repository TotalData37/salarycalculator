//SalaryCalc.java - This is a program for a manager to input hourly rate and time worked for up to three employees with input validation checks.
//CSIS 212-B02
//No external citations used

package salarycalc;

import java.util.Scanner;  // # import Scanner class to get user input

public class SalaryCalc 
{   
	// Main method beings execution of java application
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);  // Create a Scanner to obtain input from the command window

        // 
        double total1 = 0; // Variable for total salary for employee 1
        double total2 = 0; // Variable for total salary for employee 2
        double total3 = 0; // Variable for total salary for employee 3

        // This is a counter to make sure the loop increase by 1
        int payCounter = 1;

       
        while (payCounter <= 3) // this is total for how many times the loop will cycle 
        {
            
            double hourlyRate; // This is for the hourly rate for the employees with input validation 
            
            do 
            {
                System.out.print("Please enter hourly rate: "); // Prompt
                hourlyRate = input.nextDouble();

                if (hourlyRate < 0) {
                    System.out.println("Invalid input, please check your input in hourly pay and time worked. Thank you!"); // input validation for any number below zero
                }

            } 
            
            while (hourlyRate < 0);  

            double hoursWorked; // This is for the hours worked for the employees with input validation 
            
            do 
            {
                System.out.print("Please enter the hours you worked: "); // Prompt
                hoursWorked = input.nextDouble();

                if (hoursWorked < 0) {
                    System.out.println("Invalid input, please check your input in hourly pay and time worked. Thank you!"); // input validation for any number below zero
                }

            } 
            
            while (hoursWorked < 0);  

            // This is a formula to determine total salary for the employees
            double totalPay = hourlyRate * hoursWorked;

            // This is to store the total in the right variable based on the employee number 1 in the pay counter.
            if (payCounter == 1) {
                total1 = totalPay;
            } else if (payCounter == 2) {
                total2 = totalPay;
            } else if (payCounter == 3) {
                total3 = totalPay;
            }

            // This is to move to the next employee
            payCounter = payCounter + 1;
        }

        // This is to print the final results for all three employees
        System.out.printf("Pay for employee 1: $%.2f%n", total1);
        System.out.printf("Pay for employee 2: $%.2f%n", total2);
        System.out.printf("Pay for employee 3: $%.2f%n", total3);
    } // End of main method
} // End of class SalaryCalc
