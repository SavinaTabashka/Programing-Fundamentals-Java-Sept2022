package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class RageExpenses_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	On the first input line - lost games count – integer in the range [0, 1000].
        //•	On the second line – headset price - the floating-point number in the range [0, 1000].
        //•	On the third line – mouse price - the floating-point number in the range [0, 1000].
        //•	On the fourth line – keyboard price - the floating-point number in the range [0, 1000].
        //•	On the fifth line – display price - the floating-point number in the range [0, 1000].

        int lostGames=Integer.parseInt(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());

        double sumTotal = lostGames/2 *priceHeadset + lostGames/3 * priceMouse + lostGames/6 * priceKeyboard + lostGames/12 * priceDisplay;

        System.out.printf("Rage expenses: %.2f lv.", sumTotal);
    }


}
