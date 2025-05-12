import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exercise12_24 {
    public static void main(String[] args) throws FileNotFoundException {
        try (PrintWriter output = new PrintWriter("src/Salary.txt")) {
            for (int i = 1; i < 101; i++) {
                int rank = (int)(Math.random() * 3);
                String SRank = (rank == 0 ? "assistant" : rank == 1 ?
                    "associate" : "full");

                double salary = switch (rank) {
                    case 0 -> Math.random() * 30000 + 50000;
                    case 1 -> Math.random() * 50000 + 60000;
                    case 2 -> Math.random() * 55000 + 75000;
                    default -> 0;
                };

                output.printf("FirstName%d LastName%d %s %.2f", i, i, SRank, salary);
                if (i < 100) {
                    output.println();
                }
            }
        }
    }
}
