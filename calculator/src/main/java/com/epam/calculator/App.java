package com.epam.calculator;

import java.util.*;
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

		try {
			result = in.nextDouble();

			do {

				operator = in.next().charAt(0);
				cal.verifyOperator(operator);

				switch(operator) {

				case '+' :  result =  (double) cal.add(result);
				System.out.println("= " + result);
				break;

				case '-' :  result = cal.sub(result); 
				System.out.println("= " + result);
				break;

				case '*' :  result = cal.mul(result);
				System.out.println("= " + result);
				break;

				case '/' :  result = cal.div(result);
				System.out.println("= " + result);
				break;
				
				case '=' : System.out.println("= " + result);;
				System.exit(0);

				}

			}while(true);
		}
		catch (Exception e){
			System.out.println(e + ". Invalid Input");
		}
		
		in.close();

	}
}