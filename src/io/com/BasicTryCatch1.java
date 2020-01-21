package io.com;

public class BasicTryCatch1 {

	public static void main(String[] args) {
		int num1,num2;
		try{
			num1=0;
			System.out.println("sending the exception");
			num2=62/num1;
			System.out.println(num2);
		}
		catch(ArithmeticException e){
			System.out.println("we can't devide any number by zero");
		}
		catch(Exception e){
			System.out.println("Exception occured");
		}
		System.out.println("Try-Catch ended");

	}

}
