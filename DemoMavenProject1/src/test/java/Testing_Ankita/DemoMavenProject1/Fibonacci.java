package Testing_Ankita.DemoMavenProject1;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c;
		for(int i = 0; i <=5;i++) {
			System.out.println(a);
			c = a+b;
			a=b;
			b=c;
		}

	}

}
