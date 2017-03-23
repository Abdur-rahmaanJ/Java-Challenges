package inc.vomer.design_patterns;

import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // get sentence
        Scanner scanner = new Scanner(System.in);


        int size = scanner.nextInt();

        scanner.nextLine();

        String numbersWithSpaces = scanner.nextLine();
        // process user sentence
        String[] splitNumbersStrings = numbersWithSpaces.split(" ");
        int[] splitNumbers = new int[size];
        for (int i = 0; i < splitNumbersStrings.length; i++) {
            splitNumbers[i] = Integer.parseInt(splitNumbersStrings[i]);
        }

        for (int i = splitNumbers.length - 1; i >= 0; i--) {
            System.out.print(splitNumbers[i] + " ");
        }
    }

}
