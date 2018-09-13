package Testing_Ankita.DemoMavenProject1;

public class Swap2number {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		System.out.println("A before swapping is "+a);
		System.out.println("B before swapping is "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("A after swapping is "+a);
		System.out.println("B after swapping is "+b);
		
		

	}

}
