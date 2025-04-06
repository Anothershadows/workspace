package javaqa;

public class App {
	// premitive data type and non premivite data type ;
	String name = "gokul";
	int age = 25;
	char intiial = 1;
	float range = 233F;
	long phone = 3423334;
	byte birth = 122;

	int c = 6;
//methods in java 
	// public , private , default ,protect

	public void mobile(String viedio) {
		System.out.println("MRP" + viedio);
	}

	public void mobile(int viedio) {
		System.out.println("FIXED" + viedio);
	}

	public int buymobile(int a, int r) {
		System.out.println(a + r);
		return 23;
	}

	private String openmobile() {
		int c = 5;
		System.out.println(this.c);
		return "done";
	}

	public static void main(String[] args) {
		App u = new App();
		u.mobile("offer");
		u.mobile(2000);
		// int i = u.buymobile();
		u.buymobile(12, 1);
		// System.out.println(i);
		String o = u.openmobile();
		System.out.println(o);
	}
}
