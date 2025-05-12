import java.util.Scanner;

public class Exercise07_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] list = new double[10];

        System.out.print("Enter 10 double numbers: ");

        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextDouble();
        }

        bubbleSort(list);
        for (double d : list) {
            System.out.print(d + " ");
        }
    }

    public static void bubbleSort(double[] list) {
        /* On first pass do swapping up to 1 less than last index
        then do swapping up to 1 less index for each subsequent pass

        ex. if arraySize = 10,
        first pass = do swapping up to 8 index
        second pass = do swapping up to 7 index
        third pass = do swapping up to 6 index
        ...
        ninth pass = do swapping up to 0 index
        finished sorting
        */
        for (int pass = 1; pass < list.length; pass++) {
            for (int i = 0; i < list.length - pass; i++) {
                if (list[i] > list[i + 1]) {
                    double temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                }
            }
        }
    }
    
}
