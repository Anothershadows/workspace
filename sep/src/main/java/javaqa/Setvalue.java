package javaqa;
public class Setvalue {
	//int c;
	int num() {
		return 1;
	}
	void setrange(int a, int b) {
		
		int c=10;
		//System.out.println(c);
		System.out.println(a+b+this.num());
	}

	public static void main(String[] args) {
		Setvalue great = new Setvalue();
		great.setrange(10, 30);
		
	}

}
