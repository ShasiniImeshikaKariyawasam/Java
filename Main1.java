import java.util.*;
public class Main1 {
    public static void main(String[] args) {
        //System.out.println("Starting to make a coffee\nGrinding coffee beans\nBoiling water\nMixing boiled water with crushed coffee beans\nPouring coffee into the cup\nPouring some milk into the cup\nCoffee is ready!");
        
        Scanner sc = new Scanner(System.in);
        
        // System.out.println("Write how many ml of water the coffee machine has: ");
        // int w = sc.nextInt();
        // System.out.println("Write how many ml of milk the coffee machine has:");
        // int m = sc.nextInt();
        // System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        // int c = sc.nextInt();
        // System.out.println("Write how much money the coffee machine has: ");
        // int money = sc.nextInt();
        // System.out.println("Write how many cups of coffee you will need: ");
        // int cups = sc.nextInt();
        int w = 400;
        int m = 540;
        int c = 120;
        int cups = 9;
        int money = 550;

        // System.out.println("The coffee machine has: ");
        // System.out.println(w + " ml of water");
        // System.out.println(m + " ml of milk");
        // System.out.println(c + " g of coffee beans");
        // System.out.println(cups + " disposable cups");
        // System.out.println("$" + money + " of money");

        menu(w, m, c, cups, money);
        
       //availableCups(w, m, c, cups);
    }

    public static void menu(int w, int m, int c, int cups, int money) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = sc.next();

            switch (action) {
                case "buy":
                    buy(w, m, c, cups, money);
                    break;
                case "fill":
                    fill(w, m, c, cups, money);
                    break;
                case "take":
                    take(w, m, c, cups, money);
                    break;
                case "remaining":
                    remaining(w, m, c, cups, money);
                    break;
                case "exit":
                    exit();
                    break;
                default:
                    System.out.println("Invalid entry!");
            }
       }
    }
    
    public static void buy(int w, int m, int c, int cups, int money) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, 4 - back to main menu:");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                espresso(w, m, c, cups, money);
                break;
            case 2:
                latte(w, m, c, cups, money);
                break;
            case 3:
                cappuccino(w, m, c, cups, money);
                break;
            case 4:
                menu(w, m, c, cups, money);
                break;
            default:
                System.out.println("Invalid entry!");
        }
    }

    public static void espresso(int w, int m, int c, int cups, int money) {
        if (w > 250) {
            if (c > 16) {
                System.out.println("I have enough resources, making you a coffee!");
                cups = cups - 1;  
                money = money + 4;
                w = w - 250;
                c = c - 16;
                remaining(w, m, c, cups, money);
            }
            else {
                System.out.println("Sorry, not enough coffee!");
            }
        }
        else {
            System.out.println("Sorry, not enough water!");
        }

        // int water = w - 250;
        // int coffee = c - 16;
        // int totalMoney = money + 4;
        // int availableCups = cups - 1;

        // System.out.println("The coffee machine has: ");
        // System.out.println(water + " ml of water");
        // System.out.println(m + " ml of milk");
        // System.out.println(coffee + " g of coffee beans");
        // System.out.println(availableCups + " disposable cups");
        // System.out.println("$" + totalMoney + " of money");
    }

    public static void latte(int w, int m, int c, int cups, int money) {
        if(w < 350) {
            System.out.println("Sorry, not enough coffee!");
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
                    remaining(w, m, c, cups, money);
        }
        // if (w > 350) {
        //     if (c > 20) {
        //         if (m > 75) {
        //             System.out.println("I have enough resources, making you a coffee!");
        //             cups = cups - 1;  
        //             money = money + 7;
        //             w = w - 350;
        //             m = m - 75;
        //             c = c - 20;
        //             remaining(w, m, c, cups, money);
        //         }
        //         else {
        //             System.out.println("Sorry, not enough milk!");
        //         }
        //     }
        //     else {
        //         System.out.println("Sorry, not enough coffee!");
        //     }
        // }
        // else {
        //     System.out.println("Sorry, not enough water!");
        // }

        // int water = w - 350;
        // int milk = m - 75;
        // int coffee = c - 20;
        // int totalMoney = money + 7;
        // int availableCups = cups - 1;

        // System.out.println("The coffee machine has: ");
        // System.out.println(water + " ml of water");
        // System.out.println(milk + " ml of milk");
        // System.out.println(coffee + " g of coffee beans");
        // System.out.println(availableCups + " disposable cups");
        // System.out.println("$" + totalMoney + " of money");
    }

    public static void cappuccino(int w, int m, int c, int cups, int money) {
        if(w < 200) {
            System.out.println("Sorry, not enough coffee!");
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
                    money = money + 7;
                    w = w - 350;
                    m = m - 75;
                    c = c - 20;
                    remaining(w, m, c, cups, money);
        }
        // if (w > 200) {
        //     if (c > 12) {
        //         if (m > 100) {
        //             System.out.println("I have enough resources, making you a coffee!");
        //             cups = cups - 1;  
        //             money = money + 6;
        //             w = w - 200;
        //             m = m - 100;
        //             c = c - 12;
        //             remaining(w, m, c, cups, money);
        //         }
        //         else {
        //             System.out.println("Sorry, not enough milk!");
        //         }
        //     }
        //     else {
        //         System.out.println("Sorry, not enough coffee!");
        //     }
        // }
        // else {
        //     System.out.println("Sorry, not enough water!");
        // }
    //     int water = w - 200;
    //     int milk = m - 100;
    //     int coffee = c - 12;
    //     int totalMoney = money + 6; 
    //     int availableCups = cups - 1;
        
    //     System.out.println("The coffee machine has: ");
    //     System.out.println(water + " ml of water");
    //     System.out.println(milk + " ml of milk");
    //     System.out.println(coffee + " g of coffee beans");
    //     System.out.println(availableCups + " disposable cups");
    //     System.out.println("$" + totalMoney + " of money");
    // }
    }

    public static void fill(int w, int m, int c, int cups, int money) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add: ");
        int water = sc.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        int milk = sc.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        int coffee = sc.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add: ");
        int addCups = sc.nextInt();

        // System.out.println("The coffee machine has: ");
        // System.out.println((water + w) + " ml of water");
        // System.out.println((milk + m) + " ml of milk");
        // System.out.println((coffee + c) + " g of coffee beans");
        // System.out.println((addCups + cups) + " disposable cups");
        // System.out.println("$" + money + " of money");
    }

    public static void take(int w, int m, int c, int cups, int money) {
        System.out.println("I gave you $" + money);

        // System.out.println("The coffee machine has: ");
        // System.out.println(w + " ml of water");
        // System.out.println(m + " ml of milk");
        // System.out.println(c + " g of coffee beans");
        // System.out.println(cups + " disposable cups");
        // System.out.println("$0 of money");
    }

    public static void remaining(int w, int m, int c, int cups, int money) {
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