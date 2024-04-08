/* Problem Statement :-
Implement a Queue using 2 stacks s1 and s2 .
A Query Q is of 2 Types
(i) 1 x (a query of this type means  pushing 'x' into the queue)
(ii) 2   (a query of this type means to pop element from queue and print the poped element)
*/

// Answer :-

class StackQueue {
    Stack<Integer> s1 = new Stack<>(); // Primary stack for enqueue (push)
    Stack<Integer> s2 = new Stack<>(); // Auxiliary stack for dequeue (pop)

    // Function to push an element in the queue using 2 stacks.
    void Push(int x) {
        s1.push(x); // Push the element onto the primary stack (s1)
    }

    // Function to pop an element from the queue using 2 stacks.
    int Pop() {
        if (s2.isEmpty()) {
            // If s2 is empty, transfer all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        
        // If s2 is still empty, return -1 (indicating queue is empty)
        if (s2.isEmpty()) {
            return -1;
        }
        
        // Pop the top element from s2 (front of the queue)
        return s2.pop();
    }
}
