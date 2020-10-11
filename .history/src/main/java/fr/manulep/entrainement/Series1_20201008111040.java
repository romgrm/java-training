package fr.manulep.entrainement;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

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
		int[] newArray = new int[array.length+1]; //je créer un nouveau tableau à partir de l'ancien avec une place en plus 
		for (int i = 0; i < newArray.length -1; i++) { 
			newArray[i < 0 ? i:i+1] = array[i]; //je fais une loop qui va traverser tout le nouveau array avec -1 pour laisser une place à la nouvelle donnée
		}
		newArray[0] = 1; //j'intègre une nouvelle donnée à l'index 0 de valeur 1

		return newArray; // je return le nouvel array de valeur int
	}
	
	public static int[] allElementsExceptFirstThree(int[] array) {
		//4
		int newArray[] = {}; // créer new tableau vide car on ne sait pas exactement le nbx de données attendus
		if(array.length < 3){
			return newArray; //si la longueur de mon array est inférieure à 3, on retourne un array vide (c'est ce qui est demandé avec le deuxième array {12,15} dans l'exo) 
		}else{ //on fait l'autre condition pour le premier tableau demandé
		for (int i = 0; i < array.length; i++) { // loop la longeur de l'ancien tableau
			newArray = Arrays.copyOfRange(array, 3, array.length); // copie ancien tableau sur new tableau en fonction des index de l'ancien tableau
			System.out.println(Arrays.toString(newArray)); 
		}}
		return newArray; 
		
	}
	
	public static String getFirstHalf(String word) {
		//5
		String halfWord; 
		halfWord = word.substring(0, 3); // on dit que notre string halfword = notre string word, de l'index 0 à 3, ce qui sélectionne les 3 premieres lettres des mots. Si on prend la length/2, snake va pas passer vu qu'il est impair..
		return halfWord; 
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
		String newArray[]= new string[array];
		for (String i = 0; i < array.length/2; i++) {
			newArray = array[i];
			array[i] = array[array.length -i -1];
			array[array.length -i -1] = newArray;
		}
		return newArray; 
	}


	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		//9 
		int x[] = {-7, 8, 4, 13}; // les nbx à affecter
		int pos = array.length/2; // la position du milieu des valeurs de array

		int newArray[] = new int[array+1]; //création d'un nouveau tableau en reprenant le array d'origine avec +1 pour assigner la nouvelle valeur

		for (int i = 0; i < array + 1; i++) {
			if(i<pos-1){
				newArray[i]=array[i];
			}else if(i == pos -1) {
				newArray[i]=x;
			}else{
				newArray[i]=array[i-1];
			}
			return newArray; 
		}


		//int newArray[] = new int[array+1]; // nouveau array qui reprend le array de base avec +1
		int newArray = insertElementInTheMiddleOfAnArray(array, newArray, x, pos);
		return newArray; 
	}

	public static String shortestWord(String text) {
		//10
		String shortest; 
		for (String i = 0; i < text.length(); i++) {
			if(i < 3){
				shortest=i; 
			}
		}
		return shortest; 
	}

	public static String removeCapitals(String text) {
		//11
		
	}
	
	public static long addingTwoNumbers(long number1, long number2) {
		//12
		long newLong =number1+number2;
		return newLong; 
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		//13
		long newThreeLong = number1+number2+number3;
		return newThreeLong;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
		//14
	}

	public static float makeNegative(float number) {
		//15
		for (float i = 0; i < number; i++) {	// on fait une boucle sur notre var number
			number=number * -1; // on dit que tous nos éléments doivent être en négatif
		} 
		return number; 
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
		return email.replaceAll("(^.*@|.com$)", ""); // tout ce qui commence par n'importe quoi, puis un @ et qui finit par .com sera remplacé par un string vide. 
	}

	public static int[] letterPosition(String name) {
		//19
		return null;
	}

	public static boolean isPeer(int number) {
		//20
		boolean isPeer;
		while(number==0){
			number=isPeer;
		}
		 
		return isPeer;	
		
	}	
		
	
}
