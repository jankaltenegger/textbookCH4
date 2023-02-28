/**
 * @class: AverageOfGrades
 * @author: Jan Kaltenegger
 * @version: 1.0
 * Course: ITEC 2140 - 04
 * Written: February 28, 2023
 *
 * Description: This class calculates the average of x amount of grades the user
 * inputs.
 */
import java.util.Scanner;

public class AverageOfGrades {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your grades, press c to cancel: ");
        String grade = in.nextLine();
        double sum = 0.0;
        double gradeAmount = 0.0;


        while (!grade.equals("c")) {
            sum += Double.parseDouble(grade);
            grade = in.nextLine();
            gradeAmount++;
        }

        double average = sum / gradeAmount;
        System.out.println("Average student grade is " + average);

    }
}
