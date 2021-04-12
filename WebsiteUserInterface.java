import java.util.Scanner;

/**
 * 
 */



/** 
* <!-- begin-UML-doc -->
* <!-- end-UML-doc -->
* @author besba
* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
*/
public class WebsiteUserInterface {
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Admin admin;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private Customer customer;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private HotelCollection hotelCollection;
	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	private FeedbackCollection feedbackCollection;

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void login() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void searchPackage() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void addFeedback() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void addHotel() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void manageExtras() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void buyPackage() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}

	/** 
	* <!-- begin-UML-doc -->
	* <!-- end-UML-doc -->
	* @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	*/
	public void manageHotel() {
		// begin-user-code
		// TODO Auto-generated method stub

		// end-user-code
	}
	
	  public static void main(String[] args) {
		    Scanner scanner= new Scanner(System.in);
		    int a = 0;
		    Hotel hotel1 = new Hotel();
		    Room  room1 = new Room();
		  	System.out.println("Welcome! Please Enter The details of your hotel/s:" + "\n" + "Name: ");
		  	String hotelName = scanner.next();
		  	System.out.println("Address: ");
		  	String hotelAddress = scanner.next();
		  	System.out.println("Current Rating: ");
		  	String hotelRating = scanner.next();
		  	System.out.println("ID: ");
		  	int hotelID = scanner.nextInt();
		  	System.out.println("\n" + "Thank you! Your hotel details are: ");
		  	hotel1.addNewHotel(hotelName, hotelAddress, hotelRating, hotelID); 	
		  	System.out.println("How many hotel rooms do you want to add?");
		  	a = scanner.nextInt();
		  	System.out.println("Please Add the details of your room/s! "+ "\n");
		  	for (int i = 0;i<a;i++) {
		  		System.out.println("Floor: ");
		  		int roomFloor = scanner.nextInt();
		  		System.out.println("Number: ");
		  		int roomNumber = scanner.nextInt();
		  		System.out.println("Type: ");
		  		String roomType = scanner.next();
		  		System.out.println("ID: ");
		  		int roomID = scanner.nextInt();
		  		System.out.println("Price: ");
		  		int price = scanner.nextInt();
		  		System.out.println("Your " + (i+1) +". Added room details are: ") ;
		  		room1.addRoom(roomFloor,roomNumber,roomType,roomID,price);
		  		System.out.println((a) + " rooms are added to the system.");
		  	}
			}	        	
	    
	        
	    }