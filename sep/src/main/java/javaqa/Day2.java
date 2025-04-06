package javaqa;

public class Day2 

{
	public static void main(String[] args) {
		Day2 ut = new Day2();
		ut.deletev("onemore");
		ut.deletev("true");
	}
	private void deletev(String vid) {
		System.out.println("deletev" + vid);
		
	}
	public void createv() {
		System.out.println("createv");
}
	private boolean uploadv(){
		System.out.println("uploadv");
		return true;	
	}
	public String sharev() {
		return"fb";
	}
}
