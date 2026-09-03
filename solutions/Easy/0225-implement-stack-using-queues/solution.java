// ──────────────────────────────────────────────────
// Problem  : 225. Implement Stack using Queues
// Difficulty: Easy
// Tags     : Stack, Design, Queue
// Link     : https://leetcode.com/problems/implement-stack-using-queues/
// Runtime  : 0 ms (beats 100%)
// Memory   : 42836000 (beats 54%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class MyStack {
    // Use two queues represented by arrays
    int[] q1 = new int[100]; 
    int[] q2 = new int[100]; 
    int size = 0;

    public MyStack() {
        size = 0;
    }

    public void push(int x) {
        q1[size++] = x;   // add element to q1
    }

    public int pop() {
        // move all but last element to q2
        int i;
        for (i = 0; i < size - 1; i++) {
            q2[i] = q1[i];
        }
        int top = q1[size - 1];
        size--;

        // copy back to q1
        for (i = 0; i < size; i++) {
            q1[i] = q2[i];
        }
        return top;
    }

    public int top() {
        return q1[size - 1];
    }

    public boolean empty() {
        return size == 0;
    }
}
