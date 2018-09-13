package Testing_Ankita.DemoMavenProject1;

public class SumofDigits {

	public static void main(String[] args) {
		int a = 329;
		int result = 0;
		System.out.println("Print A: "+a);
		while(a!=0) {
		result = result+a%10;
		a=a/10;
			}
		System.out.println("Print result: "+result);
		
	}

}
