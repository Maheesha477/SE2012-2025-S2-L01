import java.util.*;

public class Welcome{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your First Name: ");
		String fname = sc.nextLine();
		System.out.print("Enter your Last Name: ");
		String lname = sc.nextLine();
		System.out.print("Welcome to the Second Year "+fname+" "+lname);
}
}