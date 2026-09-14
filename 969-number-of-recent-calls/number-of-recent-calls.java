class RecentCounter {

    Queue<Integer> queue;
    int count;

    public RecentCounter() {
        queue = new LinkedList<>();
        count = 0;
    }

    public int ping(int t) {

        queue.add(t);
        count++;

        int minimum = t - 3000;

        while (queue.peek() < minimum) {
            queue.poll();
            count--;
        }

        return count;
    }
}