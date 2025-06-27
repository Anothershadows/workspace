package java_workout;

public class reverse_string {

	public static void main(String[] args) {
		String valuer = "hello";
		String rev = "";
		
		for (int i = valuer.length()-1; i>=0; i--) {
			
			rev=rev+valuer.charAt(i);
			
		}
		System.out.println(rev);

	}

}
