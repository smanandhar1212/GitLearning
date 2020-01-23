
public class fibonacciAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstNumber = 0;
		int secondNumber = 1;
		System.out.print(firstNumber + "," + secondNumber + ",");

		for (int i = 1; i <= 18; i++) {
			int thirdNumber = firstNumber + secondNumber;
			System.out.print(thirdNumber + ",");
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}
	}

}
