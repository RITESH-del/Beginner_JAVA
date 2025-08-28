import java.util.Scanner;
public class timeConversion {

    static void toHours(int secs) {
        int hrs = secs / 3600;

        while(hrs > 24) {
            hrs -= 24;
        }


        System.out.print(hrs + " : ");
    }

    static void toMins(int secs) {
        int mins = secs / 60;

        while(mins > 60) {
            mins -= 60;
        }


        System.out.print(mins + " : ");
    }
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of seconds:"); // use print() instead of println(), to avoid nextline
        int secs = input.nextInt();


        System.out.println("hrs:mins:secs"); //template code 

        toHours(secs);
        toMins(secs);

        while(secs > 60) {
            secs -= 60;
        }
        System.out.println(secs);

    }
}
