import java.util.*;
public class Main3 {
    static int w = 400;
    static int m = 540;
    static int c = 120;
    static int cups = 9;
    static int money = 550;

    static int espressoW = 250;
    static int espressoC = 16;
    static int espressoCost = 4;

    static int latteW = 350;
    static int latteC = 20;
    static int latteM = 75;
    static int latteCost = 7;

    static int cappuccinoW = 200;
    static int cappuccinoC = 12;
    static int cappuccinoM = 100;
    static int cappuccinoCost = 6;

    static int totalwater = w;
    static int totalcoffee = c;
    static int totalmilk = m;
    static int totalcups = cups;
    static int totalmoney = money;

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        menu();
        buy();
        espresso();
        latte();
        cappuccino();
        remaining();
        take();
        fill();
        exit();
        
       //availableCups(w, m, c, cups);
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = sc.next();

            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    exit();
                    break;
                default:
                    System.out.println("Invalid entry!");
            }
       }
    }
    
    public static void buy() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 4 - back to main menu:");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                espresso();
                break;
            case 2:
                latte();
                break;
            case 3:
                cappuccino();
                break;
            case 4:
                menu();
                break;
            default:
                System.out.println("Invalid entry!");
        }
    }

    public static void espresso() {
        if (w > 250) {
            if (c > 16) {
                System.out.println("I have enough resources, making you a coffee!");
                cups = cups - 1;  
                money = money + 4;
                w = w - 250;
                c = c - 16;
            }
            else {
                System.out.println("Sorry, not enough coffee!");
            }
        }
        else {
            System.out.println("Sorry, not enough water!");
        }
    }

    public static void latte() {
        if(w < 350) {
            System.out.println("Sorry, not enough water!");
        }
        if (c < 20) {
            System.out.println("Sorry, not enough coffee!");
        }
        if (m < 75) {
            System.out.println("Sorry, not enough milk!");
        }
        if (w > 350 && c > 20 && m > 75) {
            System.out.println("I have enough resources, making you a coffee!");
                    cups = cups - 1;  
                    money = money + 7;
                    w = w - 350;
                    m = m - 75;
                    c = c - 20;
        }
    }

    public static void cappuccino() {
        if(w < 200) {
            System.out.println("Sorry, not enough water!");
        }
        if (c < 12) {
            System.out.println("Sorry, not enough coffee!");
        }
        if (m < 100) {
            System.out.println("Sorry, not enough milk!");
        }
        if (w > 200 && c > 12 && m > 100) {
            System.out.println("I have enough resources, making you a coffee!");
                    cups = cups - 1;  
                    money = money + 6;
                    w = w - 200;
                    m = m - 100;
                    c = c - 12;
        }
    }

    public static void fill() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add: ");
        int water = sc.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        int milk = sc.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        int coffee = sc.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        int addCups = sc.nextInt();
        w = w + water;
        m = m + milk;
        c = c + coffee;
        cups = cups + addCups;
    }

    public static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public static void remaining() {
        System.out.println("The coffee machine has: ");
        System.out.println(w + " ml of water");
        System.out.println(m + " ml of milk");
        System.out.println(c + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money"); 
    }

    public static void exit () {
        System.exit(0);
    }

    public static void availableCups(int w, int m, int c, int cups) {
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