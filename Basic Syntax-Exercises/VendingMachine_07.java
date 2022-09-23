package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class VendingMachine_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = (scanner.nextLine());
double sum = 0;
double price =0;
        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);

            if (coins != 0.10 && coins != 0.20 && coins != 0.50 && coins != 1 && coins != 2) {
                System.out.printf("Cannot accept %.2f%n", coins);
            }else{

            sum += coins;}
            input = (scanner.nextLine());
        }
            input = (scanner.nextLine());
            while(!input.equals("End")){
if (!input.equals("Nuts")&&!input.equals("Water") && !input.equals("Crisps") && !input.equals("Soda") && !input.equals("Coke")){

    System.out.println("Invalid product");
}

switch(input){
    case "Nuts":
        price = 2.0;
        if (price<=sum){
            System.out.printf("Purchased %s%n", input);
            sum -= price;
        }else{
            System.out.println("Sorry, not enough money");
        }
        break;
    case "Water":
        price = 0.7;
        if (price<=sum){
            System.out.printf("Purchased %s%n", input);
            sum -= price;
        }else{
            System.out.println("Sorry, not enough money");
        }
       break;
    case "Crisps":
        price = 1.5;
        if (price<=sum){
            System.out.printf("Purchased %s%n", input);
            sum -= price;
        }else{
            System.out.println("Sorry, not enough money");
        }
        break;
    case "Soda":
        price = 0.8;
        if (price<=sum){
            System.out.printf("Purchased %s%n", input);
            sum -= price;
        }else{
            System.out.println("Sorry, not enough money");
        }
        break;
    case "Coke":
        price = 1.0;
        if (price<=sum){
            System.out.printf("Purchased %s%n", input);
            sum -= price;
        }else{
            System.out.println("Sorry, not enough money");
        }
        break;
}
                input = (scanner.nextLine());
        }
        System.out.printf("Change: %.2f ", sum);
    }
}
