import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Practice2.duplicatechar();
		//Practice2.duplicateword();
		//Practice2.fibonacci();
		//Practice2.countDigits();
		//Practice2.palindromeInt();
		//Practice2.palindromeString();
		//Practice2.powerconcept();
		//Practice2.primenumber();
		//Practice2.prime();
		//Practice2.armstrong();
		//Practice2.mergesort();
		//Practice2.bubblesort();
		Practice2.stringiterate();
	}
	
	public static void duplicatechar()
	{
		String word = "ArijitAiii";
		char wordArray[] = word.toCharArray();
		int count =1;
		
		for(int i=0;i<wordArray.length;i++)
		{
			for(int j=i+1;j<wordArray.length;j++)
			{
				if(wordArray[i]!='0' && wordArray[i]==wordArray[j])
				{
					count++;
					wordArray[j]='0';
				}
			}
			
			if(wordArray[i]!='0')
			{
				System.out.println(wordArray[i]+"----"+count);
				count = 1;
			}
		}
	}
	
	public static void duplicateword()
	{
		String string = "My name is my name name";
		String word[] = string.split(" ");
		int count =1;
		for(int i=0;i<word.length;i++)
		{
			for(int j=i+1;j<word.length;j++)
			{
				if(word[i]!="0" && word[i].contentEquals(word[j]))
				{
					count++;
					word[j]="0";
				}
			}
			
			if(word[i]!="0")
			{
				System.out.println(word[i]+"----"+count);
				count = 1;
			}
		}
		
	}
	
	public static void vowels()
	{
		String word = "Arijit";
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)=='a' || word.charAt(i)=='e')
			{
				System.out.println(word.charAt(i));
			}
		}
	}
	
	public static void fibonacci()
	{
		int num = 20;
		int a = 0;
		int b = 1;
		
		while(num!=0)
		{
			int c = a+b;
			
			System.out.println(c);
			a=b;
			b=c;
			num--;
		}
	}
	
	public static void countDigits()
	{
		int num = 1234;
		int count=0;
		while(num!=0)
		{
			num = num/10;
			count++;
		}
		System.out.println(count);
	}
	
	public static void palindromeInt()
	{
		int num = 1212;
		String num1 = Integer.toString(num);
		String palin = "";
		
		for(int i=num1.length()-1;i>=0;i--)
		{
			palin = palin + num1.charAt(i);
		}
		
		int palin1 = Integer.parseInt(palin);
		if(num==palin1)
			System.out.println("palin");
	}
	
	public static void palindromeString()
	{
		String num = "abbac";
		String palin = "";
		
		for(int i=num.length()-1;i>=0;i--)
		{
			palin = palin + num.charAt(i);
		}
		
		if(palin.equals(num))
			System.out.println("palin");
	}
	
	public static void powerconcept()
	{
		int base = 3;
		int exponent =4;
		
		int result = 1;
		
		for(int i = 0; i<exponent;i++)
		{
			result = result * base;
		}
		System.out.println(result);
	}
	
	public static void primenumber()
	{
		int num = 8;
		int temp=1;
		
		for(int i = 2; i<=num/2;i++)
		{
			if(num%i==0)
			{
				temp++;
				break;
			}
		}
		if(temp==1)
			System.out.println("prime");
		else
			System.out.println("Not");
	}
	
	public static void prime()
	{
		int lower =1;
		int upper = 20;
		int temp=1;
		
		while(lower<=upper)
		{
		for(int i = 2; i<=lower/2;i++)
		{
			if(lower%i==0)
			{
				temp++;
				break;
			}
		}
		
		if(temp==1)
			System.out.println("prime"+"--"+lower);
		else
			System.out.println("Not prime"+"--"+lower);
		lower++;
		temp=1;
		}
	}
	
	public static void armstrong()
	{
		int num = 9464;
		int exponent = num;
		int power=num;
		int count = 0;
		double result =0 ;
		
		while(exponent!=0)
		{
			exponent = exponent/10;
			count++;
		}
		
		System.out.println(count);
		
		for(int i=0;i<=count;i++)
		{
			int n = power%10;
			result = result + Math.pow(n, count);
			power=power/10;
		}
		
		if(num==result)
			System.out.println("arm");
	}
	
	public static void mergesort()
	{
		int a[] = {1,2,3,6,4,5};
		int b[] = {10,45,23,7};
		
		ArrayList<Integer> list =  new ArrayList<Integer>();
		
		for(int i=0; i<a.length;i++)
		{
			list.add(a[i]);
		}
		for(int i=0; i<b.length;i++)
		{
			list.add(b[i]);
		}
		
		Set<Integer> set = new TreeSet<Integer>();
		set.addAll(list);
		
		System.out.println(set);
	}
	
	public static void bubblesort()
	{
		int a[] = {1,2,3,6,4,5};
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp = a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		
		for(int i=0; i<a.length;i++)
		{
		System.out.print(a[i]);
		System.out.print(" ");
		}
		
	}
	
	public static void stringiterate()
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Arijit");
		list.add("Ari");
		list.add("gho");
		
		Iterator<String> i = list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
