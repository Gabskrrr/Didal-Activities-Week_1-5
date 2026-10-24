/*
ACT 2-3 :: Compound Growth & Increment Checker
@Author: Carl Didal
*/

public class CompoundGrowthIncrementChecker {
  public static void main(String args[]) {
    int balance = 100;
    int count = 0;

    System.out.println("Initial Balance: " + balance);

    for (int i = 1; i <= 4; i++){
        System.out.println("-------------------------------------------");

        balance += 10;
        System.out.println("Incremenbt Balance: " + balance);

        balance *= 2;
        System.out.println("Compunded Balance: " + balance);
        count++;
    }
    System.out.println("-------------------------------------------");
    System.out.println("Counter: "+ count);
  }
}