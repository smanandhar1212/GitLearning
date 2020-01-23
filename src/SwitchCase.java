import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		switchCase();
	}

	private static void switchCase() {
		// TODO Auto-generated method stub

		int Menu;
		Scanner M = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter Menu");

		Menu = M.next().charAt(0);

		switch (Menu) {
		case 'A':
			System.out.println("Appetizer");
			break;

		case 'M':
			System.out.println("Main Course");
			break;

		case 'S':
			System.out.println("Soup & Salad");

		case 'D':
			System.out.println("Drinks");
			break;

		default:
			System.out.println("Invalid Request");
		}

	}

}
