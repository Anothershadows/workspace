package sanityflow;

public class TC001loginpage  {
	public static void main(String[] args) {
	//	public void logintest() {
	// loginpageaction lo = new loginpageaction();
	/* lo.geturl("https://infotech-cloudhr.com.sg/LoginV2.aspx?Session=True");
	   lo.Emailid("claimapplysec@infotech-hrsoftware.com.my");
	   lo.password("Info@123");
	   lo.click(); */
		new loginpageaction()
	    .geturl("https://infotech-cloudhr.com.sg/LoginV2.aspx?Session=True")
		.Emailid("claimapplysec@infotech-hrsoftware.com.my")
		.password("Info@123")
		.click();
		
		
}}

	

	

