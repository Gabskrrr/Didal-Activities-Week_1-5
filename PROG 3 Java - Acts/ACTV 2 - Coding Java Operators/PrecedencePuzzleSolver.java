/*
ACT 2-4 :: Precedence Puzzle Solver
@Author: Carl Didal
*/

public class PrecedencePuzzleSolver{
    public static void main (String args[]){
        int num1 = 34, num2 = 23, num3 = 46, num4 = 19;

            /*Guess: Failed, && goes first then the ||. The result of && = False and the result of || = False. */
            if (num1 >= 35 || num2 < 23 && num1 == 34){
                System.out.println("Test 1: Success");
            } else {
                System.out.println("Test 1: Failed");
            }

        int test1 = num1 / num3 + num2 * 43 % num4;
            /*Guess: 1, it is declared as an integer so no decimal point is included*/
            System.out.println("Test 2 = "+ test1);

            /*Guess: False. Simplifying the expressions (False)||(True)&&(False), then solving it leads to (False)||(False) */
            System.out.println("Test 3: "+ ((num1 + 3 / ++num4 == 124) || (1 * 34 > 4 ) && (num2 * num3 <= 4)));

            /*Guess: True . Simplifying the expressions (True)||(False)&&(Ture)||(True), simplifying it more (True)&&(True) */
            System.out.println("Test 4: "+ ((num4 * 6 >= 30 + 84) || (++num3 / 3 <= 7) && (num2 % 2 <= 67) || (--num3 - 3 >= 7)));

            /*Guess: True. Simplifying the epression (True)&&(True)||(True) */
            System.out.println("Test 5: "+ ((num4 * num1 >= num3 + ++num2) && (--num3 / num4 <= num2) || (num1 + num2 * num4 <= num3 * num1)));
  }                                     /*int num1 = 34, num2 = 23, num3 = 46, num4 = 19; */
}