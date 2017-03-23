import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class ArrayM {

	public static void main(String[] args) throws IOException  {
		BufferedReader reader = 
				new BufferedReader(new InputStreamReader(System.in));
		Scanner scanN = new Scanner(System.in);
		int N = scanN.nextInt();
		String[] A = reader.readLine().split(" ");
		for (int i = (N - 1); i>= 0; i--)
		{
			System.out.print(A[i]);
			if(i != 0)
			{
				System.out.print(" ");
			}
		}
		scanN.close();
	}
}
