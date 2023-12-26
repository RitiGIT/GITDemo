import java.util.Scanner;

public class Count_Similar_words_in_String {
	
	public static void main(String args[])
	
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String string = sc.nextLine();
		String stringnew = string.toLowerCase();
		String[] stringnew1 = stringnew.split(" ");
		int count;
		
		for(int i=0; i< stringnew1.length ; i++)
		{
			count=1;
			for(int j=i+1; j< stringnew1.length; j++)
			{
				if(stringnew1[i].equals(stringnew1[j]))
				{
					count++;
					stringnew1[j]="0";
				}
			}
			if(stringnew1[i]!="0")
			{
				System.out.println(stringnew1[i]+"    "+count);
			}
		}
		
		
	}

}
