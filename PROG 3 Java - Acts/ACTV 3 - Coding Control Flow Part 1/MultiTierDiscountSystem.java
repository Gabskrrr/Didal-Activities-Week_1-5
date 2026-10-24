/*
ACT 3-2 :: Multi-Tier Discount System
@Author: Carl Didal
*/

public class MultiTierDiscountSystem{
    public static void main (String args[]){
        double purchaseAmount = 2346;
        double discount = 0, finalPrice = 0;

        if (purchaseAmount >= 1000 && purchaseAmount < 2000){
            discount = purchaseAmount * .05;
            finalPrice = purchaseAmount - discount;
            
                System.out.println("Price: " + purchaseAmount);
                System.out.println("Price (With 5% discount): " + finalPrice);

        } else if (purchaseAmount >= 2000 && purchaseAmount < 3000){
            discount = purchaseAmount * .1;
            finalPrice = purchaseAmount - discount;

                System.out.println("Price: " + purchaseAmount);
                System.out.println("Price (With 10% discount): " + finalPrice);

        } else if (purchaseAmount >= 3000 && purchaseAmount < 4000){
            discount = purchaseAmount * .15;
            finalPrice = purchaseAmount - discount;
            
                System.out.println("Price: " + purchaseAmount);
                System.out.println("Price (With 15% discount): " + finalPrice);

        } else if (purchaseAmount >= 4000 && purchaseAmount < 5000){
            discount = purchaseAmount * .20;
            finalPrice = purchaseAmount - discount;
            
                System.out.println("Price: " + purchaseAmount);
                System.out.println("Price (With 20% discount): " + finalPrice);
                
        } else {
            System.out.println("Price (No discount available): " + purchaseAmount);
        }

  }
}