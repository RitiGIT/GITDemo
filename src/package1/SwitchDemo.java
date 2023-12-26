package package1;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchDemo obj = new SwitchDemo();
		obj.print("Jan");
		

	}
	
	public static void print(String a)
	{
		switch (a){
		
		case "Jan":
			System.out.println("Jan");
			break;
			
		case "Feb":
			System.out.println("Feb");
			break;
			
		case "Dec":
			System.out.println("Dec");
			break;
			
			default:
				System.out.println("No match");
		
		}
	}

}
