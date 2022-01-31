package com.java.lab;

import java.util.Iterator;
import java.util.Stack;

public class BalancedClass {

	public static void main(String[] args) {
		// 
		
		
		String bracketExpression = "([[{}]])";
		
		if(isBalanced(bracketExpression)) {
			System.out.println("Balanced");
		}else {
			System.out.println("Unbalanced");
		}

	}

	private static boolean isBalanced(String bracketExpression) {
	
		Stack<Character> stack = new Stack<Character>();
		
		//Iterate through the character
		
		for(int i=0; i<bracketExpression.length();i++) {
			
			
			char character = bracketExpression.charAt(i);
			
			if(character == '(' || character == '[' || character == '{') {
				stack.push(character);
				continue;
			}
			if(stack.isEmpty()) {
				return false;
			}
			
			char c;
			
			
			switch(character) {
			case '}':
				c = stack.pop();
				if(c == '(' || c == '[')
					return false;				
				break;
			case ')':
				c = stack.pop();
				
				if(c == '{' || c == '[') 
					return false;
				break;
			case ']':
				c = stack.pop();
				if(c == '(' || c == '{') 
					return false;
				break;
			}
		}
		
		
		
		//check if c is one of the opening bracket 	( { [
		
		//push to stack
		
		//if not brack pop
		
		
		//if it matches with the correct opening bracket then pop it
		return stack.isEmpty();
	}

}
