// ──────────────────────────────────────────────────
// Problem  : 225. Implement Stack using Queues
// Difficulty: Easy
// Tags     : Stack, Design, Queue
// Link     : https://leetcode.com/problems/implement-stack-using-queues/
// Runtime  : 1 ms (beats 83%)
// Memory   : 42712000 (beats 72%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

class MyStack {
    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.offer(x);
        int size = q.size();
        // rotate previous elements behind x
        for (int i = 0; i < size - 1; i++) {
            q.offer(q.poll());
        }
    }

    public int pop() {
        return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
