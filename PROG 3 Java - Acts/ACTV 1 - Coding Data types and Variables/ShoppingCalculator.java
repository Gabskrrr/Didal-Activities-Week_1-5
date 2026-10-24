/*
    ACT 1-2 :: Type-safe Shopping Calculator
@Author: Carl Didal
*/

public class ShoppingCalculator {
  public static void main(String args[]) {
    int quantity = 10;
    double unitPrice = 200.75;
    String storeName = "Rawzu's Meatshop";
    double totalCost = unitPrice * quantity;

    /* totalCost should be a double because the unitprice is a double
    if the totalCost is declared as int it will not count the decimal value */
    
    System.out.println("Store: " + storeName);
    System.out.println("Total items purchased: " + quantity);
    System.out.println("Price per item: " + unitPrice);
    System.out.println("Total: " + totalCost);
  }
}