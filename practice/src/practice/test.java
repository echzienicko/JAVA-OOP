package practice;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		double principalAmount, rate;
		System.out.println("Enter Principal Amount");
		principalAmount = myObj.nextDouble();
		System.out.println("Enter Interest Rate");
		rate = myObj.nextDouble();
		System.out.println("Enter Terms of Loan");
		int termsLoan;
		termsLoan = myObj.nextInt();
		double interestRate = rate / 100;
		double interestSum = 0;
		double installmentSum = 0;
		double principalSum = 0;
		double monthlyPay= principalAmount / 12;
		
		for( double i = principalAmount; i >= monthlyPay; i -=monthlyPay ){
			principalAmount -= monthlyPay;
			System.out.println("Amount: "+principalAmount);
			double interest = ((i*interestRate*30)/termsLoan);
			double installment = interest + monthlyPay;
			System.out.println("Installment: " + installment + " Principal: " + monthlyPay + " Interest: " + interest + " Outstanding Balance: " + i);
			installmentSum += installment;
			principalSum += monthlyPay;
			interestSum += interest;
		}
		System.out.println("TOTAL:      " + installmentSum + "           " + principalSum + "         " + interestSum);
	}
}
