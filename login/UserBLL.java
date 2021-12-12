package login;

import java.io.*;
import java.util.ArrayList;

public class UserBLL {
	
	ArrayList<User> list =null;

	public UserBLL() {
		list = new ArrayList<User>();
	}
	public void xemdanhsach()
	{
		for(User u:list)
		{
			System.out.println(u);
		}	
	}
	
	public boolean dangky(User u)
	{
		UserDao dao= new UserDao();
		boolean flag =false;
		list.add(u);
		// check email có hay ko để đọc file 
		ArrayList<User> list = dao.readFile("useraccounts.txt");
		for(User user :list)
		{
			if(user.getEmail().equalsIgnoreCase(u.getEmail()))
			{
				flag = true;
				break;
			}
		}
		if (flag == true)
		{
			System.out.println("email da ton tai");
		}
		else 
		{
			// ghi vao file 
			dao.writeFile("useraccounts.txt",u);
		}
		
		return flag;
	}
	
	
}
