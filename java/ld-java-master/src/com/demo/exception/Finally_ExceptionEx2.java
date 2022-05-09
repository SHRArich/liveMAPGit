package com.demo.exception;
// IP handle NullPointerException too.
public class Finally_ExceptionEx2 {
	public static void main(String[] args) {
		System.err.println("do");
		int result = 0, num1, num2;
		num1 = 1000;
		num2 = 200;
//		num2 = 0;
		String subjectString [] = {"oops","exception hanlding", "collections"};
		try {
			result = num1 / num2;
			System.err.println("not here!");
//			for(int i = 0; i<=subjectString.length; i++)
				for(int i = 0; i< subjectString.length; i++)
				System.err.println(subjectString[i]);
		} catch (ArithmeticException exception) {
			String messageString = exception.getMessage();
			System.err.println("No / 0 " + messageString);
		}
		catch (ArrayIndexOutOfBoundsException exception) {
			String messageString = exception.getMessage();
			System.err.println("Check index : " + messageString);
		}
		finally {
			System.err.println("clean up");
			result = num1 = num2 = 0;
			subjectString = null;
		}
		System.err.println(result);
		System.err.println("done");		
	}
}