import java.util.Scanner;
import java.util.Arrays;
// Write a Java program to find the largest, second largest and smallest of 4 numbers using nested if
// statements. The user should input all numbers. Display a descriptive result in order of Largest,
// 2nd Largest, 3rd Largest, and Smallest.

public class first {
    public static void main(String[] args){
        Scanner input1 = new Scanner(System.in);
        System.out.print("\nEnter the first number:");
        int num1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.print("\nEnter the second number:");
        int num2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.print("\nEnter the third number:");
        int num3 = input3.nextInt();

        Scanner input4 = new Scanner(System.in);
        System.out.print("\nEnter the fourth number:");
        int num4 = input4.nextInt();

        int arr[] = {num1, num2, num3, num4};
        Arrays.sort(arr); //importing sort method from Arrays module

        String str[] = {"first", "second", "third"};

        int count = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (count <= 2) {
                System.out.println(str[count] + " largest number is:\n" + arr[(arr.length - 1) - i]);
            } else {
                System.out.println("smallest number is:\n" + i);
            }
            count++;
        }
        
        

    }
    
}
