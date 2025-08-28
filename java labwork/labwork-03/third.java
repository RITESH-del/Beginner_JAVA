
public class third {
    public static void main(String[] args){
        //first triangle
        for(int i = 0; i <= 5; i++){
            System.out.print('\n');
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
        }
        //second triangle
        for(int i = 0; i <= 5; i++){
            System.out.print('\n');
            for(int j = 0; j <= (4-i); j++){
                System.out.print("*");
            }
        }
    }
    
}
