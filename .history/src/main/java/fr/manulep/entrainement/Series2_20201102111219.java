package fr.manulep.entrainement;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.math.*;

public class Series2 {
	
	private Series2() {
		 throw new IllegalStateException("Test class");
	}

	public static List<String> selectElementsFromListStartingWithA(List<String> fruits) {
		
		List<String> newList = new ArrayList<String>(); 
		
		for(String first: fruits){
			
			if(first.charAt(0) == 'a'){
				
				newList.add(first);
							
			}
		}return newList; 
		
		
	}

	public static List<String> sortByLastLetter(List<String> names) {
		return new ArrayList<>();
	}
	
	public static String exportWordsWithoutALetter(List<String> names, char letter) {
		return "";
	}
	
	public static String getAllLetters(List<String> words) {
		return "";
	}

	public static List<String> getElementsLowerThanNumber(List<String> elements, int maxi) {
		return new ArrayList<>();
	}

	public static List<Integer> exportPeerElements(List<Integer> elements) {
		return new ArrayList<>();
	}

	public static List<Integer> exportSortPeerElements(List<Integer> elements) {
		return new ArrayList<>();
	}

	public static List<Integer> allElementsExceptFirstAndLast(List<Integer> elements) {
		return new ArrayList<>();
	}
	
	public static List<Integer> reverseOrder(List<Integer> elements) {
		return new ArrayList<>();
	}

	public static List<Integer> swapFirstandLastElement(List<Integer> elements) {
		return new ArrayList<>();
	}

	public static int numberOfPalindromeWord(String text) {
		return 0;
	}

	public static String longestWord(String text) {
		return null;
	}

	public static String getAllLetters(String[] array) {
		return null;
	}

	public static String titleize(String title) {
		return null;
	}

	public static List<String> findAnagrams(String name) {
		return null;
	}

	public static int roundUp(float number) {
		return 0;
	}

	public static int findLastDayOfMonth(int month, int year) {
		return 0;
	}

	public static int factorial(int number) {
		return 0;
	}

	public static int convertToCelsius(int temperature) {
		return 0;
	}

	public static boolean isPeerSum(final int... numbers) {
		/*
		int sumOfNumbers = 0;

		for (int i = 0; i < numbers.length; i++) {
			sumOfNumbers += numbers[i]; 
			System.out.print(sumOfNumbers);
		}*/
		
		
		boolean resultat = false; 
		int num = 0; 

		for (int i = 0; i < numbers.length; i++) {
			num += numbers[i];
		}

		if(num%2 == 0){
			resultat = true;
		}
		return resultat; 
	}

	public static boolean isRightTriangle(int side1, int side2, int side3) {
		return false;
	}

	public static boolean isOrder(int... number) {
		return false;
	}

	public static Float intToFloat(int number) {
		return null;
	}

	public static Integer floatToInt(float number) {
		return null;
	}

	public static String dateToString(LocalDate date, String format) {
		return null;
	}

}
