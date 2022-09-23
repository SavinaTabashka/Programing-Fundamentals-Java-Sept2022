package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class Orders_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //•	On the first line, you will receive integer N – the count of orders the shop will receive.
        //•	For each order, you will receive the following information:
        //o	Price per capsule - floating-point number in the range [0.00…1000.00].
        //o	Days – integer in the range [1…31].
        //o	Capsules count - integer in the range [0…2000].

        int countOrders= Integer.parseInt(scanner.nextLine());

double sum =0;
//((daysInMonth * capsulesCount) * pricePerCapsule)


        for (int i = 1; i <= countOrders; i++) {
            double priceCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsules = Integer.parseInt(scanner.nextLine());

            double formula = days*countCapsules*priceCapsule;
            sum+= formula;
            System.out.printf("The price for the coffee is: $%.2f%n", formula);
        }
        System.out.printf("Total: $%.2f", sum);
    }
}
