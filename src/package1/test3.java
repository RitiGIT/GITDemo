package package1;

public class test3 {

	public static void main(String[] args) {
       test3 obj=new test3();
       obj.mul();
       obj.subs();
       obj.sum();
       obj.div();
	}
   public void mul() {
	   System.out.println("public");
   }
   private void subs() {
	   System.out.println("private");
   }
   protected void sum() {
	   System.out.println("protected");
   }
   
   void div() {
System.out.println("default");
   }
}
