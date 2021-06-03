import java.util.Scanner;
public class AddingUpTo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input = 0;

        System.out.println("To what number do you want to sum up to? Must be a positive value.");
        input = keyboard.nextInt();

        System.out.println("The sum up to " + input + " is: " + sum(input));
    }
    
    public static int sum(int n){
        //just keeps adding until it reaches 0 which doesn't even matter since it wouldn't even change the sum
        if(n==0){
            return 0;
        }
        //incrementing down with the new number
        else{
            return n + sum(n-1);
        }
    }
}
