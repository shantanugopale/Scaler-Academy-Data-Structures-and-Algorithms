
import java.util.Scanner;

public class FactorialOfNo {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Number : ");
            int num = sc.nextInt();
            int fact = 1;
            int i = 1;
            while (i <= num) {
                fact = fact * i;
                i++;
            }

            System.out.println("Factorial is : " + fact);
        }
    }
}
