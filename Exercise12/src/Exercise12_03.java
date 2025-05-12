import java.util.Scanner;

public class Exercise12_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[100];

        for (int i = 0; i < list.length; i++) {
            list[i] = (int)(Math.random() * 101);
        }

        System.out.print("Enter the index of the array: ");
        int index = input.nextInt();

        try {
            System.out.println("Element at index " + index +
                " is " + list[index]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }
    }
}
