package com.epam.calculator;

import java.util.*;
import java.lang.System;

public class App 
{
	public static void main( String[] args )
	{
		Scanner in = new Scanner(System.in);

		Literal literals;
		Symbol symbols;
		double result;
		char operator;

		System.out.println("---------------CALCULATOR---------------");

		result = in.nextDouble();
		literals = new Literal( result );
		literals.addLiterals(literals);

		do {

			operator = in.next().charAt(0);
			symbols = new Symbol( operator );
			symbols.addSymbols(symbols);

			switch(operator) {

			case '+' :  try {
				double number = in.nextDouble(); 
				new Literal(number);
				result += number;
				System.out.println(result);
				break;
			}
			catch (InputMismatchException e){
				System.out.println(e + ". Please, enter correct number");
				in.next();
			}

			case '-' :  try{
				double number1 = in.nextDouble(); 
				new Literal(number1);
				result -= number1;
				System.out.println(result);
				break;
			}
			catch (InputMismatchException e){
				System.out.println(e + ". Please, enter correct number");
				in.next();
			}

			case '*' :  try{
				double number2 = in.nextDouble(); 
				new Literal(number2);
				result *= number2;
				System.out.println(result);
				break;
			}
			catch (InputMismatchException e){
				System.out.println(e + ". Please, enter correct number");
				in.next();
			}


			case '/' :  try {
				double number3 = in.nextDouble(); 
				new Literal(number3);
				result /= number3;
				System.out.println(result);
				break;
			}
			catch (InputMismatchException e){
				System.out.println(e + ". Please, enter correct number");
				in.next();
			}


			case '=' :  ArrayList<Literal> arrayList = literals.getLiterals();
			for(Literal l:arrayList) {
				System.out.println(l.toString());
			}
			break;

			}
		
		}while(true);
	}
}
