package fr.manulep.entrainement;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Series1 {
	
	private Series1() {
		 throw new IllegalStateException("Test class");
	}


	public static String helloWorld(String name) { // permet de rappeler la fonction helloWorld du test.java
		//1
		if (name=="Manu"){
			return "Hello Manu";   /* Si le paramètre de la var helloWorld est = à Manu,
			on retourne "hello manu", sinon on retourne "hello world". L'intérêt est de rep directement aux 2
			autres demandes que sont null et blank au lieu de faire plein de lignes*/
		}else{
			return "Hello World"; // null && blank
		}
		
	}
	

	public static String[] removeNullElements(String[] array) {
		//2
		String[] out; // on créer directement le tableau string de sortie attendu

		int compteur=array.length; //la var "compteur" va récupérer le nbx de données dans le tableau grâce à .length du array de base
		for (int i = 0; i < array.length; i++) { //notre boucle va parcourir chq indice du tableau array tant que i est inférieur à la longeur de notre tableau array
			String valeur = array[i]; // la var "valeur" est égale à l'indice de notre tableau array. Ce n'est pas indispensable de faire cette var, mais c'est + lisible et + facile de la réutiliser par la suite
			if (valeur==null){ //SI les indices (données/valeurs) du tableau "array" sont = null
				compteur--; //ALORS on les décompte/remove
			}
		}
		out = new String[compteur]; // on récupère notre tableau de sortie finale auquel on assigne les valeurs de notre compteur (les données du tableaux array, sans les nuls)

		int x = 0; // on créer une var x à 0 pour qu'elle puisse commencer au début du tableau array
		for (String valeur : array) { // On va parcourir chaque élément du tableau "array" et on va stocker ça dans la variable "valeur"
			if (valeur !=null) { //en parcourant le tableau, SI la donnée est différent de null
				out[x] = valeur; // ALORS notre variable tableau OUT du début sera rempli par les données récupérées/contenues dans "valeur"
				x++; // On indente x car on se sait pas exactement le nombre de valeurs à récupérer
			}
		}

		return out; // on return notre tableau de type string créé au début, "out"
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
