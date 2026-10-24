/*
ACT 5-2 :: Class Statistics Calculator
@Author: Carl Didal
*/
import java.util.Arrays;

public class ClassStatisticsCalculator{
    public static void main (String args[]){
       int[] scores = {67,78,56,90,89,76,99,100};
       float sum = 0, average = 0; 
       int highest = scores[0];
       int lowest = scores[0];
       int count = 0;

        for (int i = 0; i < scores.length; i++){
            sum += scores[i];
            average = sum / scores.length;
            count++;
                if (scores[i] > highest) {
                    highest = scores[i];
                }
                if (scores[i] < lowest) {
                    lowest = scores[i];
                }
                    System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~");
                    System.out.println("Sum of Scores: " + sum);
                    System.out.println("Average of Scores: "+ average);
                    System.out.println("Lowest Score: " + lowest);
                    System.out.println("Highest Score: " + highest);
                    System.out.println("Count: " + count);
        }
    }
}