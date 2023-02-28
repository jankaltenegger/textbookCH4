/**
 * @class: SumOfDigits
 * @author: Jan Kaltenegger
 * @version: 1.0
 * Course: ITEC 2140 - 04
 * Written: February 28, 2023
 *
 * Description: This class calculates the sum of digits of an integer.
 */
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        String number =  in.nextLine();
        int index = 0;
        char c;
        int sum = 0;

        while (index < number.length()){
            c = number.charAt(index);
            int digit = c - '0';
            sum += digit;
            index++;
        }
        System.out.println("Sum of digits of " + number + " is " + sum);
    }
}
