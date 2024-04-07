/* Problem Statement :-
Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).

Implement the MyStack class:
void push(int x) Pushes element x to the top of the stack.
int pop() Removes the element on the top of the stack and returns it.
int top() Returns the element on the top of the stack.
boolean empty() Returns true if the stack is empty, false otherwise.
*/

// Answer :-

class MyStack {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
        queue1.offer(x);
    }
    
    public int pop() {
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        
        int popped = queue1.poll();
        
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        
        return popped;
    }
    
    public int top() {
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }
        
        int topElement = queue1.peek();
        
        queue2.offer(queue1.poll());
        
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
        
        return topElement;
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}
