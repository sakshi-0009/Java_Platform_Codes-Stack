/* Problem Statement :-
Let's give it a try! You have a linked list and you have to implement the functionalities push and pop of stack using this given linked list.
Your task is to use the class as shown in the comments in the code editor and complete the functions push() and pop() to implement a stack. 
*/

// Answer :-

class MyStack {
    class StackNode {
        int data;
        StackNode next;
        StackNode(int a) {
            data = a;
            next = null;
        }
    }   
    StackNode top;
    
    void push(int a) {

        StackNode newNode = new StackNode(a);
        
        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }
    
    int pop() {
        if (top == null) {
            return -1;
        }
        
        int poppedItem = top.data;
        
        top = top.next;
        
        return poppedItem;
    }
}
