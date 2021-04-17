package com.hust.zuoshen.book.stack_queue;

import java.util.Stack;

public class question1 {

    public Stack<Integer> stackData;

    public Stack<Integer> stackMin;

    public question1(){
        this.stackData = new Stack<>();
        this.stackMin = new Stack<>();
    }

    public void push(int newNum) {
        if (stackMin.isEmpty()) {
            stackMin.push(newNum);
        } else if (newNum <= this.getMin()) {
            stackMin.push(newNum);
        }
        stackData.push(newNum);
    }

    public int pop(){
        int value = stackData.pop();
        if (value == this.getMin()) {
            stackMin.pop();
        }
        return value;
    }

    public int getMin(){
        return stackMin.peek();
    }
}
