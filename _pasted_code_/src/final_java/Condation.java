package final_java;

import java.util.Scanner;

public class Condation {
	public static void main(String[] args) {
		System.out.println("Enter number gokul");
		Scanner scanner = new Scanner(System.in);	
	    int q = scanner.nextInt();
	    scanner.close();
/*do {
	q++;
}
while(q==5){
	System.out.println("all done");	
}
while (q<5){
    System.out.println("all done not");
}*/
	    do {
            q++;
        } while (q == 0);

        System.out.println("all done");

        // Second while loop
        while (q < 5) {
            System.out.println("all done not");
            q++; // Increment q to eventually break out of the loop
}}}

