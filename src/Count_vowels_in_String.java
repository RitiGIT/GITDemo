import java.util.Scanner;

public class Count_vowels_in_String {
	
public static void main(String args[])
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		for(int i=0; i<str.length();i++)
		{
			int count =0;
			if(str.charAt(i)=='a' || str.charAt(i)=='e')
			{
				count++;
				System.out.println(str.charAt(i)+"   "+count);
			}
			
		}

}
}