/*
ACT 4-1 :: Number And Square Printer
@Author: Carl Didal
*/

public class NumberAndSquarePrinter{
    public static void main (String args[]){
        for (int i = 1; i <= 20; i++){ 
            int square = i * i;
            System.out.println("Num: "+ i);
            System.out.println("Square of: "+ i + " = " + square);
        }
    }
}