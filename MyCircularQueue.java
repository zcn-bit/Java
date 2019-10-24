class MyCircularQueue {
    private int[] array;
    private int size;
    private int front;//第一个元素下标
    private int rear;//最后一个元素的下一个

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        array = new int[k];
        size = 0;
        front = 0;
        rear = 0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (size == array.length) {
            return false;
        }

        array[rear] = value;
        rear = (rear + 1) % array.length;
        size++;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (size == 0) {
            return false;//  0
        }

        front = (front + 1) % array.length;//去掉第一个元素
        size--;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (size == 0) {
            return -1;
        }

        return array[front];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (size == 0) {
            return -1;
        }

        int index = (rear + array.length - 1) % array.length;
        return array[index];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return size == array.length;
    }
}