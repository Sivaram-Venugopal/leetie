// ──────────────────────────────────────────────────
// Problem  : 341. Flatten Nested List Iterator
// Difficulty: Medium
// Tags     : Stack, Tree, Depth-First Search, Design, Queue, Iterator
// Link     : https://leetcode.com/problems/flatten-nested-list-iterator/
// Runtime  : 4 ms (beats 46%)
// Memory   : 47708000 (beats 96%)
// Language : java
// Copyright: (c) 2026 Sivaram-Venugopal. All rights reserved.
// Synced by: leetie
// ──────────────────────────────────────────────────

import java.util.*;

public class NestedIterator implements Iterator<Integer> {

    private Deque<NestedInteger> stack = new ArrayDeque<>();

    public NestedIterator(List<NestedInteger> nestedList) {
        for (int i = nestedList.size() - 1; i >= 0; i--) {
            stack.push(nestedList.get(i));
        }
    }

    @Override
    public Integer next() {
        return stack.pop().getInteger();
    }

    @Override
    public boolean hasNext() {
        while (!stack.isEmpty()) {
            NestedInteger curr = stack.peek();

            if (curr.isInteger()) {
                return true;
            }

            stack.pop();

            List<NestedInteger> list = curr.getList();
            for (int i = list.size() - 1; i >= 0; i--) {
                stack.push(list.get(i));
            }
        }

        return false;
    }
}
