package exceptionHandling;

import java.util.ArrayList;
import java.util.function.Consumer;

public class SampleConstructor {
	public SampleConstructor(int a) {
		System.out.println(a);
	}

	public SampleConstructor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		SampleConstructor s=new SampleConstructor();
		Consumer<Integer> c= SampleConstructor::new;  //classname::new
		c.accept(70);
		al.forEach(SampleConstructor::new);
		
		

	}

}
