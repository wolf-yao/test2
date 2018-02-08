package com.test.½âÊÍÆ÷Ä£Ê½;

public class TerminalExpression implements Expression {
    
	   private String data;

	   public TerminalExpression(String data){
	      this.data = data; 
	   }

	   @Override
	   public boolean interpret(String context) {
	      if(context.contains(data)){
	         return true;
	      }
	      return false;
	   }
	}
