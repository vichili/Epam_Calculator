package com.epam.calculator;

import java.util.Scanner;
import java.lang.System;

public class App 
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner(System.in);

		Calculation cal = new Calculation();
		double result;
		char operator;

		System.out.println("---------------CALCULATOR---------------");
		System.out.println("Note: Enter Number followed by Arithmetic Operation ");
		System.out.println("Note: Don't give Number as Input in the place Arithmetic Operation");

		try {
			result = in.nextDouble();

			do {

				operator = in.next().charAt(0);
				cal.verifyOperator(operator);

				switch(operator) {

				case '+' :  result = cal.add(result);
				System.out.println(result);
				break;

				case '-' :  result = cal.sub(result); 
				System.out.println(result);
				break;

				case '*' :  result = cal.mul(result);
				System.out.println(result);
				break;

				case '/' :  result = cal.div(result);
				System.out.println(result);
				break;

				case '=' :System.out.println(" = " + result);
				System.exit(0);
				break;

				}

			}while(true);
		}
		catch (Exception e){
			System.out.println(e + ". Invalid Input");
		}

		in.close();

	}
}