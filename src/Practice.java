 import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Practice {

	public static void main(String[] args) {
		
		//Git update
		
		// Practice.iterateString();
		// Practice.iteratorInteger();
		// Practice.usingListInteger();
		// Practice.usingListString();
		// Practice.duplicateInteger();
		// Practice.stringPalindrome();
		// Practice.integerPalindrome();
		// Practice.mergesort();
		// Practice.compare2List();
		// Practice.compare2hashmap();
		// Practice.countsimilarword();
		// Practice.countsimilarCHARS();
		// Practice.vowelsinstring();
		// Practice.fibonacci();
		// Practice.numberofDigits();
		// Practice.numberofDigits2nd();
		// Practice.palindromeInteger();
		// Practice.powerconcept();
		// Practice.primenumber();
		// Practice.primewithinRange();
		// Practice.armstrong();
		// Practice.calculator();
		// Practice.sumofnumbers();
		// Practice.removeSpclChars();
		// Practice.firstletterofeveryword();
		// Practice.duplicateCharsinTwoSttrings();
		// Practice.FizzBuzz();
		// Practice.Sortingwithout3rdvariable();
		// Practice.Reverse();
		// Practice.seperateStrings();
		// Practice.EvenReverse();
		// Practice.MaximumMinimum();
		// Practice.CountOccurences2();
		// Practice.CountOccurences2();
		// Practice.CountOccurences3();
		

		
	}

	// How to iterate String from Set
	public static void iterateString() {
		// Set<String> s= new HashSet<String>(); // Not in sorted sorted order
		Set<String> s = new TreeSet<String>(); // In Sorted Order
		s.add("Arijit");
		s.add("Ghose");
		
		Iterator<String> i = s.iterator();

		String fname = i.next();
		String Lname = i.next();

		System.out.println(fname + " " + Lname);
	}

	// How to iterate Integer values from Set
	public static void iteratorInteger() {
		// Set<Integer> s = new HashSet<Integer>();
		Set<Integer> s = new TreeSet<Integer>();

		s.add(1);
		s.add(5);
		s.add(3);
		
		Iterator<Integer> i = s.iterator();

		int a = i.next();
		int b = i.next();
		int c = i.next();

		System.out.println(a + " " + b + " " + c);
	}

	// How to add data in LinkedList and retrieve from ArrayList
	public static void usingListInteger() {
		// Adding data in linkedList is faster
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(5);

		ArrayList<Integer> listarray = new ArrayList<Integer>();// retrieve from ArrayList is faster

		listarray.addAll(list);// merging LinkedList with ArrayList

		for (int i = 0; i < list.size(); i++) {
			int a = listarray.get(i);
			System.out.println(a);
		}
	}

	// How to take input from console and add data in LinkedList and retrieve from
	// ArrayList
	public static void usingListString() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter total size of input");

		// int n= sc.nextInt(); // it will not work
		int n = Integer.parseInt(sc.nextLine()); // best practice

		String a[] = new String[n];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter value");
			a[i] = sc.nextLine();
		}

		LinkedList<String> list = new LinkedList<String>();

		list.addAll(Arrays.asList(a));

		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.addAll(list);

		System.out.println(arraylist.get(1));
	}

	// Remove duplicate integer using Set interface
	public static void duplicateInteger() {
		// int a[]= {1,2,3,4,4,3,5};
		String a[] = { "Ari", "Gho", "Ari" };

		// Set<Integer> s = new HashSet<Integer>();
		Set<String> s = new HashSet<String>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}

		System.out.println(s);
	}

	public static void stringPalindrome() {
		String str = "abac";
		String palin = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			palin = palin + str.charAt(i);
		}
		if (str.equals(palin)) {
			System.out.println("Palin");
		} else {
			System.out.println("Not palin");
		}
	}

	public static void integerPalindrome() {
		int a = 1213;

		String str = Integer.toString(a);
		String palin = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			palin = palin + str.charAt(i);
		}

		int palin2 = Integer.parseInt(palin);
		if (palin2 == a) {
			System.out.println("Palindrome");
		} else
			System.out.println("Not palindrome");
	}

	public static void mergesort() {
		int a[] = { 2, 1, 5, 4, 3 };
		int b[] = { 4, 10, 6, 8 };

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			list.add(a[i]);
		}

		for (int z = 0; z < b.length; z++) {
			list.add(b[z]);
		}

		Set<Integer> s = new TreeSet<Integer>();
		s.addAll(list);

		System.out.println(s);
	}

	// Compare two ArrayList
	public static void compare2List() {
		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

		System.out.println(list1.equals(list2)); // throws boolean true or false
	}

	// Compare two hashmap
	public static void compare2hashmap() {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();

		map1.put(1, "India");
		map1.put(2, "AU");
		map1.put(3, "Delhi");
		
		Set<Integer> s= map1.keySet();
		for(int key: s)
		{
			System.out.println(key); // to iterate only Key values of a map
		}
		
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();

		map2.put(1, "MY");
		map2.put(2, "PH");
		map2.put(3, "AU");

		// map1.putAll(map2); - Merge two maps but it does hold duplicate values

		System.out.println(map1.equals(map2));// it checks both key and value, so false
		System.out.println(map1.keySet().equals(map2.keySet()));// it checks only key

		Iterator<Integer> i = map1.keySet().iterator();
		while (i.hasNext())// hasnext returns boolean
		{
			int key = i.next();
			System.out.println(key + ",   " + map1.get(key));
		}
	}

	// Count similar words in a string
	public static void countsimilarword() {
		//String string = "My name is Arijit and my name is my";
		String string = "name is name is my name is arijit";
		String word[] = string.split(" ");
		int count = 1;

		for (int i = 0; i < word.length; i++) {
			for (int j = i + 1; j < word.length; j++) {
				if (word[i] != "0" && word[i].equalsIgnoreCase(word[j])) {
					count++;
					word[j] = "0";
				}
			}
			if (word[i] != "0") {
				System.out.println(word[i] + "---" + count);
				count = 1;
			}
		}
	}

	// count of similar characters in a word
	public static void countsimilarCHARS() {
		String word = "ArijitiA";
		char wordArray[] = word.toCharArray();
		int count = 1;
		for (int i = 0; i < wordArray.length; i++) {
			for (int z = i + 1; z < wordArray.length; z++) {
				if (wordArray[i] != '0' && wordArray[i] == (wordArray[z]))// .equals will not work in this case
				{
					count++;
					wordArray[z] = '0';
				}

			}

			if (wordArray[i] != '0') {
				System.out.println(wordArray[i] + "----" + count);
				count = 1;
			}
		}
	}

	// Find vowels in a character
	public static void vowelsinstring() {
		String word = "Arijit";
		for (int i = 0; i < word.length(); i++) {
			if (word.toLowerCase().charAt(i) == 'a' || word.toLowerCase().charAt(i) == 'e'
					|| word.toLowerCase().charAt(i) == 'i' || word.toLowerCase().charAt(i) == 'o'
					|| word.toLowerCase().charAt(i) == 'u') {
				System.out.println(word.charAt(i));
			}
		}
	}

	// Fibonacci Series.
	public static void fibonacci() {
		int num = 20;
		int a = 0;
		int b = 1;

		for (int i = 0; i < num; i++) {
			int c = a + b;
			System.out.println(c);

			a = b;
			b = c;
		}

	}

	// Count by converting to String
	public static void numberofDigits() {
		int num = 1234;
		String s = Integer.toString(num);
		System.out.println(s.length());

	}

	// Count by normal division method
	public static void numberofDigits2nd() {
		int num = 1234;
		int count = 0;

		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count);
	}

	// Palindrome of Integer in normal way
	public static void palindromeInteger() {
		int num = 111;
		int rev = 0;
		int actualnum = num;

		while (num != 0) {
			rev = (rev * 10 + num % 10);
			num = num / 10;
		}

		if (rev == actualnum) // num has changed after while loop so actualnum is used to hold the original
								// num value
		{
			System.out.println("Palindrome");
		} else
			System.out.println("Not palindrome");
	}

	// Pwer Concept with java
	public static void powerconcept() {
		int base = 2;
		int exponent = 3;
		int result = 1;

		for (int i = 0; i < exponent; i++) {
			result = result * base;
		}
		System.out.println(result);
	}

	// Prime Number
	public static void primenumber() {
		int num = 11;
		int temp = 1;

		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				temp++;
			}
		}
		if (temp > 1)
			System.out.println("Not Prime");

		else
			System.out.println("Prime");
	}

	// Prime number within particular range
	public static void primewithinRange() {
		int lower = 10;
		int upper = 20;
		int temp = 1;

		while (lower < upper) {
			for (int i = 2; i <= lower / 2; i++) {
				if (lower % i == 0) {
					temp++;
					break;
				}
			}

			if (temp > 1)
				System.out.println("Not prime" + lower);
			else
				System.out.println("The prime number is  " + lower);

			temp = 1;// to restore the value of temp as 1, else temp holds the previous value.
			lower++;
		}

	}

	// Armstrong with automatic count.
	public static void armstrong() {
		int num = 9474;
		int actnum = num;
		int exponent = num;
		int count = 0;
		double result = 0;

		while (exponent != 0) {
			exponent = exponent / 10;
			count++;
		}
		while (num != 0) {
			int n = num % 10;
			result = result + Math.pow(n, count);
			num = num / 10;
		}

		if (actnum == result)
			System.out.println("Armstrong   " + result);

	}

	// Calculator input from Console
	public static void calculator() {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		System.out.println("Enter value of a");
		int a = sc.nextInt();
		System.out.println("Enter value of b");
		int b = sc.nextInt();

		System.out.println("Enter operator");
		char operator = sc.next().charAt(0);

		switch (operator) {
		case '+':
			result = a + b;
			break;

		case '*':
			result = a * b;
			break;

		default:
			System.out.println("No result");
		}

		System.out.println(result);

	}

	// Sum of natural nums using recursion
	public static void sumofnumbers() {
		int num = 10;
		int sum = addnum(num);
		System.out.println(sum);
	}

	public static int addnum(int num) {
		if (num != 0) {
			return num + addnum(num - 1);
		} else {
			return num;
		}
	}
	
	public static void removeSpclChars()
	{
		 String str = "ar%^yu";
	      str = str.replaceAll("[^a-zA-Z0-9]", "");
	      
	      System.out.println(str);
	}
	
	public static void firstletterofeveryword()
	{
		String s = "Big is good Big of you";
		String arr[]=s.split(" ");
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i].charAt(0));
		}
	}
	
	public static void duplicateCharsinTwoSttrings()
	{
		String s1 = "Selenium";
		String s2 ="Testing";
		
		for(int i=0; i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					System.out.println("Print"+ s1.charAt(i));
				}
			}
		}
		
	}
	
		public static void FizzBuzz()
		{
			int n=100;
			
			for(int i=1;i<n;i++)
			{
				if(i%3==0 && i%5==0)
				{
					System.out.println("Fizz&Buzz ---" + i);
				}
				
				else if(i%3==0)
				{
					System.out.println("Fizz ---" + i);
				}
				
				else if(i%5==0)
				{
					System.out.println("Buzz ---" + i);
				}
				
				else
				{
					System.out.println(i);
				}
			}
		}
		
		public static void Sortingwithout3rdvariable()
		{
			int x[] = {2,5,4,1};
		      
		      for(int i=0; i<x.length; i++)
		      {
		          for(int j=i+1;j<x.length; j++)
		          {
		              if(x[i]>x[j])
		              {
		              x[i] = x[i] + x[j];
		              x[j] = x[i] - x[j];
		              x[i] = x[i] - x[j];
		              }
		          }
		      }

		for(int i=0; i<x.length; i++)
		{
		     System.out.print(x[i]+" ");
		}
		
		}
	
		public static void Reverse()
		{
			String s = "I am joining Capgemini";
			String word[] = s.split(" ");
			String result ="";
		     String rev1="";
		     
		     for(int i=0;i<word.length; i++)
		     {
		         if(word[i].equals("am") || word[i].equals("Capgemini"))
		         {
		             for(int j = word[i].length()-1; j>=0; j--)
		             {
		                 rev1 = rev1 + word[i].charAt(j);
		             }
		             
		             word[i] = rev1;
		         }
		         
		         result = result+word[i]+" ";
		         rev1="";
		         
		     }
		     System.out.println(result);
		}
		
		
		
		
		public static void seperateStrings()
		{
			String input ="Arijit123ghose$%^";
			String alpha="";
			String num="";
			String special="";
			
			for(int i=0; i< input.length(); i++)
			{
				if(Character.isDigit(input.charAt(i)))
				{
					num = num +input.charAt(i);
				}
				
				else if(Character.isAlphabetic(input.charAt(i)))
				{
					alpha = alpha +input.charAt(i);
				}
				
				else
				{
					special = special+input.charAt(i);
				}
			}
			
			System.out.println(alpha);
			System.out.println(num);
			System.out.println(special);
		}
		
		public static void EvenReverse()
		{
			String s = "I am joining Capgemini I love Kolkata";
			String word[] = s.split(" ");
			String rev="";
			
			for(int i=1; i<=word.length; i++)
			{
				if(i%2==0)
				{
					StringBuffer bfr = new StringBuffer(word[i-1]);
					rev = rev + bfr.reverse()+" ";
					
				}
				else
				{
					rev = rev + word[i-1]+" ";
				}
			}
			
			System.out.println(rev.trim());// trim() is used to remove only starting and ending spaces of a string
		}
		
		public static void MaximumMinimum()
		{
			int arr[] = {5,5,7,2,199,5,5,5,99,2};
			Set<Integer> result = new TreeSet<Integer>();
			for(int i=0; i<arr.length; i++)
			{
				result.add(arr[i]);
			}
			
			List<Integer> list = new ArrayList<Integer>();
			list.addAll(result);
			
			System.out.println("Minimum---" + list.get(0));
			System.out.println("Maximum---" + list.get(list.size()-1));
		}
		
		public static void CountOccurences()// check the last output in both occurences
		{
			String str = "aaaabbcccccc";
			
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			for(int i=0; i< str.length(); i++)
			{
				char ch = str.charAt(i);
				String charac = ch+"";
				try
				{
					map.put(charac, map.get(charac)+1);
				}
				catch(Exception e)
				{
					map.put(charac, 1);
				}
			}
			
			for(String s:map.keySet())
			{
				System.out.print(s+""+map.get(s));
			}
		}
		
		public static void CountOccurences2()
		{
			String word = "aaaabbcccccca";
			char wordArray[] = word.toCharArray();
			int count = 1;
			
			for (int i = 0; i < wordArray.length; i++) {
				for (int z = i + 1; z < wordArray.length; z++) {
					if (wordArray[i] != '0' && wordArray[i] == (wordArray[z]))// .equals will not work in this case
					{
						count++;
						wordArray[z] = '0';
					}
					
					else
					{
						break;
					}

				}

				if (wordArray[i] != '0') {
					System.out.print(wordArray[i] + "" + count);// middle space mandatory else not work
					count = 1;
				}
			}
			
		}
		
		public static void CountOccurences3()
		{
			String str = "a12b13c14";
			
			HashMap<String, String> map = new HashMap<String, String>();
			String temp ="";
			for(int i=0; i< str.length(); i++)
			{
			char ch = str.charAt(i);
			String charac = ch+"";
			
			if(Character.isDigit(ch))
			{
				map.put(temp, map.get(temp)+charac);				
			}
			
			else
			{
				map.put(charac, "");
				temp=charac;
			}
			
			}
			
			for(String key:map.keySet())
			{
				for(int i=0;i<Integer.parseInt(map.get(key)); i++)
				{
					System.out.print(key);
				}
			}
		}
		

}

// ArrayList of Integer adavantage and disadvntge
// Ans - ArrayList can contain all types of data like in, string, double etc but ArrayList<Integer> can hold only integer. So, we dont have to validate the data type seperately for Arryls<Intgr>
