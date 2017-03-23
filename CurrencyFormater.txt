import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormater {

	public static void main(String[] args) {
		String us,india,china,france;
		Scanner scan = new Scanner(System.in);
		double payment = scan.nextDouble();
		
		us = NumberFormat.getCurrencyInstance(
				Locale.US).format(payment);
		china = NumberFormat.getCurrencyInstance(
				Locale.CHINA).format(payment);
		india = NumberFormat.getCurrencyInstance(
				new Locale("en","in")).format(payment);
		france = NumberFormat.getCurrencyInstance(
				Locale.FRANCE).format(payment);
		
		System.out.printf("US: %s\nIndia: %s\nChina: %s\nFrance: %s",us,india,china,france);
		
		scan.close();
	}

}
