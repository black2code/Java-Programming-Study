package Math;

// ArrayList 를 이용한 스택 구현

import java.util.ArrayList;

class MyStack1 {
    ArrayList list;

    MyStack1() {
        this.list = new ArrayList(); //list에 ArrayList가 할당
    }

    public boolean isEmpty() {
        if(this.list.size() == 0){
            return true;
        }else{
            return false;
        }
    }

    public void push(int data) {
        this.list.add(data);
    }

    public Integer pop() {
        if(this.list.size() == 0){
            System.out.println("Stack is empty!");
            return null;
        }
        int data = (int)this.list.get(this.list.size() -1); // ArraList가 제너릭 하지 않아 형변환 필요
        this.list.remove(this.list.size()-1);
        return data;
    }

    public Integer peek() {
        if(this.list.size() == 0){
            System.out.println("Stack is empty!");
            return null;
        }
        int data = (int)this.list.get(this.list.size() -1);
        return data;
    }

    public void printStack() {
        System.out.println(this.list);
    }
}

public class Stack_Practice1 {
    public static void main(String[] args) {
        // Test code
        MyStack1 myStack = new MyStack1();
        System.out.println(myStack.isEmpty());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.printStack();               // 1, 2, 3, 4, 5

        System.out.println(myStack.peek()); // 5
        myStack.printStack();               // 1, 2, 3, 4, 5

        System.out.println(myStack.pop());  // 5
        System.out.println(myStack.pop());  // 4
        myStack.printStack();               // 1, 2, 3

        System.out.println(myStack.pop());  // 3
        System.out.println(myStack.pop());  // 2
        System.out.println(myStack.pop());  // 1
        myStack.printStack();

    }
}
