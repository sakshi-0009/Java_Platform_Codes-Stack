/* Problem Statement :-
Your task is to implement  2 stacks in one array efficiently. You need to implement 4 methods.

twoStacks : Initialize the data structures and variables to be used to implement  2 stacks in one array.
push1 : pushes element into first stack.
push2 : pushes element into second stack.
pop1 : pops element from first stack and returns the popped element. If first stack is empty, it should return -1.
pop2 : pops element from second stack and returns the popped element. If second stack is empty, it should return -1.
*/

// Answer :-

class twoStacks {
    int size;
    int top1, top2;
    int[] arr;

    // Constructor to initialize the two stacks
    twoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = size;
    }

    // Function to push an integer into the first stack
    void push1(int x) {
        // Check if there is space for push operation
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Function to push an integer into the second stack
    void push2(int x) {
        // Check if there is space for push operation
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Function to remove an element from the top of the first stack
    int pop1() {
        // Check if the first stack is empty
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        } else {
            System.out.println("Stack1 Underflow");
            return -1;
        }
    }

    // Function to remove an element from the top of the second stack
    int pop2() {
        // Check if the second stack is empty
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        } else {
            System.out.println("Stack2 Underflow");
            return -1;
        }
    }
}
