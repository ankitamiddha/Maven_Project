package Testing_Ankita.DemoMavenProject1;

public class String_reverse {

	public static void main(String[] args) {
		
		String original = " Hello this is Ankita";
		String reverse = "";
		int length = original.length();
		for(int i = length - 1; i>=0;i--) {
			reverse = reverse+original.charAt(i);
		}
		System.out.println("Reverse of the original string is--- "+reverse);
		

	}

}
