package org.univoulu.tol.sqatlab.sudoku;

public class SudokuVerifier {
	private static boolean verifyRows(int[] arrayint) {
		
			int[] xx = new int[9];
			int j=0;
		for (int i = 0; i < arrayint.length; i++) {
			if(i%(float)9 == 0) {
				j=0;
				 xx = new int[9];
			}
			for (int x : xx) {
				if(arrayint[i] == x) {
					return false;
				}
			}
			xx[j++] = arrayint[i];
		}
		return true;
	}

	public static boolean verifyColumn(int[] arrayint) {
		int[] yy = new int[9];
		int j=0;
		
		for (int i = 0; i < arrayint.length; i++) {
			if(i%(float)9 == 0) {
				
				for (int y : yy) {
					if(arrayint[i] == y) {
						return false;
					}
				}
				yy[j] = arrayint[i];

				j++;
			}
		}
		return true;
	}
	
	public static int verify(String candidateSolution) {
		int[] arrayint = new int[candidateSolution.length()];
		
		for (int i = 0; i < arrayint.length; i++) {
			arrayint[i] = Character.getNumericValue(candidateSolution.charAt(i));
		}
		
		 if(!SudokuVerifier.verifyRows(arrayint)) {
			 return -3;
		 }
		 
		 else if(!SudokuVerifier.verifyColumn(arrayint)) {
			 return -4;
		 } 
		 return 0;
	}
}
