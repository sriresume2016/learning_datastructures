package adt;

public class Counter {
	
	private int count;
	private String name;
	
	public Counter(String name) {
		this.name = name;
	}
	
	public void increment() {
		count++;
	}
	
	public int currentValue() {
		return count;
	}
	
	public String toString() {
		return name + "'s current value is = " + count;
	}
	
	
}
