package final_java;

public class Zoro {
	int q= 10;
	Zoro(int q){
		this();
		System.out.println("one param con"+q);
	}
	public Zoro() {
		System.out.println("Zero param construvtor");
	}
	public static void main(String[] args) {
	//Zoro d1 = new Zoro();
	Zoro d2 = new Zoro(20);
	}
}
