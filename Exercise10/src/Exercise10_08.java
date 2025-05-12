public class Exercise10_08 {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    public static void main(String[] args) {
        int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950},
            {16700, 67900, 137050, 20885, 372950},
            {8350, 33950, 68525, 104425, 186475},
            {11950, 45500, 117450, 190200, 372950}};

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

        System.out.println("2009 U.S. Federal Personal Tax Rates");
        System.out.println("taxable\tSingle\tMarried\tMarried\tHead of");
        System.out.println("Income\tSingle\tJoint\tSeparate\ta House");

        for (int i = 50000; i <= 60000; i += 1000) {
            Tax tax = new Tax(SINGLE_FILER, brackets, rates, i);
            Tax tax2 = new Tax(MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER, brackets, rates, i);
            Tax tax3 = new Tax(MARRIED_SEPARATELY, brackets, rates, i);
            Tax tax4 = new Tax(HEAD_OF_HOUSEHOLD, brackets, rates, i);
            System.out.printf("%-8d%-8d%-8d%-8d%-8d", i, tax.getTax(), tax2.getTax(), tax3.getTax(), tax4.getTax());
            System.out.println();
        }

        int[][] brackets2 = {
            {27050, 65550, 136750, 297350},
            {45200, 109250, 166500, 297350},
            {22600, 54625, 83250, 148675},
            {36250, 93650, 151650, 297350}};

        double[] rates2 = {0.15, 0.275, 0.305, 0.355, 0.391};

        System.out.println("\n2001 U.S. Federal Personal Tax Rates");
        System.out.println("taxable\tSingle\tMarried\tMarried\tHead of");
        System.out.println("Income\tSingle\tJoint\tSeparate\ta House");

        for (int i = 50000; i <= 60000; i += 1000) {
            Tax tax = new Tax(SINGLE_FILER, brackets2, rates2, i);
            Tax tax2 = new Tax(MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER, brackets2, rates2, i);
            Tax tax3 = new Tax(MARRIED_SEPARATELY, brackets2, rates2, i);
            Tax tax4 = new Tax(HEAD_OF_HOUSEHOLD, brackets2, rates2, i);
            System.out.printf("%-8d%-8d%-8d%-8d%-8d", i, tax.getTax(), tax2.getTax(), tax3.getTax(), tax4.getTax());
            System.out.println();
        }
    }
}

class Tax {
    private int filingStatus;

    private int[][] brackets;

    private double[] rates;

    private double taxableIncome;

    public Tax() {
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getTax() {
        if (taxableIncome <= brackets[filingStatus][0]) {
            taxableIncome = taxableIncome * rates[0];
        }

        else if (taxableIncome <= brackets[filingStatus][1]) {
            taxableIncome = brackets[filingStatus][0] * rates[0] +
                (taxableIncome - brackets[filingStatus][0]) * rates[1];
        }

        else if (taxableIncome <= brackets[filingStatus][2]) {
            taxableIncome = brackets[filingStatus][0] * rates[0] +
                (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                (taxableIncome - brackets[filingStatus][1]) * rates[2];
        }

        else if (taxableIncome <= brackets[filingStatus][3]) {
            taxableIncome = brackets[filingStatus][0] * rates[0] +
                (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2] +
                (taxableIncome - brackets[filingStatus][2]) * rates[3];
        }

        else if (taxableIncome <= brackets[filingStatus][4]) {
            taxableIncome = brackets[filingStatus][0] * rates[0] +
                (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2] +
                (brackets[filingStatus][3] - brackets[filingStatus][2]) * rates[3] +
                (taxableIncome - brackets[filingStatus][3]) * rates[4];
        }

        else {
            taxableIncome = brackets[filingStatus][0] * rates[0] +
                (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2] +
                (brackets[filingStatus][3] - brackets[filingStatus][2]) * rates[3] +
                (brackets[filingStatus][4] - brackets[filingStatus][3]) * rates[4] +
                (taxableIncome - brackets[filingStatus][4]) * rates[5];
        }
        return (int)taxableIncome;
    }


    public int getFilingStatus() {
        return filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
}
