import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you? :)");
		System.out.print("Please enter your name: ");
		
		Scanner in = new Scanner(System.in);
		HelloUser user = new HelloUser(in.next());
		
		user.greetUser();
		in.close();
	}

}
