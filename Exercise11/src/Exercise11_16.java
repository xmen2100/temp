import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_16 {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();

        while (number1 + number2 != answer) {
            boolean isDuplicate = list.contains(answer);
            if (isDuplicate) {
                System.out.println("You already entered " + answer);
            }
            else {
                list.add(answer);
            }
            System.out.print("Wrong answer. Try again. What is "
                + number1 + " + " + number2 + "? ");
            answer = input.nextInt();
        }

        System.out.println("You got it!");
    }
}
