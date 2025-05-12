import java.util.Scanner;

public class Exercise04_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter employee's name: ");
		String name = input.next();
		
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		
		System.out.print("Enter federal tax withholding rate: ");
		double fedTaxRate = input.nextDouble();
		
		System.out.print("Enter state tax withholding rate: ");
		double stateTaxRate = input.nextDouble();
		
		double grossPay = payRate * hours;
		
		double fedTaxDeduct = (fedTaxRate * grossPay * 100) / 100;
		double stateTaxDeduct = (stateTaxRate * grossPay * 100) / 100;
		double totalDeduct = fedTaxDeduct + stateTaxDeduct;
		
		double netPay = grossPay - totalDeduct;
		
		System.out.println("Employee Name: " + name);
		System.out.println("Hours Worked: " + hours + "0");
		System.out.println("Pay Rate: $" + payRate);
		System.out.println("Gross Pay: $" + grossPay + "0");
		System.out.println("Deductions: ");
		System.out.println("  Federal Withholding (" + fedTaxRate * 100 + "0%):  $" + fedTaxDeduct + "0");
		System.out.println("  State Withholding (" + stateTaxRate * 100 + "%):  $" + stateTaxDeduct);
		System.out.println("  Total Deduction:  $" + totalDeduct);
		System.out.print("Net Pay:   $" + netPay);
		
		input.close();
		
	}

}
