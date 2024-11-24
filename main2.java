package vendingmachine;

import java.util.*;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> itemCounts = new HashMap<>();
        List<String> selectedItems = new ArrayList<>();
        double totalPrice = 0;
        int snackCount = 0, beverageCount = 0;

        Snack[] snacks = {
                new Snack("Cracker", 1.50),
                new Snack("Sandwich", 3.00),
                new Snack("Cookie", 2.00),
                new Snack("Chocolate", 2.50)
        };

        Beverage[] beverages = {
                new Beverage("Coffee", 2.00),
                new Beverage("Water", 1.00),
                new Beverage("Tea", 1.50),
                new Beverage("Soda", 1.75)
        };

        while (true) {
            System.out.println("\nSelect an item:");
            System.out.println("1. Coffee\n2. Water\n3. Tea\n4. Soda");
            System.out.println("5. Cracker\n6. Sandwich\n7. Cookie\n8. Chocolate");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();

            if (choice == 9) {
                break;
            }

            String selectedItem = null;
            double price = 0;

            switch (choice) {
                case 1:
                    selectedItem = beverages[0].getName();
                    price = beverages[0].getPrice();
                    beverageCount++;
                    break;
                case 2:
                    selectedItem = beverages[1].getName();
                    price = beverages[1].getPrice();
                    beverageCount++;
                    break;
                case 3:
                    selectedItem = beverages[2].getName();
                    price = beverages[2].getPrice();
                    beverageCount++;
                    break;
                case 4:
                    selectedItem = beverages[3].getName();
                    price = beverages[3].getPrice();
                    beverageCount++;
                    break;
                case 5:
                    selectedItem = snacks[0].getName();
                    price = snacks[0].getPrice();
                    snackCount++;
                    break;
                case 6:
                    selectedItem = snacks[1].getName();
                    price = snacks[1].getPrice();
                    snackCount++;
                    break;
                case 7:
                    selectedItem = snacks[2].getName();
                    price = snacks[2].getPrice();
                    snackCount++;
                    break;
                case 8:
                    selectedItem = snacks[3].getName();
                    price = snacks[3].getPrice();
                    snackCount++;
                    break;
                default:
                    System.out.println("Invalid selection. Try again.");
                    continue;
            }

            selectedItems.add(selectedItem);
            itemCounts.put(selectedItem, itemCounts.getOrDefault(selectedItem, 0) + 1);
            totalPrice += price;

            System.out.println("You selected: " + selectedItem);
        }

        scanner.close();


        System.out.println("\n--- Summary ---");
        System.out.println("Items given to the user: " + selectedItems);
        System.out.println("Total price: $" + totalPrice);
        System.out.println("Total beverages: " + beverageCount);
        System.out.println("Total snacks: " + snackCount);

        String mostGivenItem = Collections.max(itemCounts.entrySet(), Map.Entry.comparingByValue()).getKey();
        String leastGivenItem = Collections.min(itemCounts.entrySet(), Map.Entry.comparingByValue()).getKey();

        System.out.println("Most given item: " + mostGivenItem);
        System.out.println("Least given item: " + leastGivenItem);
    }
}