package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	The amount of money George Lucas has – the floating-point number in the range [0.00…1,000.00].
        //•	The count of students – integer in the range [0…100].
        //•	The price of lightsabers for a single saber – the floating-point number in the range [0.00…100.00].
        //•	The price of robes for a single robe – the floating-point number in the range [0.00…100.00].
        //•	The price of belts for a single belt – the floating-point number in the range [0.00…100.00].

        double budget =Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightsabers =Double.parseDouble(scanner.nextLine());
        double priceRobes =Double.parseDouble(scanner.nextLine());
        double priceBelts =Double.parseDouble(scanner.nextLine());

        double sumLightsabers= Math.ceil(students+ students*0.10) *priceLightsabers;
        double sumRobes= students * priceRobes;
        double sumBelts= (students - students/6 ) * priceBelts;

        double sumEquipment = sumLightsabers + sumRobes + sumBelts;

        if (budget >= sumEquipment){
            System.out.printf("The money is enough - it would cost %.2flv.", sumEquipment);
        }else{
            System.out.printf("George Lucas will need %.2flv more.", sumEquipment - budget);
        }
    }
}
