package ds.stack;

public class MyStackTest {

	public static void main(String[] args) {
		MyStack<Long> myStack = new MyStack<>(5);
		myStack.push(1L);
		myStack.push(2L);
		myStack.push(3L);
		myStack.push(4L);
		myStack.push(5L);
		while(!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}
		//myStack.pop();
		//myStack.push(6L);
		MyStack<Character> reversible = new MyStack<>(5);
		reversible.push('H');
		reversible.push('e');
		reversible.push('l');
		reversible.push('l');
		reversible.push('o');
		while(!reversible.isEmpty()) {
			System.out.print(reversible.pop());
		}
	}

}
