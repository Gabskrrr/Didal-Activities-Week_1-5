/*
ACT 4-4 :: Warehouse Inventory Scanner
@Author: Carl Didal
*/

import java.util.Scanner;

public class WarehouseInventoryScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // -1 represents a damaged shelf
        int[][] warehouse = {
            {15, 3, 22, -1},
            {8, -1, 42, 12},
            {2, 19, -1, 30},
            {50, 25, 4, 10}
        };

        int choice;

        do {
            System.out.println("\n========================================");
            System.out.println("      WAREHOUSE INVENTORY SCANNER       ");
            System.out.println("        Enter your choice (1-5):        ");
            System.out.println("========================================");
            System.out.println("1. View Warehouse Layout");
            System.out.println("2. Calculate Total Inventory (Skip Damaged)");
            System.out.println("3. Find First Critically Low Shelf (< 5 items)");
            System.out.println("4. Restock Shelf (Input Validation)");
            System.out.println("5. Exit");
            
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayWarehouse(warehouse);
                    break;
                case 2:
                    calculateTotalInventory(warehouse);
                    break;
                case 3:
                    findCriticallyLowShelf(warehouse);
                    break;
                case 4:
                    restockShelf(warehouse, scanner);
                    break;
                case 5:
                    System.out.println("Exiting Warehouse System. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        } while (choice != 5);

        scanner.close();
    }

    public static void displayWarehouse(int[][] warehouse) {
        System.out.println("\n--- Warehouse Grid Layout ([X] = Damaged) ---");
        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {
                if (warehouse[i][j] == -1) {
                    System.out.printf("%6s", "[X]");
                } else {
                    System.out.printf("%6d", warehouse[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void calculateTotalInventory(int[][] warehouse) {
        int totalItems = 0;

        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {

                if (warehouse[i][j] == -1) {
                    continue; 
                }
                totalItems += warehouse[i][j];
            }
        }
        System.out.println("\nTotal Inventory Count (Damaged Shelves Skipped): " + totalItems);
    }

    public static void findCriticallyLowShelf(int[][] warehouse) {
        boolean found = false;
        int threshold = 5;

        System.out.println("\nScanning for the first critically low shelf (< " + threshold + " items)...");
        
        outerLoop:
        for (int i = 0; i < warehouse.length; i++) {
            for (int j = 0; j < warehouse[i].length; j++) {

                if (warehouse[i][j] != -1 && warehouse[i][j] < threshold) {
                    System.out.println("ALERT: First critically low shelf found at Row " + i + ", Column " + j + 
                                       " with only " + warehouse[i][j] + " items!");
                    found = true;
                    break outerLoop;
                }
            }
        }

        if (!found) {
            System.out.println("All active shelves have adequate inventory levels.");
        }
    }

    public static void restockShelf(int[][] warehouse, Scanner scanner) {
        System.out.println("\n--- Restock Shelf Simulation ---");
        int row = -1;
        int col = -1;

        while (true) {
            System.out.print("Enter row index (0 to " + (warehouse.length - 1) + ", or type -1 to cancel): ");
            row = scanner.nextInt();
            if (row == -1) {
                return; 
            }
            if (row >= 0 && row < warehouse.length) {
                break;
            }
            System.out.println("Invalid row index! Try again.");
        }

        while (true) {
            System.out.print("Enter column index (0 to " + (warehouse[row].length - 1) + "): ");
            col = scanner.nextInt();
            if (col >= 0 && col < warehouse[row].length) {
                break;
            }
            System.out.println("Invalid column index! Try again.");
        }

        if (warehouse[row][col] == -1) {
            System.out.println("Error: Cannot restock a damaged shelf marked as -1!");
            return;
        }

        int amount = -1;
        while (true) {
            System.out.print("Enter quantity to add (must be greater than 0): ");
            amount = scanner.nextInt();
            if (amount > 0) {
                break;
            }
            System.out.println("Invalid amount. Quantity must be a positive integer.");
        }

        warehouse[row][col] += amount;
        System.out.println("Success! Updated inventory at Row " + row + ", Column " + col + " is now " + warehouse[row][col] + ".");
    }
}