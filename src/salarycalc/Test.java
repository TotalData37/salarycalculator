package salarycalc;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

        int employeeCount = 3;

        for (int i = 1; i <= employeeCount; i++) {
            System.out.printf("Enter hourly rate for employee %d: ", i);
            double hourlyRate = input.nextDouble();

            System.out.printf("Enter hours worked for employee %d: ", i);
            double hoursWorked = input.nextDouble();

            if (hourlyRate < 0 || hoursWorked < 0) {
                System.out.println("Invalid input. Hourly rate and hours worked must be non-negative.");
                i--; // retry this employee
                continue;
            }

            double pay = hourlyRate * hoursWorked;
            System.out.printf("Pay for employee %d: %.2f%n", i, pay);
        }

        input.close();
    }
}