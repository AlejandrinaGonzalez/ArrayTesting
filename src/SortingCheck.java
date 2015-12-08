/*
 * Alejandrina Gonzalez 
 * Pd. 2

 * */

import java.util.*;

public class SortingCheck {
	private static Scanner sortingScanner;
	private static int numberOfColors;

	public static void main(String[] args) {
		
		String a = "Enter different colors separated by a comma and space:";
		System.out.println(a);
		
		sortingScanner = new Scanner(System.in);
		//init scanner, user can enter as many colors as they want
		String string = sortingScanner.nextLine();
		
		//Init array
		ArrayList<String> colorsArray = new ArrayList<String>();
		
		//loop to split colors that are between a comma and a space
		String[] strings = string.split(", ");
		for (String stg: strings){
			//gets string separately
			System.out.println(stg);
			//int to count the # of colors
			numberOfColors++;
			//adds strings to array previously initialized, "numberOfColors - 1" is the index (starting at 0), "stg" is the string added
			colorsArray.add(numberOfColors - 1, stg);
		}
		//prints out the # of colors entered by the user
		System.out.println(numberOfColors);
		//prints the array with the colors in the order entered by the user
		System.out.println(colorsArray);
		//sorts the array in alphabetical order
		Collections.sort(colorsArray, String.CASE_INSENSITIVE_ORDER);
		//prints out sorted array
		System.out.println(colorsArray);

	}
	
}
