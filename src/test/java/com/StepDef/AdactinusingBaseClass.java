package com.StepDef;

import io.cucumber.datatable.DataTable;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;


import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.POJOClass.AdactinLogin;
import com.POJOClass.AmazonWindNxtPage;
import com.POJOClass.AmazonWindows;
import com.POJOClass.BookConfirm;
import com.POJOClass.BookHotel;
import com.POJOClass.GmailPojouser;
import com.POJOClass.GreensCareers;
import com.POJOClass.GreensPage;
import com.POJOClass.GreensSyllabus;
import com.POJOClass.ItenaryPage;
import com.POJOClass.Logout;
import com.POJOClass.Nykaa;
import com.POJOClass.SearchHotel;
import com.POJOClass.SelectHotel;
import com.POJOClass.SilksSareeSite;
import com.POJOClass.gmailPojopass;
import com.basePack.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinusingBaseClass extends BaseClass {
	

@Given("Launch Adactin Browser")
public void launch_Adactin_Browser() {
	
	
	
	launchurl("https://adactinhotelapp.com/index.php");
	
	String geturl = geturl();
	System.out.println(geturl);
	
	String title = getTitle();
	System.out.println(title);
	
	
	
    
}

/*
 * 
 * I have commented this as im using DataTable for this method in the belwo snippet.

@When("Enter the {string} and {string} click Login")
public void enter_the_click_Login(String username, String password) {
 

	AdactinLogin a1= new AdactinLogin();
	
	toInputjs(a1.getTxtuser(), username);
	
	String att = getAtt(a1.getTxtuser());
	
	Assert.assertTrue("UID Check", username.contains("DiyaReneesh"));
	
	toInput(a1.getTxtpass(), password);
	
String att1 = getAtt(a1.getTxtpass());
	
	Assert.assertTrue("Password Check", password.contains("Diya@2015"));
	
	clk(a1.getBtnclk());
	
	
} */

@When("The user enter the credntials username and password")
public void the_user_enter_the_credntials_username_and_password(DataTable d) {
	
	//getting data from the feature file -- having one dimenion without header ---list
	
	List<String> justList = d.asList();
	String username = justList.get(0);
	String password = justList.get(1);
	
	AdactinLogin a1= new AdactinLogin();
	
	toInput(a1.getTxtuser(), username);
    toInput(a1.getTxtpass(),password);
    
    String att = getAtt(a1.getTxtpass());
    
    Assert.assertTrue("Verfiy Password", password.contains("Diya@2015"));
    
    
    
    
}

@When("click Login")
public void click_Login() {
   
	AdactinLogin a1= new AdactinLogin();
	clk(a1.getBtnclk());
}


@Then("Verify the entered details are correct")
public void verify_the_entered_details_are_correct() {
	
	String b = geturl();
	boolean boo = b.contains("SearchHotel");
	Assert.assertTrue("Verified",boo);
 
}

/*
 * Commenting this as below i have used Two Dimentonal --Lists concept for DataTable

@When("Search the required hotel {string} and {string} and {string} and {string} and {string} along with the Dates and click Search")
public void search_the_required_hotel_along_with_the_Dates_and_click_Search(String location, String room,String inDate, String outDate,String adult) {

	SearchHotel a2= new SearchHotel();
	
	Visbledropdown(a2.getLoc(), location);
	Visbledropdown(a2.getNoOfrooms(), room);
	
	toInput(a2.getDatein(), inDate);
	toInput(a2.getDateout(), outDate);
	Visbledropdown(a2.getAdult(), adult);
	
	clk(a2.getSearch());
}*/

@When("Search the required hotel location and room and inDate and outDate and adult along with the Dates and click Search")
public void search_the_required_hotel_location_and_room_and_inDate_and_outDate_and_adult_along_with_the_Dates_and_click_Search(DataTable h) {
    
	// two dimenion (LISTS) -- as it has alot of values and its a List as it is without any header
	
	List<List<String>> asLists = h.asLists();
	
	//asLists is 3 in count namely Paris, Adeleide and Los Angeles so select which line do we need to run for the program
	
	List<String> selList = asLists.get(2); //selecting Los Angeles
	
	//On Selecting the LosAngles now we need to pick the values from SelList for the Program.
	
	String location = selList.get(0);
	String room = selList.get(1);
	String inDate = selList.get(2);      //Given Dates in the Featue file is not gettting refelcted in the Portal Iternery history.Kindly check
	String outDate = selList.get(3);
	String adult = selList.get(4);
	
	
	SearchHotel a2= new SearchHotel();
	
	Visbledropdown(a2.getLoc(), location);
	Visbledropdown(a2.getNoOfrooms(), room);
	toInput(a2.getDatein(),inDate);
	toInput(a2.getDateout(),outDate);
	Visbledropdown(a2.getAdult(), adult);
	
	clk(a2.getSearch());
	
}
@When("Select the Required Hotel and Continue")
public void select_the_Required_Hotel_and_Continue() {
	
	SelectHotel a3= new SelectHotel();
	clk(a3.getSelhotel1());
	
	clk(a3.getContd());

}
/*
@When("Enter details {string} and {string} and {string} and {string} and {string} for booking Confimration and Book")
public void enter_details_for_booking_Confimration_and_Book(String fname,String lname, String address, String cc,String cvv) {
	BookHotel a4 = new BookHotel();
	toInput(a4.getFn(), fname);
	toInput(a4.getLn(), lname);
	toInput(a4.getBa(), address);
	
	toInput(a4.getCcno(), cc);
	Visbledropdown(a4.getCtype(), "VISA");
	Visbledropdown(a4.getExpdate(), "June");
	Visbledropdown(a4.getYr(), "2022");
	toInput(a4.getCvv(), cvv);
	
	clk(a4.getBkbtn());
	
	impWait();
	
	
}
*/

@When("Enter details fname and lname and address and cc and cvv for booking Confimration and Book")
public void enter_details_fname_and_lname_and_address_and_cc_and_cvv_for_booking_Confimration_and_Book( DataTable m) {
	
	List<Map<String, String>> listMap = m.asMaps();
	
	//List ={Map 1, Map2, Map3} here wh are choosing Map 3
	//		0		1 		2	
	
	Map<String, String> map = listMap.get(2);
	
	String firstname = map.get("fname");
    String lastname = map.get("lname");
    String caddress = map.get("address");
    String ccNo = map.get("cc");
    String type = map.get("ccType");
    String expiryDate = map.get("eDate");
    String expiryYear = map.get("eYear");
    String cvv = map.get("cvv");

    
    BookHotel a4 = new BookHotel();
	toInput(a4.getFn(), firstname);
	toInput(a4.getLn(), lastname);
	toInput(a4.getBa(), caddress);
	
	toInput(a4.getCcno(), ccNo);
	Visbledropdown(a4.getCtype(), type);
	Visbledropdown(a4.getExpdate(), expiryDate);
	Visbledropdown(a4.getYr(), expiryYear);
	toInput(a4.getCvv(), cvv);
	
	clk(a4.getBkbtn());
	
	impWait();
	


}

@When("Print the Order number")
public void print_the_Order_number() {
	BookConfirm a5= new BookConfirm();
	
	System.out.println(getAtt(a5.getOrderNo()));
	
	String booking = geturl();
	boolean c = booking.contains("BookingConfirm");
	
	Assert.assertTrue("Booked", c);
}

@Then("Click Logout")
public void click_Logout() {
    
	Logout a6= new Logout();
	
	clk(a6.getLo());
}

@Given("User launch the Adacting browser")
public void user_launch_the_Adacting_browser() {
    
	launchurl("https://adactinhotelapp.com/index.php");
	
	
	
}

@When("User enter the username and password")
public void user_enter_the_username_and_password(DataTable d) {
    
	List<Map<String, String>> asMaps = d.asMaps();
	
	Map<String, String> map = asMaps.get(0);
	
	String user = map.get("username");
	String pass = map.get("password");
	
	
	AdactinLogin a6= new AdactinLogin();
	
	toInput(a6.getTxtuser(),user);
	toInput(a6.getTxtpass(),pass);
	clk(a6.getBtnclk());
	
	
}

@When("the user clicks booked Itenary")
public void the_user_clicks_booked_Itenary() {
	
	ItenaryPage a7= new ItenaryPage();
	
	clk(a7.getBookiten());
    
}

@Given("Launch the Amazon App")
public void launch_the_Amazon_App() {

	launchurl("https://www.amazon.in/");
	
}

@When("Search for the Apple Watch and give a Search")
public void search_for_the_Apple_Watch_and_give_a_Search() {
   
	AmazonWindows a8= new AmazonWindows();
	toInput(a8.getTxtbox(), "Dell Laptop");
	clk(a8.getSrchclk());
	
}

@When("the user must click on Apple Watch {int}")
public void the_user_must_click_on_Apple_Watch(Integer int1) {
    
	System.out.println("Search for Apple Watch ");
	
	
}
	


@Given("Login into the Gamil account")
public void login_into_the_Gamil_account() {
 
	launchurl("https://accounts.google.com/signin/v2/identifier?hl=en&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	
}

@When("the user enters UserID and Password")
public void the_user_enters_UserID_and_Password(DataTable ap) {
    
/*	List<Map<String, String>> asMaps = ap.asMaps();
	
	Map<String, String> map = asMaps.get(1);
	
	String user = map.get("username");
	String pass = map.get("password");
	
	GmailPojouser b1= new GmailPojouser();
	
	toInput(b1.getUsername(), user);
	clk(b1.getNext());
	
	gmailPojopass b2= new gmailPojopass();
	
	toInput(b2.getPassword(), pass);*/
	
	System.out.println("USer enters username Page");
	
}

@When("the user clicks Login")
public void the_user_clicks_Login() {
    
/*	gmailPojopass b2= new gmailPojopass();
	
	clk(b2.getNext1());*/
	
	
	System.out.println("USer enters password Page");
}

@Then("to verify if the user has entered the right page")
public void to_verify_if_the_user_has_entered_the_right_page() {
    
	/*String gu = geturl();
	
	boolean bo = gu.contains("utm_source=sign_in");
	
	Assert.assertTrue("gmail Entry check", bo);
	*/
	
	System.out.println("USer enters right Page");
	
}

@Given("Launch to the Nykaa site")
public void launchToTheNykaaSite() {
	launchurl("https://www.nykaa.com/");
	
    }

@When("User navigates to Brands")
public void userNavigatesToBrands() {
    
	Nykaa n= new Nykaa();
	
	mvToElement(n.getBrand());
	
	
}

@When("User clicks on a particular {string} brand")
public void userClicksOnAParticularBrand(String Brands) {
	Nykaa n= new Nykaa();
	toInput(n.getBrandsrch(), Brands);
	//clk(n.getLakme());
	//clk(n.getMac());
	
	clkjs(n.getMac());
	impWait();
	
	clkjs(n.getLakme());
}

@Given("Launch to the Sundariihandmade site")
public void launchToTheSundariihandmadeSite() {
	launchurl("https://www.sundariihandmade.com/");
}

@When("The user navigates to shop by category")
public void theUserNavigatesToShopByCategory() {
	SilksSareeSite ss= new SilksSareeSite();
	
	mvToElement(ss.getCatogery());
	
}

@When("The user clicks Cotton Blouses")
public void theUserClicksCottonBlouses(DataTable csb) {
    
	List<Map<String, String>> asMaps = csb.asMaps();
	
	Map<String, String> map = asMaps.get(0);
	
	String string = map.get("Type");
}

@Given("User is in Green Technology Page")
public void userIsInGreenTechnologyPage() {
   
	launchurl("http://greenstech.in/about.html");
	
}

@Given("the user selects courses")
public void theUserSelectsCourses() {
    
	GreensPage gp= new GreensPage();
	
	mvToElement(gp.getCourses());
	
	
}

@When("on Selecting Courses navigates to Java Training")
public void onSelectingCoursesNavigatesToJavaTraining() {
	
	GreensPage gp= new GreensPage();
	
	mvToElement(gp.getJava());
	
	
    
}

@When("User selects J{int}EE training")
public void userSelectsJEETraining(Integer int1) {
	GreensPage gp= new GreensPage();
	mvToElement(gp.getJ2ee());
}

@When("on Selecting Courses navigates to software testing Training")
public void onSelectingCoursesNavigatesToSoftwareTestingTraining() {
	GreensPage gp= new GreensPage();
	mvToElement(gp.getSoftware());
	
}

@When("User selects LoadRunner training")
public void userSelectsLoadRunnerTraining() {
	GreensPage gp= new GreensPage();
	mvToElement(gp.getJmeter());
}

@Given("the User Click on careers")
public void theUserClickOnCareers() {
   
	GreensCareers gcc= new GreensCareers();
	
	clk(gcc.getCareers());
}

@Given("click on syllabus")
public void clickOnSyllabus() {
    
	GreensSyllabus gs= new GreensSyllabus();
	clk(gs.getSyllb());
}

@Given("the User Click on Contact Us")
public void theUserClickOnContactUs() {
    
	GreensPage gp= new GreensPage();
	clk(gp.getContactus());
}






}
