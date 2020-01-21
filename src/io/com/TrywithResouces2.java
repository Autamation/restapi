package io.com;

import java.io.FileOutputStream;

public class TrywithResouces2 {

	public static void main(String[] args) {
		try(    FileOutputStream fileOutputStream=  
				  new FileOutputStream("D:/Documents/abc.txt")){  
				    // -----------------------------Code to write data into file--------------------------------------------//  
				        String msg = "Welcome to java!";      
				        byte byteArray[] = msg.getBytes();  // Converting string into byte array      
				        fileOutputStream.write(byteArray);  // Writing  data into file  
				        System.out.println("Data written successfully!");  
				}catch(Exception exception){  
				       System.out.println(exception);  
				}  
				finally{  
				       System.out.println("Finally executes after closing of declared resources.");  
				}  

	}

}
