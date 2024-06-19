package exceptionHandling;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Sample {
	public void show(int a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		Sample s=new Sample();
		/*Consumer<Integer> c=Sample::show;  //classname::static methodname
		c.accept(50);
		al.forEach(Sample::show);*/
		
		//instance method
		Consumer<Integer> c=s::show;  
		c.accept(60);
		al.forEach(s::show);       //objectname::instance method name
		
		
		
		
		
 
	}

}
