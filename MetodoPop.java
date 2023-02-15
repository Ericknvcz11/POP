
public class MetodoPop {

	public static void main(String[] args) {
		MyStack myStack = new MyStack(5); 
		myStack.POP('h');
		myStack.POP('o');
		myStack.POP('l');
		myStack.POP('a');
		
		for (int p = 0; p < myStack.stack.length; p--) {
			System.out.println(myStack.stack[p]); 
		}
	}
}

