/**
 * @class: PrimeOrNot
 * @author: Jan Kaltenegger
 * @version: 1.0
 * Course: ITEC 2140 - 04
 * Written: February 28, 2023
 *
 * Description: This class will tell you if an integer is a prime number or not.
 */
import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        int number = in.nextInt();
        boolean isPrime = true;

        for(int i = 2; i <= number / 2; i++) {
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        }
        else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
