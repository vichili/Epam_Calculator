package com.epam.calculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Literal {
	
	public int literals;
	private ArrayList<Literal> literalList;

	public Literal(int literals ) {
		this.literalList = new ArrayList<>();
		this.literals = literals;
		
	}
	
	public void addLiterals(Literal... literalList ) {
		this.literalList.addAll(Arrays.asList(literalList));
		
	}
	
	public ArrayList<Literal> getLiterals() {
		return literalList;
				
	}

}
