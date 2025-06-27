package java_workout;

public class reverse_number {

	public static void main(String[] args) {
		int h = 123;
		int i = 0;
		while (h>0) {
			int j = h%10;
			i = (i*10)+j;
				h=h/10;				
		}
		System.out.println(i);	

	}

}
