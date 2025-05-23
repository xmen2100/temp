public class Exercise10_10 {
    public static void main(String[] args) {
        Queue queue = new Queue();

        for (int i = 1; i < 21; i++) {
            queue.enqueue(i);
        }

        while (!queue.empty()) {
            System.out.println(queue.dequeue());
        }
    }
}

class Queue {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    public Queue() {
        elements = new int[DEFAULT_CAPACITY];
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = v;
    }

    public int dequeue() {
        int v = elements[0];

        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
        return v;
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}