import java.util.Scanner;

public class swap2N {

 static void SwapWithTemp (){

    // create two scanner object for storing user input
    Scanner input1 = new Scanner(System.in); 

    System.out.print("Enter the num1:");

    // manually, converting Scanner object to integer
    int num1 =  input1.nextInt(); 

        System.out.print("Enter the num2:"); 
        Scanner input2 = new Scanner(System.in); 
        int num2 =  input2.nextInt(); 

        //Swapping 2 no's using a temprory variable temp
        int temp = num1;
        num1 = num2;
        num2 = temp;
 
        System.out.println("num1 : " + num1); // number + String == String
        System.out.println("num2 : " + num2);

 }

 static void SwapWithoutTemp () {
System.out.println("\n Swapping two number with addition and subtraction");

    // input num1
    Scanner input1 = new Scanner(System.in);
    System.out.print("Enter num1: ");
    int num1 = input1.nextInt();


    // input num2
    Scanner input2 = new Scanner(System.in);
    System.out.print("Enter num2: ");
    int num2 = input2.nextInt();

    //Swapping values using addition and subtraction
    num1 = num1 + num2;
    num2 = num1 - num2;
    num1 = num1 - num2;

    System.out.println("num1 : " + num1);
    System.out.println("num2 : " + num2);

 }

    public static void main(String[] args) {

       SwapWithTemp();
       SwapWithoutTemp();
        // Swapping 2 number without temprory variable
    }
}
