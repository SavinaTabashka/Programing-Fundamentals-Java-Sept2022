package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";
        int counter =0;

//password is username reversed
        //вскя позиция в текста - последната(дължина -1) към първата (0)
        for (int i = username.length() - 1; i >=0 ; i--) {
            char currentSymbol = username.charAt(i);
            password += currentSymbol;
        }
        String input = scanner.nextLine();
while (!input.equals(password)){
    counter++;
    if (counter==4){
        System.out.printf("User %s blocked!", username);
        break;
    }
            System.out.println("Incorrect password. Try again.");
    input = scanner.nextLine();

        }
if(input.equals(password)) {

    System.out.printf("User %s logged in.", username);
}
    }
}
