package MiniStrore_1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class IO_file {
	
	public void readfile()
	{
		ArrayList<SANPHAM> dssp = new ArrayList<SANPHAM>();
		try 
		{
			File f = new File("sanpham.txt");
			FileReader fr = new FileReader(f);
			 BufferedReader br = new BufferedReader(fr);
			  String line = br.readLine();
	            while(line != null) 
	            {
	            	  String arr[] = line.split("[;]+");
	            	  SANPHAM sp = new SANPHAM(arr[0],arr[1],Double.parseDouble(arr[2]),Double.parseDouble(arr[3]),arr[4]);
	            	  sp.output();
	            	  dssp.add(sp);
	            	  line = br.readLine();
	            }
	            br.close();
	            fr.close();
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}
	
	public void writefile(SANPHAM sp)
	{
		ArrayList<SANPHAM> dssp = new ArrayList<SANPHAM>();
		String line = sp.getMaSP()+";"+sp.getTenSP()+";"+sp.getGia()+";"+sp.getSl()+";"+sp.getDvt();
		try 
		{
			File f = new File("sanpham.txt");
			FileWriter fw = new FileWriter(f);
			 PrintWriter pw = new PrintWriter(fw);
		
				 pw.print(line);
				 
	            pw.close();
	            fw.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
