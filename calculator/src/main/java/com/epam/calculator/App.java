package com.epam.calculator;

import com.epam.calculator.*;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        
        Literal literals;
        Symbol symbols;
        int result;
        char operator;
        
        System.out.println("---------------CALCULATOR---------------");
        
        result = in.nextInt();
    	literals = new Literal( result );
    	literals.addLiterals(literals);
    	
        do {
        	
        	operator = in.next().charAt(0);
        	symbols = new Symbol( operator );
        	symbols.addSymbols(symbols);
        	
        	switch(operator) {
        	
        		case '+' :  int number = in.nextInt(); 
        					new Literal(number);
        					System.out.println(result + number );
        					result += number;
        					break;
        	
        		case '-' :  int number1 = in.nextInt(); 
        					new Literal(number1);
        					System.out.println(result - number1 );
        					result -= number1;
        					break;
        					
        		case '*' :  int number2 = in.nextInt(); 
        					new Literal(number2);
        					System.out.println(result * number2 );
        					result += number2;
        					break;
        					
        		case '/' :  int number3 = in.nextInt(); 
							new Literal(number3);
							System.out.println(result + number3 );
							result += number3;
							break;
        	
        	}
        	
        
        	
        }while(true);
      
        
    }
}
