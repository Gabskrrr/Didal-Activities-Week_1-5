/*
ACT 2-1 :: Four-Function Calculator
@Author: Carl Didal
*/

public class FourFunctionCalculator {
  public static void main(String args[]) {
    int num1 = 12, num2 = 16;
    int sum = num1+num2;
    int diff = num1-num2;
    int product = num1*num2;
    float quotient = num1/num2;
    float modulo = num1%num2;
    
    System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    System.out.println("The difference of " + num1 + " and " + num2 + " is: " + diff);
    System.out.println("The product of " + num1 + " and " + num2 + " is: " + product);
    System.out.println("The quotient of " + num1 + " and " + num2 + " is " + quotient);
    System.out.println("The remainder of " + num1 + " divided by " + num2 + " is " + modulo);
  }
}