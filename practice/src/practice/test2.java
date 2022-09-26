package practice;
import java.util.Scanner;
public class test2 {

	private static int termsLoan = 0;
	private static double interestRate = 0;
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		double principalAmount, rate;
		System.out.println("Enter Principal Amount");
		principalAmount = myObj.nextDouble();
		System.out.println("Enter Interest Rate");
		rate = myObj.nextDouble();
		System.out.println("Enter Terms of Loan");
		termsLoan = myObj.nextInt();
		double installment = 0;
		interestRate = rate / 100;
		double interest = ((principalAmount*interestRate*30)/termsLoan);
		double interestSum = 0;
		double installmentSum = 0;
		double principalSum = 0;
		double monthlyPay= principalAmount / 12;
		
		System.out.println("\tINSTALLMENT AMOUNT \tPRINCPAL AMOUNT \tINTEREST AMOUNT \tOUTSTANDING BALANCE \n\t\t\t\t\t\t\t\t\t\t" + principalAmount);
		for(int i = 1; i <= 12; i++ ){
			
			principalAmount -= monthlyPay;
			installment = interest + monthlyPay;
			principalSum += monthlyPay;
			interestSum += interest;
			
			if(i < 10) {
				System.out.println("0" + i + "\t" + installment + "\t\t\t" + monthlyPay + "\t\t\t" + interest  + "\t\t\t" + principalAmount);
			}
			else{
				System.out.println(i + "\t" + installment + "\t\t\t" + monthlyPay + "\t\t\t" + interest  + "\t\t\t" + principalAmount);
			}
			interest = getInterest(principalAmount);
		}
		System.out.println("TOTAL" + "\t" + interestSum + "\t\t\t" + principalSum + "\t\t\t" + interestSum);
	}
	
	
	private static double getInterest(double principalAmount){
		return ((principalAmount*interestRate*30)/termsLoan);
	}
}