import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter students grade:");
        int grade = input.nextInt();

    if((0 <= grade) && (grade <= 100)) { 

        switch(grade/10) { // since, grade is integer and 0 < grade < 100. So, by dividing it by 10. we get a number between 1 to 10
            case 10:                // grade == 100
                System.out.println("Perfect Score");
                break;
            case 9:               // 90 < grade< 100
                System.out.println("Excellent");
                break;
            case 8:              // 80 < grade < 90
                System.out.println("Good");
                break;
            case 7:             //70 < grade < 80
                System.out.println("Above Average");
                break;
            case 6:             // 60 < grade < 70
                System.out.println("Average");
                break;
            case 5:             // 50 < grade < 60
                System.out.println("Below Average");
                break;
            default:
                System.out.println("Not passing");

        }
    } else {
        System.out.println("Entered value is out of range");
    }



    }
    
}
