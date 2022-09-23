package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleAmount = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
double price = 0;

//•	Students – if the group is bigger than or equal to 30 people, you should reduce the total price by 15%
//•	Business – if the group is bigger than or equal to 100 people 10 of them can stay for free.
//•	Regular – if the group is bigger than or equal to 10 and less than or equal to 20 reduce the total price by 5%
        switch(type){
            case "Students":
                if (day.equals("Friday")){
                   price = 8.45;
                } else if (day.equals("Saturday")){
                    price = 9.80;
                }else if(day.equals("Sunday")){
                price = 10.46;
            }
                if (peopleAmount >=30){
                    price = price * 0.85;
                }
                break;
            case "Business":
                if (day.equals("Friday")){
                    price = 10.90;
                } else if (day.equals("Saturday")){
                    price = 15.60;
                }else if(day.equals("Sunday")){
                    price = 16;
                }

                if (peopleAmount >=100){
                    peopleAmount = peopleAmount - 10;
                }
                break;


            case "Regular":
                if (day.equals("Friday")){
                    price = 15;
                } else if (day.equals("Saturday")){
                    price = 20;
                }else if(day.equals("Sunday")){
                    price = 22.50;
                }
                if (peopleAmount >=10 && peopleAmount <=20){
                    price = price * 0.95;
                }
                break;
        }
        double finalSum = price * peopleAmount;

        System.out.printf("Total price: %.2f", finalSum);
    }
}
