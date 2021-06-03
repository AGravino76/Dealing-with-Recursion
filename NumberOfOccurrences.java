import java.util.Scanner;
public class NumberOfOccurrences {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input;
        int[] test = {0, 2, 6, 4, 3, 3, 2, 0, 3, 6, 0, 7, 3};
        int index = 0;

        System.out.println("What number are you looking for in the example array?");
        input = keyboard.nextInt();

        System.out.println("The number " + input + " was found " + numberCount(input, test, index) + " times.");
    }

    /*recursion method needs us to keep searching in an array without a for loop
    plan is to make the index value increment and continue calling until the index is as large as the length of the array*/
    public static int numberCount(int search, int[] array, int runner){
        int count = 0;

        if(runner < array.length){
            if(array[runner] == search){
                count++; /*count is either 0 or 1 because "count" isnt being passed on in the method call but count comes out 
                           as a recursive answer since it adds all the 1's after each consecutive recursive call finishes*/
            }
            return count + numberCount(search, array, runner + 1); //updating runner, which is the index
        }
        else{ //runs the else whenever the index doesnt satisfy first if statement
            return 0;
        }
    }
}
