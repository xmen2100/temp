public class Exercise05_39 {
    public static void main(String[] args) {
        final int COMMISSION_SOUGHT = 30000; // set constant = 30000
        double commission;
        double salesAmount = 0;

        do {
            commission = 0; // reset commission to 0 every time

            if (salesAmount > 10000) { // if 25000 then commission += 15000 * .12
                commission += (salesAmount - 10000) * .12;
            }
            if (salesAmount > 5000) {
                commission += 5000 * .10;
            }
            if (salesAmount > 0) {
                commission += 5000 * .08;
            }

            salesAmount++;
        } while (commission < COMMISSION_SOUGHT);
        // Display results (it is subtracted 1 to salesAmount)
        System.out.print("The sales amount " + (int)(salesAmount - 1) + " is needed to make a commission of $30000");
    }
}
