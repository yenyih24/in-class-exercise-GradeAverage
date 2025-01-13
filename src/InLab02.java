/*
 * Student Name: Yen-Yi Hsu
 * Lab Professor: Professor Amal Ibrahim
 * Due Date: 2024/05/29
 * Modified: 2024/05/29
 * Description: calculates and displays the average of three grades entered by the user.
 *              
 */

import java.util.Scanner;

public class InLab02 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Initialize variables to store grades
		double grade1, grade2, grade3, average;

		// Prompt the user to input grades for three subjects
		System.out.println("Enter grades for three subjects:");

		System.out.print("Grade 1: ");
		grade1 = input.nextDouble();

		System.out.print("Grade 2: ");
		grade2 = input.nextDouble();

		System.out.print("Grade 3: ");
		grade3 = input.nextDouble();

		// Calculate the average of the three grades
		average = (grade1 + grade2 + grade3) / 3;

		// Display the average grade
		System.out.println("\nAverage Grade:");
		System.out.println(average);

	}

}
