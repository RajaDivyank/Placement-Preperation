//Design a stack that supports push,pop,top and retrieving the minimum element in constant time

import java.util.ArrayList;

class MinStack {
    ArrayList<Integer> list = new ArrayList<>();
    int minimum;

    public MinStack() {

    }

    public void findMinimum() {
        if (list.isEmpty()) {
            minimum = -1;
            return;
        }
        int n = list.size();
        int x = list.get(0);
        for (int i = 1; i < n; i++) {
            int curr = list.get(i);
            if (curr < x) {
                x = curr;
            }
        }
        this.minimum = x;
    }

    public void push(int n) {
        if (list.isEmpty()) {
            minimum = n;
        } else if (this.minimum > n) {
            minimum = n;
        }
        list.add(n);
    }

    public void pop() {
        if (list.isEmpty()) {
            return;
        }
        int x = list.remove(list.size() - 1);
        if (x == minimum) {
            findMinimum();
        }
    }

    public int top() {
        if (list.isEmpty()) {
            return -1;
        }
        return list.get(list.size() - 1);
    }

    public int getMin() {
        return minimum;
    }
}

public class Program_02 {
    public static void main(String[] args) {
        MinStack st = new MinStack();
        st.push(-2);
        st.push(0);
        st.push(-3);
        System.out.println("Top is" + st.top());
        st.pop();
        st.pop();
        System.out.println("Minimum is" + st.getMin());
    }
}
