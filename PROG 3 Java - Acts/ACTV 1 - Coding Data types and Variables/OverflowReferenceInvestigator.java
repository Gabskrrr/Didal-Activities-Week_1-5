/*
    ACT 1-3 :: Unit Casting Converter
@Author: Carl Didal
*/


public class OverflowReferenceInvestigator {
  public static void main(String args[]) {

        byte num1 = 127;
        byte num2 = ++num1;

            System.out.println("Overflow: " + num2);

        String name1 = "Carl", name2 = "Carl";
        String name3 = new String("Gabriel"), name4 = new String("Gabriel");
        
            if (name1 == name2) {
            System.out.println(name1 + " & " + name2 + " are the same Value");
            } else {
            System.out.println(name1 + " & " + name2 + " have different Values");
            }

            if (name3 == name4) {
            System.out.println(name3 + " & " + name4 + " are the same Value");
            } else {
            System.out.println(name3 + " & " + name4 + " have different Values");
            }

        int[] primeNumbers1 = {2, 3, 5, 7, 11};
        int[] primeNumbers2 = primeNumbers1;  

        primeNumbers1[2] = 10;

            System.out.println("Prime Array 2: " +primeNumbers2[2]);

  }
}