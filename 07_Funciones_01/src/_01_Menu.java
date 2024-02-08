
public class _01_Menu {

	public static void main(String[] args) {
		printMenu("Twitter");
		System.out.println("--");
		printMenu("Meta");
		System.out.println("--");
		printMenu("Instagram");
	}
	
	public static void printMenu (String app) {
		System.out.println(app);
		System.out.println("Log In");
		System.out.println("Sign Up");
		System.out.println("Exit");
	}
}
