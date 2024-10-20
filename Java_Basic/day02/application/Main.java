package application;

import java.util.Scanner;

import model.exception.NumberInputException;

public class Main {
    public static void main(String[] args) throws NumberInputException {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("put the x number: ");
            double x = sc.nextDouble();

            System.out.print("put the y number: ");
            double y = sc.nextDouble();
            System.out.println("Total: " + sumTwoNumbers(x, y));

        } catch(Exception e) {
            throw new NumberInputException("Input must be numeric.");
        } finally {
            sc.close();
        }
    }

    private static Double sumTwoNumbers(Double x, Double y) {
        return x + y;
    }
}