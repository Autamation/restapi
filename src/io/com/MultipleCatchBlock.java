package io.com;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try{
			int a[]=new int[5];
			System.out.println(a[10]);
		}
		catch(ArithmeticException e){
			System.out.println("Arithmetic exception occure");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("ArrayIndexOutOfBounds exception occure");
		}
		catch(Exception e){
			System.out.println("Parent exception occure");
		}
		System.out.println("rest of the code");
	}

}
