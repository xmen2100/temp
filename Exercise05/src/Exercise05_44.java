import java.util.Scanner;

public class Exercise05_44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        short num = input.nextShort();

        System.out.print("The bits are ");

        // shift 15 bits to the right then anded with 1
        // 15 not 16 bc 1 anded with MSB and anded with all the 15 shifted bits
        for (int i = 15; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
    }
}
