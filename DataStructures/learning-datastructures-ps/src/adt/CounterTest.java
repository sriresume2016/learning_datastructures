package adt;

public class CounterTest {

	public static void main(String[] args) {
		Counter counter = new Counter("counter1");
		System.out.println(counter);
		System.out.println("Current value = " + counter.currentValue());
		
		counter.increment();
		System.out.println("After increment: " + counter);
		
	}

}
