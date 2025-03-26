package Automation.Automationqa;

public interface Bank {
	
	public void bankloan();
		
	public void freeloan();
	
	public void personalloan(int a ,String b);

	boolean personalloan();
	

}

package Automation.Automationqa;

public class output1 extends Java {

	public boolean personalloan() {	
		return false;
	}

}

package Automation.Automationqa;

public class Output {

	public static final OutputType<File> File = null;

	public static void main(String[] args) {
		Java n = new output1();
		n.bankloan();
		n.freeloan();
		boolean p = n.personalloan();
		System.out.println(p);
		int a=21000;
		String b="name";
		n.personalloan(a,b);
	

	}

}

package Automation.Automationqa;

public abstract class Java implements Bank{
	public void bankloan() {
		System.out.println("loan");		
	}
	public void freeloan() {
		System.out.println("Bank loan");	
	}
	
	public void personalloan(int a, String b) {
		System.out.println(a + b);	
	}}
package javaqa;

import java.io.File;

import org.openqa.selenium.OutputType;

public class cust {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
