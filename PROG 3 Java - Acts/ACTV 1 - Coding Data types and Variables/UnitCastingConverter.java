/*
    ACT 1-3 :: Unit Casting Converter
@Author: Carl Didal
*/

public class ShoppingCalculator {
  public static void main(String args[]) {

    double centimeter = 180.75;
    int wholeMeter = (int) (centimeter*100);
    int remainder = centimeter&100;

        System.out.println("Centimeter: " + centimeter);
        System.out.println("Converted to Meter: " + wholeMeter);
        System.out.println("With the remainder: " + remainder);


    int value1 = 100;
    double value2 = value1;
    
        System.out.println("Display Number: " + value2);

  }
}