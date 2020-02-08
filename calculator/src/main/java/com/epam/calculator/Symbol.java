package com.epam.calculator;

import java.util.ArrayList;
import java.util.Arrays;

public class Symbol {

	public char symbols;
	private ArrayList<Symbol> symbolList;
	
	public Symbol(char symbols ) {
		this.symbols = symbols;
		this.symbolList = new ArrayList<>();
		
	}
	
	public void addSymbols(Symbol...symbolList ) {
		this.symbolList.addAll(Arrays.asList(symbolList));
		
	}
	
	public ArrayList<Symbol> getSymbols(){
		return symbolList;
		
	}

}
