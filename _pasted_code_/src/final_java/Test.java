package final_java;


public class Test {
	public class water{
		void drink() {
			System.out.println("drink water");
		}
	}
	public class Tap{
		public water openTap() {
			water w = new water();
			return w;
		}
	public class person {
		public static void main(String[] args) { 
			Tap t =new Tap();
			water openTap=t.openTap();
			openTap.drink();
			
		
	}
			
		}
	}
	
}
	public static void main(String[]args) {
		int[] arr= new int[4];
		
		arr[0]=3;
		arr[1]=4;
		arr[2]=5;
		arr[3]=6;
		
		int[]arr1 = {2,3,4,5,3};
		
		for(int i=0; i<arr.length; i++) {
			System.err.println(arr[i]);
		}
		System.out.println("======");
		for(int i=arr.length-1; i>=0;i--) {
			System.out.println(arr[i]);	}
	int age = 23;
	Static String country = "india";
	Public void m1()
	*/