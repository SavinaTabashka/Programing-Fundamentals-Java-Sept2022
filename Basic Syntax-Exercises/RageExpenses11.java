package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class RageExpenses11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	On the first input line - lost games count – integer in the range [0, 1000].
        //•	On the second line – headset price - the floating-point number in the range [0, 1000].
        //•	On the third line – mouse price - the floating-point number in the range [0, 1000].
        //•	On the fourth line – keyboard price - the floating-point number in the range [0, 1000].
        //•	On the fifth line – display price - the floating-point number in the range [0, 1000].

        int lostGames =Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int countHeadset = lostGames/2;
        int countMouse = lostGames/3;
        int countKeyboard = lostGames/6;
        int countDisplay = lostGames/12 ;

double finalSum = headsetPrice*countHeadset+ mousePrice*countMouse+  keyboardPrice*countKeyboard+ displayPrice *countDisplay;

        System.out.printf("Rage expenses: %.2f lv.", finalSum);

    }
}
