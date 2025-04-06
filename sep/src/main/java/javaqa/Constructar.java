package javaqa;

public class Constructar {	
	String name ="gokul" ;
	int value=5;	
	
	void work(int b,int c) {
		int value =3;
		System.out.println(b+c+this.value);		
	}	
	public static void main(String[] args) 	
	{
		Constructar odj = new Constructar();
		odj.work(3,6);
		Constructar odj1 = new Constructar();
		odj1.work(3,7);				
	}}

