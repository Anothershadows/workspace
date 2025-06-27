package java_workout;

public class Gokul_123 {

	public static void main(String[] args) {

		String s = "Hello hi this gokul";
		String[] rev = s.split(" 	");
		int l = rev.length;
		System.out.println(l);

		String s1 = "Gokul@123";
		int sw = 0, C = 0, n = 0, ch = 0;

		for (int i = 0; i < s1.length(); i++) {
			char a = s1.charAt(i);
			if (a >= 97 && a <= 122) {
				sw++;
			}
			if (a >= 65 && a <= 90) {
				C++;
			}
			if (a >= 48 && a <= 57) {
				n++;
			} else {
				ch++;
			}
		}
		System.out.println(sw);
		System.out.println(C);
		System.out.println(n);
		System.out.println(ch);

	}

}
/* 		String input = "TestCase@123";
		
		int specialChars = 0, digits = 0, uppercase = 0, lowercase = 0;
		
		for(char ch : input.toCharArray()) {
			int ascii = (int) ch;
			
			if (ascii >= 48 && ascii <= 57) { // 0-9
                digits++;
            } else if (ascii >= 65 && ascii <= 90) { // A-Z
                uppercase++;
            } else if (ascii >= 97 && ascii <= 122) { // a-z
                lowercase++;
            } else { // Special Characters
                specialChars++;
            }
        }

        System.out.println("Special Characters: " + specialChars);
        System.out.println("Digits: " + digits);
        System.out.println("Uppercase Letters: " + uppercase);
        System.out.println("Lowercase Letters: " + lowercase); */
