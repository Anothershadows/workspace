package javaqa;

public class TestCase123 {

	public static void main(String[] args) {
		String input = "TestCase@123";
		
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
        System.out.println("Lowercase Letters: " + lowercase);
    }
}
			
		
