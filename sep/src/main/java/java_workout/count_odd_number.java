package java_workout;

public class count_odd_number {

	public static void main(String[] args) {

		int e = 0;
		for(int d = 1; d<=100; d++) {
			if(d%2!=0) {
				 e++;		
			}		
		}
		System.out.println(e+" count of odd number");	

        int g=0;
		for(int f =1; f<=90; f++) {
			if(f%2==0) {
			g=g+f;	
			}
		}
		System.out.println(g +" sum of add number");

	}

}
