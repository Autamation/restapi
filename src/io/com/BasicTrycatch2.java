package io.com;

public class BasicTrycatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	int number1=10/0;//may throws Exception
}
catch(Exception e){//generating the exception in catch block
	int number2=10/0;//may throw Exception
}
System.out.println("rest of the code");
	}

}
