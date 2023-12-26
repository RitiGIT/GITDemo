package package1;

public class test1 extends test2 {

	public static void main(String[] args) {
		test1 obj =new test1();
		obj.sum();

	}
	
	public void sum(int a, int b) {
		int c= a+b;
		System.out.println(c);
	}
	
	public void sum(int a, int b,int c) {
		int d= a+b+c;
		System.out.println(d);

}
	
	public void sum() {
		System.out.println(1000);
	}
}