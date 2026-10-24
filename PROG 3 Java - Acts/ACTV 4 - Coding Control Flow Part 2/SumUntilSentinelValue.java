/*
ACT 4-2 :: Sum Until Sentinel Value
@Author: Carl Didal
*/

public class SumUntilSentinelValue{
    public static void main (String args[]){
      int num = 10, total = 0;
        while (total != -1) {
            total -= num;
            System.out.println("Total: " + total);
        }
    }
}