package com.test.״̬ģʽ;

public class StatePatternDemo {
	   public static void main(String[] args) {
	      Context context = new Context();

	      StartState startState = new StartState();
	      startState.doAction(context);

	      System.out.println(context.getState().toString());
	      System.out.println(context.toString());

	      StopState stopState = new StopState();
	      stopState.doAction(context);

	      System.out.println(context.getState().toString());
	      System.out.println(context.toString());
	   }
	}
