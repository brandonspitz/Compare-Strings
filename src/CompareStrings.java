import java.util.Scanner;

public class CompareStrings {
		public static void main(String[] args)
		{
			try (Scanner in = new Scanner (System.in)) {
				System.out.print("Please enter a string: ");
				String string1 = in.next(); //This statement asks and stores input for string1
				System.out.print("Please enter another string: ");
				String string2 = in.next(); //This statement asks and stores input for string2
				
				System.out.println(" "); //I added spacing between the statements to match the formatting of the assignment
				
				if (string1.length() % 2 ==0) { //This expression makes sure the remainder is 0 and determines whether any given integer is even or odd
					System.out.println("The first string's length is even."); //Prints if expression is true
				}else {
					System.out.println("The first string's length is odd."); //Prints if expression is false
				}
				
				if (string2.length() % 2 ==0) { //Uses same logic from string1 with string2 
					System.out.println("The second string's length is even.");
				}else {
					System.out.println("The second string's length is odd.");
				}
				
				System.out.println(" ");
				
				if (string1.equals(string2)) { //.equals() can be used to compare strings (not ==), this expression compares string1 to string2
					System.out.println("The two strings are the same."); //Compares string1 and string2 and prints if they are both equal
				}else {
					System.out.println("The two strings are different."); //Prints if the strings are not equal
				}
				
				System.out.println(" ");
				
				if (string1.length() == string2.length()) { //.length() shows the actual number of characters within a string, this expression compares string1's length to string2's
					System.out.println("The two strings are lexically the same."); //This prints if both lengths are the same
				}else {
					if (string1.length() > string2.length()) { //Another "if/else" set of statements is used inside of the past "if" to determine which string is lexically larger
						System.out.println("The first string is lexically larger."); //Prints if first string is longer
					}else {
						System.out.println("The second string is lexically larger."); //Prints if second string is longer
					}
				}
				
				System.out.println(" ");
				
				System.out.println("The first character of the first string is " + string1.charAt(0)); //Uses .charAt() to find the first character in string1 and print it with the statement
				System.out.println("The first character of the second string is " + string2.charAt(0)); //Uses same method as above for string2
				
				System.out.println(" ");
				
				String string3 = string2.toUpperCase() + string1.toUpperCase(); //creates string3 variable and defines it using an expression that converts string1 and string to upper case and and concatenates them
				System.out.print("The concatenation of the two strings is "); //Prints this statement
				System.out.print("\"" + (string3) + "\""); //Prints this statement of the variable string3 with quotation marks to match the assignment's format
				
				System.out.println(" ");
				System.out.println(" ");
				
				System.out.println("The first string using lower case letters: " + string1.toLowerCase()); //Uses .toLowerCase() to convert string1 to lower case letters and prints with statement
				System.out.println("The second string using lower case letters: " + string2.toLowerCase()); //Uses same method as above for string2
			}
		}
}