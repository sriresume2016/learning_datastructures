package ds.stack;

public class RealBasicMathExpressionParser {

	public static void main(String[] args) {
		String mathExpression = "(5+2)";
		MyStack<Character> mathChars = new MyStack<>(mathExpression.length());
		int bStartCount=0;
		int result = 0;
		for(char ch : mathExpression.toCharArray()) {
			if(ch == '(') {
				bStartCount++;
				continue;
			}
			else if(ch == ')') {
				bStartCount--;
				result += calculate(mathChars);
				continue;
			}
			mathChars.push(ch);
		}
		System.out.println(result);
	}
	
	static int calculate(MyStack<Character> mathChars) {
		int result = 0;
		int lastValue = 0;
		while(!mathChars.isEmpty()) {
			char value = mathChars.pop();
			switch(value) {
			case '+':
				result += lastValue;break;
			case '-':
				result -= lastValue;break;
			default:
				lastValue = Character.getNumericValue(value);
			}
		}
		return result += lastValue;
			
	}

}
