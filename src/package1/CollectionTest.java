package package1;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Object> cars = new LinkedList();
		cars.add("Maruti");
		cars.add("Tesla");
		cars.add("Mercedes");
		cars.add(1);
		
		
     ArrayList<Object> obj = new ArrayList();
     obj.addAll(cars);
     
     int count = obj.size();
		
		for(int i= 0;i<count;i++)
		{
			System.out.println(obj.get(i));
		}
	}

}
