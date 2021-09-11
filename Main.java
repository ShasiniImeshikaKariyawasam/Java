
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Starting to make a coffee\nGrinding coffee beans\nBoiling water\nMixing boiled water with crushed coffee beans\nPouring coffee into the cup\nPouring some milk into the cup\nCoffee is ready!");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Write how many ml of water the coffee machine has: ");
        int w = sc.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int m = sc.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int c = sc.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int amount = sc.nextInt();

        int water = amount * 200;
        int milk =  amount * 50;
        int coffee = amount * 15;

        int restW = w - water;
        int restM = m - milk;
        int restC = c - coffee;

        int cups = checkAmount(restW,restM,restC);
        int availableCups = availableAmount(w,m,c);
        
        if (cups < availableCups ) {
            System.out.println("No, I can make only" + cups + " cup(s) of coffee");
        }
        else if (cups < 1) {
            System.out.println("Yes, I can make that amount of coffee ");
        }  
        else if (cups < availableCups) {
            System.out.println("Yes, I can make that amount of coffee (and even " + cups + " more than that)");
        }
    }

    public static int checkAmount(int rw, int rm, int rc) {
        int count = 0;
        while (rw < 200) {
            while(rm < 50) {
                while (rc < 15) {
                    count += 1;
                }
            }
        }
        return count;
    }
    
    public static int availableAmount(int w, int m, int c) {
        int count = 0;
        while (w < 200) {
            while(m < 50) {
                while (c < 15) {
                    count += 1;
                }
            }
        }
        return count;
    }
}