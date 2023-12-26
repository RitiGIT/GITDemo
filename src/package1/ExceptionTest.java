package package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) throws IOException {
		
		ExceptionTest obj = new ExceptionTest();
		obj.division(5);
		obj.readFile();
		

	}
	public void division(int b)
	{   
		try {
		int a= 10;
		//int b=0;
		int c =a/b;
		System.out.println(c);
		if(c<5) {
			throw new Exception("value should be >= 5");
		}
		}
		catch(Exception e) {
			System.out.println("exception occured");
		}
	}
	
	public void readFile() throws IOException 
	{
		File obj=new File("D:\\My Resume\\souvik testing\\demo.txt");
		obj.createNewFile();
		BufferedReader br= new BufferedReader(new FileReader(obj));
	}

}
