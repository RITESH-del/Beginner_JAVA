import java.util.Scanner;

public class RuleOf72Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the interest rate (in %): ");
        double rate = scanner.nextDouble();

        double years = 72 / rate;
        
        System.out.printf("Your investment will double in approximately %.2f years.\n", years);

        scanner.close();
    }
} 