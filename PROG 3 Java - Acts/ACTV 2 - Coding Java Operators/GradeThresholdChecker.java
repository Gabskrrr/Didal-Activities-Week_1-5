/*
ACT 2-2 :: Grade Threshold Checker
@Author: Carl Didal
*/

public class GradeThresholdChecker {
  public static void main(String args[]) {
    float ave = 90;
    int absence = 5;
    
    if ((ave >= 75 && absence <=3) || (ave >= 90)){
        System.out.println("Passed!");
    } else {
        System.out.println("Failed!");
    }

  }
}