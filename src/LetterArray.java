/*
 * Alejandrina Gonzalez 
 * Pd. 2
 * LetterArray.class
 * */

import java.util.*;
public class LetterArray {

	
	static String letter;
	
	public static void main(String[] args) {
		
		letter = "-";

		String[][] array = new String[4][8];
		
		for (int i = 0; i < array.length; i++){

			for (int n = 0; n < array[i].length; n++){

				array[i][n] = letter;

				if (array[i][n] == array[0][3] || array[i][n] == array[0][4] 

					|| array[i][n] == array[1][2] || array[i][n] == array[1][5] 

					|| array[i][n] == array[2][1] || array[i][n] == array[2][6]

					|| array[i][n] == array[3][0] || array[i][n] == array[3][7]

					|| array[i][n] == array[2][2] || array[i][n] == array[2][3]

					|| array[i][n] == array[2][4] || array[i][n] == array[2][5]){

					array[i][n] = "a";

				}

			}

		}

		

		for (int i = 0; i < array.length; i++){

			for (int n = 0; n < array[i].length; n++){

				System.out.print(array[i][n] + "");

			}

			System.out.println("");

		}
//		String[][] a = new String[][]{
//				{".",".",".",".",".",".",".","."},
//				{".",".",".",".",".",".",".","."},
//				{".",".",".",".",".",".",".","."},
//				{".",".",".",".",".",".",".","."},
//				{".",".",".",".",".",".",".","."},
//				{".",".",".",".",".",".",".","."},
//				{".",".",".",".",".",".",".","."},
//				{".",".",".",".",".",".",".","."}
//		};
//		
//		String[][] aa = new String[5][10];
//		 for (int i = 0; i < aa.length; i++){
//			 for (int j = 0; j < aa[i].length; j++){
//				 System.out.print(aa[i][j]="a");
//			 }
//			 System.out.println("");
//		 }
//		
		// TODO Auto-generated method stub

	}

}
