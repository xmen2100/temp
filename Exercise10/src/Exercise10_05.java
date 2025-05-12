import java.util.Scanner;

public class Exercise10_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StackOfIntegers stack = new StackOfIntegers();

        System.out.print("Enter an integer: " );
        int num = input.nextInt();

        while (num % 2 == 0) {
            stack.push(2);
            num /= 2;
        }

        for (int i = 3; i * i <= num; i+=2) {
            while (num % i == 0) {
                stack.push(i);
                num /= i;
            }
        }

        if (num > 2) {
            stack.push(num);
        }

        while (!stack.empty()) {
            System.out.println(stack.pop() + " ");
        }

    }
}

class StackOfIntegers {
    private int[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }

    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }

    public void push(int value) {
        if (size >= elements.length) {
            int[] temp = new int[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }

        elements[size++] = value;
    }

    public int pop() {
        return elements[--size];
    }

    public int peek() {
        return elements[size - 1];
    }

    public boolean empty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
