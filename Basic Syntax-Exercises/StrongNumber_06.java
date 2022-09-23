package BasicSyntaxConditionalStatementsAndLoops.Exercises;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int startNumber = num;
int sumFact =0;
while (num> 0){
    int lastDigit = num % 10;

    //namirame foctoriel
    int fact = 1;
    for (int i = 1; i <=lastDigit ; i++) {
        fact = fact*i;
    }
    //sumiram faktoriel
    sumFact +=fact;
    //mahan poslednoto chislo

    num = num/10; // mahame chisloto

}
if (sumFact==startNumber){
    System.out.println("yes");
}else{
    System.out.println("no");
}
    }
}
