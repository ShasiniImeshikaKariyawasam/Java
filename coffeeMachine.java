
import java.util.*;
public class coffeeMachine {
    public static void main(String[] args) {
        System.out.println("Starting to make a coffee\nGrinding coffee beans\nBoiling water\nMixing boiled water with crushed coffee beans\nPouring coffee into the cup\nPouring some milk into the cup\nCoffee is ready!");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Write how many ml of water the coffee machine has: ");
        int w = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int m = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int c = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = scanner.nextInt();

        availableCups(w, m, c, cups);

    }

    public static void availableCups(int w, int m, int c, int cups) {
        //available amount of cups in stock
        int waterCup = w / 200;
        int milkCup = m / 50;
        int coffeeCup = c / 15;

        int[] arr = {waterCup, milkCup, coffeeCup};
        int arrLength = arr.length;
        int min = arr[0];  
        for (int i = 0; i < arrLength; i++) {
            if (arr[i] < min)
                min = arr[i];
        } 

        int possibleMaxAmount = min;
        int additionalCups = possibleMaxAmount - cups; 

        if (cups <= waterCup && cups <= milkCup && cups <= coffeeCup) {
            if (additionalCups > 0) {
                System.out.println("Yes, I can make that amount of coffee (and even " + additionalCups + " more than that)");
            }
            else {
                System.out.println("Yes, I can make that amount of coffee");
            }
        }
        else {
            System.out.println("No, I can make only " + possibleMaxAmount + " cup(s) of coffee");
        }

    }
}