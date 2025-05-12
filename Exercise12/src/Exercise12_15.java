import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_15 {
        public static void main(String[] args) throws FileNotFoundException {
                File file = new File("src/Exercise12_15.txt");
                int[] list = new int[100];

                if (!file.exists()) {
                        try (PrintWriter output = new PrintWriter(file)) {
                                for (int i = 0; i < 100; i++) {
                                        int num = (int)(Math.random() * 101);
                                        output.print(num + " ");
                                }
                        }

                        try (Scanner input = new Scanner(file)) {
                                for (int i = 0; i < 100; i++) {
                                        list[i] = input.nextInt();
                                }
                        }

                        java.util.Arrays.sort(list);
                        for (int num : list) {
                                System.out.print(num + " ");
                        }
                }
                else {
                        System.out.println("File already exists");
                }
        }
}
