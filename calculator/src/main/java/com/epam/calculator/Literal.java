package com.epam.calculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Literal {
	
	public double literals;
	private ArrayList<Literal> literalList;

	public Literal(double literals ) {
		this.literalList = new ArrayList<>();
		this.literals = literals;
		
	}
	
	public void addLiterals(Literal... literalList ) {
		this.literalList.addAll(Arrays.asList(literalList));
		
	}
	
	public ArrayList<Literal> getLiterals() {
		return literalList;
				
	}
	
	@Override
	public String toString() {
		return " "+ literals ;
	}

}
