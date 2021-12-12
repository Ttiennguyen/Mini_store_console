package login;

import java.io.*;
import java.util.ArrayList;

public class UserDao {

	// ghi file 
	public void writeFile(String fileName,User u)
	{
		String line = u.getEmail()+"; "+u.getPassword();
		try 
		{
			File f = new File(fileName);
			FileWriter fw = new FileWriter(f,true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(line);
			
			
			
			fw.close();
			pw.close();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("ghi file thanh cong");
	}
	
	// dọc file
	public ArrayList<User> readFile(String fileName)
	{
		ArrayList<User> list = new ArrayList<User>();
		try 
		{
			File f = new File(fileName);
			FileReader fr = new FileReader(f);
			BufferedReader br =new BufferedReader(fr);
			
			String line= br.readLine();
			while(line!=null)
			{
				//check email
				String arr[] = line.split("[,]+");
				// tao doi tuong user
				User u =new User(arr[0], arr[1]);  // email , password
				list.add(u);
				line = br.readLine();	
			}
			
			br.close();
			fr.close();
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		return list;
	}
	
}
