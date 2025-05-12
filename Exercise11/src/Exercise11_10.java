import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyStack stack = new MyStack();

        System.out.println("Enter five strings: ");

        for (int i = 0; i < 5; i++) {
            stack.add(input.next());
        }
        stack.reverse();
        System.out.println(stack);
    }
}

class MyStack extends ArrayList<String> {
    public void reverse() {
        ArrayList<String> temp = new ArrayList<>();

        for (int i = 0; i < size(); i++) {
            temp.add(i, get(size() - 1 - i)); // must add before set (element must be there before can set)
        }

        for (int i = 0; i < size(); i++) {
            set(i, temp.get(i));
        }
    }
}
