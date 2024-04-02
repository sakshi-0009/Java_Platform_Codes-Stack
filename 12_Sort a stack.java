/* Problem Statement:-
Given a stack, the task is to sort it such that the top of the stack has the greatest element.
*/

// Answer :-

class GfG{
    
	public Stack<Integer> sort(Stack<Integer> s) {
	    
		Stack<Integer> tempStack = new Stack<>();
        
        while (!s.isEmpty()) {
            int temp = s.pop();
            while (!tempStack.isEmpty() && tempStack.peek() < temp) {
                s.push(tempStack.pop());
            }
            tempStack.push(temp);
        }
        
        // Reverse the stack to get the original order
        Stack<Integer> resultStack = new Stack<>();
        while (!tempStack.isEmpty()) {
            resultStack.push(tempStack.pop());
        }
        
        return resultStack;
	}
}
