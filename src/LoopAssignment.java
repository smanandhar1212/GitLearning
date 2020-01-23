
public class LoopAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				if ((j == 1) || (j == i)) {
					System.out.print("* ");
				} 
//				 if(i==5)
//				{
//					System.out.print("* ");
//
//				}
				else {
					System.out.print(" ");
				}

			}
			System.out.println();// new line
		}

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum = i + sum;

		}
		System.out.println("Total sum:" + sum);
	
	for(int i=1; i<=5; i++) {
		
		System.out.println();
		
		for( int j=1; j<=i; j++) {
			System.out.print("x");
			
		}
	}
   }
}

	