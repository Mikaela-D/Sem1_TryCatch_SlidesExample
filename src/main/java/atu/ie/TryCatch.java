package atu.ie;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    static final int COMMISSION_RATE = 20;

    public static void main(String[] args) {
        try
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter your sales: ");
            double sales = keyboard.nextDouble();
            double commission = sales * COMMISSION_RATE;
            System.out.printf("Your commission: €%,.2f\n", commission);
        } catch(InputMismatchException e)
        {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Enter a valid numeric value.");
        }
    }
}
