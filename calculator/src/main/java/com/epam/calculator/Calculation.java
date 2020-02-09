package com.epam.calculator;

import java.util.Scanner;

public class Calculation extends App{
	
	Scanner in = new Scanner(System.in);
	
	public double add(double number1) {
		double number2 = in.nextDouble(); 
		number1 += number2;
		return number1;
	}
	
	public double sub(double number1) {
		double number2 = in.nextDouble(); 
		number1 -= number2;
		return number1;
	}
	
	public double mul(double number1) {
			double number2 = in.nextDouble(); 
			number1 *= number2;
			return number1;
	}
	
	public double div(double number1) {
			double number2 = in.nextDouble(); 
			number1 /= number2;
			return number1;
	}
	
	public Object verifyOperator(char operator) {
		Exception InputMismatchException = null; ;
		if (operator == '+' || operator == '-' || operator == '*' || operator == '/')
			return operator;
		else
			return InputMismatchException;
	}

}
