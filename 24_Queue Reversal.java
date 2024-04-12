/* Problem Statement :-
Given a Queue Q containing N elements. The task is to reverse the Queue. Your task is to complete the function rev(), that reverses the N elements of the queue.
*/

// Answer :-

class GfG{
    public Queue<Integer> rev(Queue<Integer> q){
        Stack<Integer> stack = new Stack<>();
        
        while (!q.isEmpty()) {
            stack.push(q.poll());
        }
        
        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }
        
        return q;
    }

    public static void printQueue(Queue<Integer> q) {
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
        System.out.println();
    }
}
