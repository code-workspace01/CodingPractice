package IncrementAndDecrementOperators;

public class shortCircuiting {

	public static void main(String[] args) {
		
		int a = 50, b = 60;
		
		if(a++ > 50 && b++ >60) {
			System.out.println("inside first");
		}else {
			System.out.println("inside second");
		}
		
		System.out.println("a : " + a + "\nb : " + b); // short circuiting

	}

}
