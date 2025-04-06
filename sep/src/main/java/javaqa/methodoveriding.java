/*
 * package hello; 
 * public class methodoveriding 
 * { void run() { System.out.println
 * ("method riding completed"); }}
 */
	
/*
 * package hello; public class methodoveriding { static int add(int a,int b) {
 * return a + b; } }
 */


package javaqa; public class methodoveriding
{
int id;
String name;
int age;
methodoveriding(int i,String n){
	id =i;
	name=n;		
}
methodoveriding(int i,String n,int a){
	id =i;
	name=n;
	age=a;
}
    void display()
    {
    	System.out.println(id+" "+name+" "+age);  
    }
    
    public static void main(String args[]){  
    	methodoveriding s1 = new methodoveriding(111,"Karan",1);  
    	methodoveriding s2 = new methodoveriding(222,"Aryan",25);  
    s1.display();  
    s2.display(); 
}
	
}