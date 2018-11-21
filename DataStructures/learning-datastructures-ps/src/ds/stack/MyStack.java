package ds.stack;

public class MyStack<T> {
	private int size;
	private T[] eleArray;
	private int curIndex;
	
	MyStack(int size){
		eleArray = (T[])new Object[size];
		this.size = size;
		this.curIndex = -1;
	}
	
	public void push(T value) {
		if(curIndex == size-1) {
			throw new RuntimeException("Stack is full!");
		}
		eleArray[++curIndex] = value;
	}
	
	public T pop() {
		if(curIndex == -1) {
			throw new RuntimeException("Stack is empty!");
		}
		return eleArray[curIndex--];
	}
	
	public T peek() {
		return eleArray[curIndex];
	}
	
	public boolean isEmpty() {
		return curIndex == -1;
	}
	
	public boolean isFull() {
		return curIndex == size-1;
	}
}
