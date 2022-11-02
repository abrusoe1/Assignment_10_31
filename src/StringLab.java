import java.util.Scanner;

public class StringLab {
	
	public static void capitalize(String s1) {
		String str1 = s1.toLowerCase();
		String str2 = str1.substring(0,1).toUpperCase() + str1.substring(1);
		System.out.println(str2);
	}
	
	public static void wheresWaldo(String s1) {
		int i1 = s1.indexOf("Waldo");
		
		if (-1 == i1) {
			System.out.println("I can't find Waldo!");
		
		} else {
			System.out.println(i1);
		}
	}
	
	public static void firstThingsFirst(String s1, String s2) {
		int j = 0;
		while (true) {  //This loop is in case the first letter of both strings is the same
			char c1 = s1.toLowerCase().charAt(j); //toLowerCase() is to render the alphabetization case insensitive
			char c2 = s2.toLowerCase().charAt(j);
			if (c1 < c2) {
				System.out.print(s1 + " " + s2);
				break;
			} else if (c1 > c2) {
				System.out.print(s2 + " " + s1);
				break;
			} else {
				j++;  //Alphabetize later characters if necessary
			}
		}
	}
	
	public static void reverse(String s1) {
		String nsc1 = "";
		char ch;
		
		for (int i = 0; i < s1.length(); i++) {
			ch = s1.charAt(i);
			nsc1 = ch+nsc1;
		}
		
		System.out.println(nsc1);
	}
	
	public static void soLong(String s1, String s2) {
		// Below is what I would like to do but the parameter says two strings in the method
//		Scanner scnr = new Scanner (System.in);
//		System.out.println();
//		System.out.print("This function requires a second word; please enter one: ");
//		String sc2 = scnr.next();
		
		int l1 = s1.length();
		int l2 = s2.length();
		if (l1 > l2) {
			System.out.println(s1);
		
		} else if (l1 < l2) {
			System.out.println(s2);
		
		} else {
			System.out.println(s1 + " " + s2);
		}

	}
	
	public static void afterMath(String s1) {
		String sc1 = s1.toLowerCase();
		int i1 = sc1.indexOf("math");
		
		if (i1 == -1) {
			System.out.println("dud");
		} else {
			String sc2 = s1.substring(i1);
			System.out.println(sc2);
		}
	}
	
	public static void letterize(String s1) {
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		System.out.print("Please insert a word or phrase here: ");
		String sc1 = scnr.nextLine();
		//System.out.println();  /*This line and the next two are because the instructions say two strings in some methods
		//*rather than just one plus a second scanner in the function*/
		System.out.print("Some functions in this program require two strings, please enter another just in case: ");
		String sc2 = scnr.nextLine();
		
		capitalize(sc1);
		wheresWaldo(sc1);
		firstThingsFirst(sc1, sc2);
		reverse(sc1);
		soLong(sc1, sc2);
		afterMath(sc1);
		letterize(sc1);
		
//If doing a switch statement, may be possible to only request sc2 on fTF and sL with an if statement after
//the choice of which method to run is put in
	}

}
