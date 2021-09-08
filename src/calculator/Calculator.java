package calculator;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("please enter a number");
		double num1 = obj.nextDouble();
		
		System.out.println("please enter a number");
		double num2 = obj.nextDouble();
		
		double sum = num1 + num2;
		double sub = num1 - num2;
		double mult = num1 * num2;
		double div = num1 / num2;
		
		System.out.println(num1+" + "+num2+" = "+sum+"\n"+   
				           num1+" - "+num2+" = "+sub+"\n"+
				           num1+" * "+num2+" = "+mult+"\n"+
				           num1+" / "+num2+" = "+div+"\n");
		
		
				
		
	}

}
