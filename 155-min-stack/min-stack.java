
class MinStack {
    int[] arr;
    int[] minarr;
    int top;

    public MinStack() {
        arr = new int[30000];
        minarr = new int[30000];
        top = -1;
    }

    public void push(int val) {
        top++;
        arr[top] = val;

        if (top == 0) {
            minarr[top] = val;
        } else {
            minarr[top] = Math.min(val, minarr[top - 1]);
        }
    }

    public void pop() {
        top--;
    }

    public int top() {
        return arr[top];
    }

    public int getMin() {
        return minarr[top];
    }
}
