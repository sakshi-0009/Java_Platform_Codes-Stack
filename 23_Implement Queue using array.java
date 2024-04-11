/* Problem Statement :-
Implement a Queue using an Array. Queries in the Queue are of the following type:
(i) 1 x   (a query of this type means  pushing 'x' into the queue)
(ii) 2     (a query of this type means to pop element from queue and print the poped element)
*/

// Answer:-

class MyQueue {

    private int front, rear;
    private int[] arr;
    private int maxSize;

    public MyQueue() {
        this.front = 0;
        this.rear = 0;
        this.maxSize = 100005; // Maximum size of the queue
        this.arr = new int[maxSize];
    }

    public void push(int x) {
        if (rear == maxSize) {
            System.out.println("Queue is full. Cannot push element.");
            return;
        }
        
        arr[rear++] = x;
    }

    public int pop() {
        if (front == rear) {
            return -1; // Return -1 if queue is empty (considering it's an integer queue)
        }

        int poppedElement = arr[front++];
        return poppedElement;
    }
}
