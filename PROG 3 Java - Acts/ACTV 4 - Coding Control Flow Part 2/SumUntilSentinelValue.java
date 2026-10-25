/*
ACT 4-2 :: Sum Until Sentinel Value
@Author: Carl Didal
*/
import java.util.Scanner;

public class SumUntilSentinel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter integers then enter -1 to stop adding.");

        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();

        while (input != -1) {
            sum += input; 
            
            System.out.print("Enter an integer: ");
            input = scanner.nextInt();
        }

        System.out.println("\n----------------------------------------");
        System.out.println("Sentinel value (-1) detected. Loop ended.");
        System.out.println("Final Total: " + sum);
        System.out.println("----------------------------------------");

        scanner.close();
    }
}
