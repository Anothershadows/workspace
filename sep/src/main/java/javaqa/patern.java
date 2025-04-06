package javaqa;

public class patern {

	public static void main(String[] args) {
		System.out.println("start");
		for(int i = 1; i<=5; i++) {
			
			for(int j = 1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k = i*2; k<=10; k++) {
			System.out.print("*");
		}
		System.out.println(" ");	
		}
}}

