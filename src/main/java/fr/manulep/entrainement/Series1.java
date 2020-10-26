package fr.manulep.entrainement;

import java.util.List;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
import java.util.regex.Matcher;
import com.google.common.primitives.Chars;

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

		// je déclare mon tableau vide, je ne l'initialise pas car je ne connais pas sa longueur requise
		String[] arrayA; 

		// compter le nbx de mots commencant par A
		int nbxMotStartWithA = 0; //on initialise nb pour qu'il parte de 0, sinon il y'aura une error
		for (String elem : array) { // pour chaque element de mon array
			if(elem.charAt(0) == 'a'){ // si l'élément commence par 'a' à l'index 0
				nbxMotStartWithA++; // alors incrémente pour passer d'élements en éléments et connaitre la capacité de notre futur tableau
				System.out.println("oui"); // permet d'afficher dans la console ceux qui commencent par 'a'
			}
		}

		// j'initialise mon tableau, je lui donne une valeur (celle de nb, c'est à dire le nbx d'éléments ayant un 'a' en index 0)
		arrayA = new String[nbxMotStartWithA]; 

		// remplir le tableau (il faut refaire la même boucle qui après nous avoir trouvé la capacité du tableau, elle nous donnera les éléments pour le remplir)
		int x = 0; //position de base
		for (int i = 0; i < array.length; i++) {
			String elem = array[i];  // on fait le tour du tableau et on dit que l'index du tableau (donc les élements) sera stocké dans la var 'elem'
			if(elem.charAt(0) == 'a') { //si nos élements commencent par 'a' à leur index 0 
				arrayA[x] = elem; //alors la var elem (ou sont stockés nos élements) iront dans notre nouveau tableau déclaré, avec un [x] pour l'initialiser
				x++; //on incrémente pour faire le tour du tableau
			}
		}
		return arrayA;
	}

		/////////////////// ArrayList /////////////////////

		/*String[] retour;

		ArrayList<String> stock = new ArrayList<String>(); 

		for (String mot : array) {
			if(mot.charAt(0) == 'a'){
				stock.add(mot);
			} // c'est le 'mot' qui récupère les élements de notre array avec le foreach, donc normal que se soit lui qui subisse le charAt pour voir quel index de ses éléments débutent avec un 'a'
		}
		
		retour = stock.toArray(new String[stock.size()]); // on convertit l'arrayList String en Array classique 
		
		return retour; 
		}*/
		 
	
	public static String[] selectElementsStartingWithVowel(String[]array) {
		//7
		/*public static boolean isVoyelle(char letter){
			return (letter == 'a' || letter=='e' || letter=='i' || letter=='o' || letter=='u' || letter=='y');
		}*/
		
		
		
		// on déclare un new tableau vide

		String[] newTab;  

		/* on initialize capacity pour l'incrémentation partant de 0 
		afin de déterminer la capacité futur pour notre newtab */

		int capacity = 0; 

		/* on fait une boucle qui va traverser notre array sur chq element
		Si nos éléments commencent par "a,e,i...", continue d'incrémenter*/

		for (String item : array) {
			if(item != null){       // permet d'éviter que le 'null' nous bloque dans l'incrémentation
				if(item.charAt(0)== 'a' || item.charAt(0)=='e'|| item.charAt(0)=='i'|| item.charAt(0)=='o'|| item.charAt(0)== 'u'|| item.charAt(0)== 'y'){
					capacity++; // on incrémente la capacity pour savoir la capacité de notre newTab "si notre item commence par un 'a', 'o' etc en index 0, alors met le dans notre capacity"
					System.out.println(item);
				}
			}
		}

		/* on initialise notre newTab en lui donnant la capacity comme ça on sait 
		combien d'élements doit recevoir notre tableau (en l'occurence 3 vu 
		qu'il y'a 3 prénoms commencant par des voyelles) */ 

		newTab = new String[capacity]; // notre tableau a une nouvelle entrée avec 3 valeurs (non remplies)

		int x = 0; // on initialise l'index de notre futur tableau

		// on remplie notre tableau vu qu'on sait sa capacité, donc on refait la loop

		for (String item : array) {
		/* for (int i = 0; i < array.length; i++) {
			String item = array[i];	
		}	CA c'est exactement pareil que le paramètre en boocle for each
		en gros ca permet de dire que notre item est egal à l'index de Array*/
		
			if(item != null){
				if(item.charAt(0)== 'a' || item.charAt(0)=='e'|| item.charAt(0)=='i'|| item.charAt(0)=='o'|| item.charAt(0)== 'u'|| item.charAt(0)== 'y'){ // on refait la loop pour recup les elemt avec voyelle
					newTab[x] = item; // on remplie nos elements (item) dans notre nvx tableau, grâce à son index [x]
					x++; // on incrémente pour remplir toutes les cases vides, index par index (3 cases) 	 
				}
			}
		}


		return newTab;
	}

	
	
	public static String[] reverseOrderInArray(String[]array) {
		//8
		// on refait un tableau vide avec le nbx de cases en fonction de notre old array
		String [] reverse = new String [array.length]; 

		/* on enlève un index pour que les coordonnées (index) de mon tableau 
		correspondent à la position des éléments (vu que les index partent de 0 alors que le length part de 1) 
		On aura tjrs ce -1 car sinon on veut remplir le new tableau avec les éléments
		de l'ancien tableau, il faut lui faire comprendre que 0 n'est pas une valeur int
		donc on peut pas l'utiliser directement. Avec une loop foreach on a pas ce soucis
		car ça sélectionne directement chq élément et pas besoin de la longueur du tableau*/
		int j = array.length-1; 
		for ( int i = 0 ; i < array.length ; i++ ) {
			 reverse[i] = array[j]; // mon new tableau est = aux valeurs d'index inversés de mon old tableau
			 j--; // on incremente mais en sens inverse, on descend pour remplir les cases vides, c'est là ou on inverse l'ordre
		}return reverse ;
	}


	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		//9 
		// Array to ArrayList
		List<Integer> listClone = new ArrayList<>(); // on créer un nouvel ArrayList
		for (int num : array){
			listClone.add(num); // on clone le array de base dans notre nouvel ArrayList
		}

		// Find the index of position and insert element
		int middleArray = Math.round(array.length/2); // on trouve le milieu de notre array (length/2) et la fonction round permet de ramener à l'entier précédent (pour les tableaux impair)
				listClone.add(middleArray, element); // on ajoute à notre nouvel ArrayList (lisClone) nos éléments à ajouter (8,-7,4...), en fonction de notre middleArray (donc l'index au milieu du tab)
				
		// Convert ArrayList to Array		
		int [] newArray = new int[listClone.size()]; // on créer un newArray avec comme taille la size de notre ArrayList listClone
		for (int i = 0 ; i < newArray.length; i++){ // parcours la longueur de notre Array
			newArray[i] = listClone.get(i); // on dit que les elements de notre ArrayList (listClone) vont dans notre newArray, aux mêmes index. 
		}
		return newArray; 
	}

	public static String shortestWord(String text) {
		//10
		int length =100; // filet de peche pour prendre tt les mots possible 
		String [] mots = text.split(" "); // permet de mettre "winter is coming" dans un array avec un index chacun, (winter =0 etc...), important de mettre " " (l'espace) pour pas que les mots soient collés
		String shortestWord= ""; // on initialise pour pas que java gueule 

		for (String word : mots){
			if(word.length() < length){ // On compare la longueur de nos mots (winter, is...) par rapport à l'int length, si c plus petit alors exe
				length = word.length(); /*notre filet "length" prend la valeur de la longueur du word, 
				donc length=100 devient length=6 (winter), puis second tour, 
				on compare la longueur de notre word.lenght (is) comparé à celle de length, 
				et donc is de vient notre + petit mot etc...*/
				shortestWord = word; // on stock notre + petit mot dans notre shortestWord 
			}
		}
		return shortestWord; 
		}
		
	

	public static String removeCapitals(String text) {
		//11
		// on déclare une string vide 
		String notCapital= ""; 
		// on boucle sur la longueur de notre var text pour tte la parcourir
		for (int i = 0; i < text.length(); i++) {
			// notre char letter recupere les infos de notre var text en fonction de ses index
			char letter = text.charAt(i);
			if(!Character.isUpperCase(letter)){ // si letter à l'inverse d'une majuscule dans ses index
				notCapital += letter; // alors notCapital prend la valeur de letter
			}
		}
		return notCapital; // ça nous à donc garder que les minuscules 
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

		// on créer une var vide pour stocker les chiffres de l'ancien integer
		int severalNumbers = 0; 

		// on fait une loop qui va traverser tout nos elements de notre numbers
		for (int i = 0; i < numbers.length; i++) {
			severalNumbers += numbers[i]; // on ajoute les index de 'numbers' à "severalNumbers" 
			System.out.println(severalNumbers);
		}

		return severalNumbers; 
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
		// on intègre le pattern suivant avec les caractères spéciaux
		Pattern special = Pattern.compile("[@#$%&*()_+=|<>?{}\\[\\]~-]");
		// on fait matcher le pattern au matcher de string(notre var)
		Matcher hasSpecial = special.matcher(string);

		/* si le pattern match (donc si il y'a un de ces caractère dans notre string),
		tu retournes true, sinon tu return false*/

		return hasSpecial.find();
		}

	

	public static boolean checkIfStringStartsWithConsonant( String word ) {
		//17 

		// Creation d'une var qui va contenir l'index 0 de la var "Word", autrement dit la 1ere lettre
		String firstLetter = word.substring(0,1); 
		System.out.println(word);
		System.out.println(firstLetter);

		// Si les mots "aei...." sont contenues dans ma var "firstLetter"
		if("aeiouyAEIOUY".contains(firstLetter)){
			return false; // alors return false (car se sont des voyelles et nous on veut les consonnes)
		}else{
			return true; // sinon return true, comme ça on recup tout les mots commençant par une consonne
		}

		//////// 2eme METHODE AVEC IF /////////
		/*Boolean consonantWord; 
		if(word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o") || word.startsWith("u") || word.startsWith("y")
		||word.startsWith("A") || word.startsWith("E") || word.startsWith("I") || word.startsWith("O")|| word.startsWith("U")|| word.startsWith("Y")){
			consonantWord=false; 
		}else{
			consonantWord= true; 
		}
		System.out.println(consonantWord);
		return consonantWord;*/
		

		

		
	}

	public static String getDomainName(String email) {
		//18
		return email.replaceAll("(^.*@|.com$)", ""); // tout ce qui commence par n'importe quoi, puis un @ et qui finit par .com sera remplacé par un string vide. 
	}

	public static int[] letterPosition(String name) {
		//19
		// on convertit tout notre name en minuscule qu'on stock ds une string pour pas avoir de soucis
		String lowerCaseName = name.toLowerCase(); 

		// on créer un tableau de char avec toutes les lettres de l'alphabet
		char [] alphabet = {' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		//on créer un nouveau tableau de integer avec comme longueur le nbx d'élement de notre string (donc chq index de hellokitty)
		int[] letterPosition = new int[lowerCaseName.length()];
		
		//on fait le tour de notre string lowercase
		for (int i = 0; i < lowerCaseName.length(); i++ ){
			// la char target reprend les index de notre string lowerCase, donc les index de hellokitty, à un instant T, qui changera à chq loop
			char target = lowerCaseName.charAt(i);
			// ça nous donne l'index de notre texte (hellokitty) en fonction de l'alphabet. On connait donc la position de chq lettre de hellokitty dans l'alphabet
			int index = Chars.indexOf(alphabet,target); // loop 2 -> target = "e", indexOf recherche la lettre "e" dans le tableau Alphabet, le trouve à la 5eme position, donc index = 5
			// on remplie letter position (notre tableau vide à la longueur de hellokitty) en fonction des résultats de notre int index
			letterPosition[i] = index;
			System.out.println(Arrays.toString(letterPosition));
		}
		return letterPosition;
	}

	public static boolean isPeer(int number) {
		//20
		// on créer un boolean vide qui va permettre de savoir si c'est true / false
		
		boolean isPeer;

		// Si notre nbx, modulo de 2 = 0, alors c'est paire, donc notre var = true
		if(number%2==0){
				isPeer = true;
			}else{      // sinon c'est false 
				isPeer=false;  
			}		 
		return isPeer;	
		
	}	
		
	
}
