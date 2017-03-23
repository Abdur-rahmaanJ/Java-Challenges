import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		System.out.print("Input array size: ");
		Scanner in = new Scanner(System.in);
		int arrSize = in.nextInt();
		
		System.out.print("Input array of digits " + 
		    "separated with space: ");
		Scanner sc = new Scanner(System.in);
		String ar = sc.nextLine();
		
		String arr[]=new String[arrSize];
		arr = ar.split(" ");
		
		float digits [] = new float[arrSize];
		
		for(int i=0; i<arr.length; i++){
			digits[i]=Float.parseFloat(arr[i]);
			System.out.println(ar);
		}
		
		float pos = 0;
		float neg = 0;
		float zero = 0;
		
		for(int j = 0; j<digits.length; j++){
			if(digits[j] < 0){
				neg++;
			}else if(digits[j] == 0){
				zero++;
			}else {
				pos++;
			}
		}
		float f = arrSize;
		System.out.printf("positive fraction is %7.6f\n", pos/f);
		System.out.printf("zero fraction is %7.6f\n", zero/f);
		System.out.printf("negative fraction is %7.6f\n", neg/f);
		
	}
}
