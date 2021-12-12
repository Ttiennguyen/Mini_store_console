package login;

import java.util.*;

public class User_CUI {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		User u = new User();
		System.out.println("Enter email");
		u.setEmail(input.nextLine());
		
		System.out.println("Enter Password");
		u.setPassword(input.nextLine());
		//logic
		UserBLL logic =new UserBLL();
		logic.dangky(u);
	}
	
	
	
}
