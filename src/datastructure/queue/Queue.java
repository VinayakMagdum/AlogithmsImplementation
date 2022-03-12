package datastructure.queue;

public class Queue {
    public static void main(String[] args) {
        ArrayQueue arrQueue = new ArrayQueue(5);
        arrQueue.enqueue(1);
        arrQueue.enqueue(2);
        arrQueue.enqueue(3);
        arrQueue.enqueue(4);
        arrQueue.printQueue();
        System.out.println();
        arrQueue.dequeue();
        arrQueue.printQueue();
        System.out.println();
        arrQueue.dequeue();
        arrQueue.printQueue();
    }
}

class ArrayQueue {
    Integer[] queue;
    int front = 0;
    int back = 0;

    ArrayQueue(int capacity) {
        queue = new Integer[capacity];
    }

    public void enqueue(int num) {
        if(back == queue.length) {
            System.out.println("Queue is full");
        } else {
            queue[back] = num;
            back++;
        }
    }

    public void dequeue() {
        if(back - front == 0) {
            System.out.println("Queue is empty");
            front =0;
            back = 0;
        } else {
            queue[front] = null;
            front++;
        }
    }

    public void printQueue() {
        for(int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }
}
