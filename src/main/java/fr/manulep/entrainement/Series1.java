package fr.manulep.entrainement;

public class Series1 {
	
	private Series1() {
		 throw new IllegalStateException("Test class");
	}


	public static String helloWorld(String name) { // permet de rappeler la fonction helloWorld du test.java
		//1
		if (name == "Manu"){
			return "Hello Manu";   /* Si le paramètre de la var helloWorld est = à Manu,
			on retourne "hello manu", sinon on retourne "hello world". L'intérêt est de rep directement aux 2
			autres demandes que sont null et blank au lieu de faire plein de lignes*/
		}else{
			return "Hello World"; // null && blank
		}
		
	}
	

	public static String[] removeNullElements(String[] array) {
		//2
		return null;
	}

	public static int[] addElementToBeginning(int[] array, int element) {
		//3
		return null;
	}
	
	public static int[] allElementsExceptFirstThree(int[] array) {
		//4
		return null;
	}
	
	public static String getFirstHalf(String word) {
		//5
		return null;
	}
	
	public static String[] selectElementsStartingWithA(String[] array) {
		//6
		return null;
	}
	
	public static String[] selectElementsStartingWithVowel(String[]array) {
		//7
		return null;
	}
	
	public static String[] reverseOrderInArray(String[]array) {
		//8
		return null;
	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		//9
		return null;
	}

	public static String shortestWord(String text) {
		//10
		return null;
	}

	public static String removeCapitals(String text) {
		//11
		return null;
	}
	
	public static long addingTwoNumbers(long number1, long number2) {
		//12
		return -1;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		//13
		return -2;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
		//14
		return -1;
	}

	public static float makeNegative(float number) {
		//15
		return 0;
	}

	public static boolean checkForSpecialCharacters(String string) {
		//16
		return false;
	}

	public static boolean checkIfStringStartsWithConsonant( String word ) {
		//17
		return false;
	}

	public static String getDomainName(String email) {
		//18
		return null;
	}

	public static int[] letterPosition(String name) {
		//19
		return null;
	}

	public static boolean isPeer(int number) {
		//20
		return false;
	}


}
