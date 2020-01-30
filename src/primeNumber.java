
public class primeNumber {
int a;

	public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public Boolean prime (int a) {
	int counter =0;
	for(int i=2; i<=a; i++ ) {
		if(a %2 ==0) {
			counter++;
		}
	}
		if(counter > 1 ) {
			return false;
		}else
		return true;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
primeNumber p1=new primeNumber();

System.out.println(p1.prime(17));
	}

}
