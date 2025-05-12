public class Exercise06_11 {
    public static void main(String[] args) {
        System.out.println("Sales Amount\t\t  Commission");

        for (int salesAmount = 10000; salesAmount <= 100000; salesAmount+=5000) { // start salesAmount at 10000 go til 100000
            System.out.printf("%-12d\t\t  " + computeCommission(salesAmount), salesAmount); // invoke computeCommission
            System.out.println();
        }
    }

    public static double computeCommission(double salesAmount) {
        double commission = 0;

        if (salesAmount > 10000) {
            commission += (salesAmount - 10000) * .12;
        }
        if (salesAmount > 5000) {
            commission += 5000 * .10;
        }
        if (salesAmount > 0) {
            commission += 5000 * .08;
        }
        return commission;
    }
}
