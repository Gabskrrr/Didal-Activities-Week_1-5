/*
ACT 4-3 :: Pattern Generator With Early Exit
@Author: Carl Didal
*/

public class PatternGeneratorWithEarlyExit {
    public static void main(String[] args) {
        int size = 5; // Define the maximum size of the pattern
        
        System.out.println("Generating Right-Triangle Pattern (Skipping Row 3, Stopping Inner Loop at Col 4):");
        System.out.println("-----------------------------------------------------------------------------");
        //Outer loop controls the rows
        for (int i = 1; i <= size; i++) {
            //CONTINUE DEMONSTRATION: Skip printing row 3 entirely using "continue"
            if (i == 3) {
                System.out.println("Row " + i + " skipped using 'continue'.");
                continue; // Skips the rest of this iteration and moves to the next row
            }
            for (int j = 1; j <= size; j++) {
                
                //BREAK DEMONSTRATION: Stop the inner loop early if column reaches 4
                if (j > 3) {
                    break; // Exits the inner loop prematurely when j exceeds 3
                }

                // Print the pattern character
                System.out.print("* ");
            }
            // Move to the next line after each row finishes
            System.out.println();
        } 
        System.out.println("-----------------------------------------------------------------------------");
    }
}
