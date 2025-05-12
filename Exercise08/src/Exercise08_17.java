import java.util.Arrays;
import java.util.Scanner;

public class Exercise08_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of banks and limit: ");
        int n = input.nextInt();
        int limit = input.nextInt();

        double[][] bankData = new double[n][n];

        System.out.println("Enter each bank's information (the bank's balance followed by " +
            "the number of borrowers, then each borrower's ID and amount borrowed): ");

        for (int i = 0; i < bankData.length; i++) {
            bankData[i][i] = input.nextDouble();

            int numberOfBorrowers = input.nextInt();

            for (int j = 0; j < numberOfBorrowers; j++) {
                int borrowerID = input.nextInt();
                bankData[i][borrowerID] = input.nextDouble();
            }
        }

        boolean[] isSafe = new boolean[bankData.length];
        Arrays.fill(isSafe, true);

        boolean isUpdated;
        do {
            isUpdated = isBankStatusUpdated(bankData, isSafe, limit);
        } while (isUpdated);

        printUnsafeBanks(isSafe);
    }

    public static boolean isBankStatusUpdated(double[][] bankData, boolean[] isSafe, int limit) {
        boolean isUpdated = false;

        for (int i = 0; i < bankData.length; i++) {
            if (isSafe[i]) {
                double totalAssets = calculateTotalAssets(bankData, i);

                if (totalAssets < limit) {
                    isSafe[i] = false;
                    nullifyLoans(bankData, i);
                    isUpdated = true;
                }
            }
        }
        return isUpdated;
    }

    public static double calculateTotalAssets(double[][] bankData, int bankIndex) {
        double total = 0;

        for (double amount : bankData[bankIndex]) {
            total += amount;
        }
        return total;
    }

    public static void nullifyLoans(double[][] bankData, int bankIndex) {
        for (int i = 0; i < bankData.length; i++) {
            bankData[i][bankIndex] = 0;
        }
    }

    public static void printUnsafeBanks(boolean[] isSafe) {
        System.out.print("Unsafe banks are ");
        for (int i = 0; i < isSafe.length; i++) {
            if (!isSafe[i]) {
                System.out.print(i + " ");
            }
        }
    }

}
