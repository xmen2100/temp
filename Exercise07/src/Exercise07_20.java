import java.util.Scanner;

public class Exercise07_20 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        double[] list = new double[10];

        System.out.print("Enter 10 double numbers: ");

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        selectionSort(list);
        for (double num : list) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(double[] list) {
        for (int i = list.length - 1; i > 0; i--) {
            double max = list[i];
            int maxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (max < list[j]) {
                    max = list[j];
                    maxIndex = j;
                }
            }
            if (maxIndex != i) {
                list[maxIndex] = list[i];
                list[i] = max;
            }
        }
    }
}
