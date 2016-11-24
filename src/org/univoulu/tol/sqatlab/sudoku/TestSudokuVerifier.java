package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {
	
	public void testFirst3NumberInRecord() {
		String sudoku = "643";
		assertEquals(0, SudokuVerifier.verify(sudoku));
	}
	
	public void testFirstRecord() {
		String sudoku2 = "123456789";
		assertEquals(0, SudokuVerifier.verify(sudoku2));
	}
	
	@Test
	public void testAllRecords() {
		String sudoku2 = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertEquals(0, SudokuVerifier.verify(sudoku2));
	}
	
	@Test
	public void testAllRecordsWrong() {
		String sudoku2 = "417369825632158947958724316825437169791586432346912758289643571573291684164875299";
		assertEquals(-3, SudokuVerifier.verify(sudoku2));
	}
	
	@Test
	public void testFirstcolumn() {
		String sudoku2 = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertEquals(0, SudokuVerifier.verify(sudoku2));
	}
	@Test
	public void testAllcolumn() {
		fail(); //da implementare
	}
	@Test
	public void testAllcolumnWrong() {
		String sudoku2 = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";
		assertEquals(-4, SudokuVerifier.verify(sudoku2));
	}
}
