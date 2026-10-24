/*
ACT 3-4 :: ATM Transaction Authorizer
@Author: Carl Didal
*/

public class ATMTransactionAuthorizer {
    public static void main (String args[]) {
        String username = "Sica", tier = "";
        int pin = 1216;
        int limit = 0, count = 1;
        double balance = 3467, withdraw = 300, total = 0;

        if (username.equals("Sica")) {
            if (pin == 1216) {

                /* Check balance for tier */
                if (balance >= 0 && balance < 2000) {
                    tier = "Bronze";
                    limit = 5;
                } else if (balance >= 2000 && balance < 4000) {
                    tier = "Silver";
                    limit = 8;
                } else if (balance >= 4000 && balance < 6000) {
                    tier = "Gold";
                    limit = 10;
                } else if (balance >= 6000) {
                    tier = "Platinum";
                    limit = 20;
                } else {
                    tier = "Plastic";
                }

                /* Check if withdrawn amount is less than or equal to balance, then check if count is less than limit*/
                if (withdraw <= balance) {
                    if (count <= limit) {
                    
                        /* Discounted fee computation */
                        switch (tier) {
                            case "Bronze":
                                total = withdraw * 0.92; 
                                break;
                            
                            case "Silver":
                                total = withdraw * 0.92;
                                break;

                            case "Gold":
                                total = withdraw * 0.94;
                                break;

                            case "Platinum":
                                total = withdraw * 0.96;
                                break;

                            default: 
                                System.out.println("Invalid tier.");
                        }

                        /*Output Stitmints */
                        double fee = withdraw - total; 
                        double remBal = balance - withdraw;
                        System.out.println("Balance: " + balance);
                        System.out.println("Withdrawn amount: " + withdraw);
                        System.out.println("Account Tier: " + tier);
                        System.out.println("Withdrawal Fee: " + fee);
                        System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
                        System.out.println("Total Withdrawn: " + total);
                        System.out.println("Remaining Balance: " + remBal);
                        
                    } else {
                        System.out.println("Daily withdrawal limit has been reached.");
                    }
                } else {
                    System.out.println("Withdrawn amount greater than account balance.");
                }
            } else {
                System.out.println("Invalid PIN.");
            }
        } else {
            System.out.println("Invalid Username.");
        }
    }
}