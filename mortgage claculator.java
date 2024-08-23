import java.util.*;
import java.lang.*;
import java.text.NumberFormat;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Principal: ");
		Long p = sc.nextLong();
		
		System.out.print("Annual Interest Rate: ");
		Double interest = sc.nextDouble();
		double r = (double)((interest/100)/12);
		
		System.out.print("Period(Years): ");
		int period = sc.nextInt();
		int n = (int)(period * 12);
		
		double result = (double)(p*((r*Math.pow((1+r),n))/(Math.pow((1+r),n)-1)));
		
		String mortgage = NumberFormat.getCurrencyInstance().format(result);
		
		System.out.println("Mortgage:"+ mortgage);
	}
}