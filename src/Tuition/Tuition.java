package Tuition;

import java.util.Scanner;

public class Tuition {

	public void Tuition() {
		java.util.Scanner input = new Scanner(System.in);
		
		System.out.println("What is your initial tuition cost?");
		double initTuition = input.nextDouble();
		
		System.out.println("By what percentage will your tuition increase?");
		double initPercentage = 1 + ((input.nextDouble()) / 100);
		
		double total = 0;
		for (int n = 0; n < 4; n++){
			
			double yearlyTotal = initTuition*Math.pow(initPercentage,  n);
			initTuition = yearlyTotal;
			total += yearlyTotal;
			input.close();
		}
		System.out.println("The total tuition is: " + total);
	}
}
