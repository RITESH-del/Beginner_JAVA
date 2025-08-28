import java.util.Scanner;

public class CelciusToFahr {
    static public void main(String[] args) {

        while (true) {

        Scanner Input = new Scanner(System.in); //Store input in Scanner object via Input variable

        System.out.print("Enter temprature in degree celcius:"); //prompt user for input

        double celcius = (double) Input.nextDouble(); // manually Converting celcius to double/narrowing typecasting

        double Fahrenhiet = (9.0/5) * celcius + 32;

        System.out.println(Fahrenhiet + "deg F"); //returning the output to the user

    }}
}