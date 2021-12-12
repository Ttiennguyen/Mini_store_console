package MiniStrore_1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLi {
	
	
	 public ArrayList<SANPHAM> dssp;

	 double check = 0; 
	
	Scanner input = new Scanner(System.in);
	
	public QuanLi()
	{
		dssp= new ArrayList();
	}
	
	//// add san pham
	public void addSP(SANPHAM sp)
	{
		dssp.add(sp);
	}
	
	// hien thi ds san pham 
	public void output()
	{
		for(SANPHAM sp: dssp)
		{
			sp.output();
		}
	}
	
	// hien thi san pham gia cao nhat 	
	public double giacao() 
	{
		double max =0;
		
		for(SANPHAM sp: dssp)
		{
				if(sp.gia>max)
				{
					max = sp.gia;
					System.out.println("San pham gia cao nhat trong cua hang la :"+sp.tenSP);
				}
		}		
		return max;
	}

	
	
	// tìm kiếm sản phẩm theo tên 
	public void timkiem()
	{
		System.out.println("nhap vao ten san pham can tim kiem: ");
		String check_1 = input.nextLine();
		
		for(SANPHAM sp: dssp)
		{
			if(sp ==null  )
				continue;
			//check ten san pham 
			if(check_1.equals(sp.tenSP))
			{
				sp.output();
			}
			else 
			{
				System.out.println("san pham khong ton tai");
			}
		}
	}
	
	// xoá sản phẩm theo mã 
	public void xoaSP()
	{
		System.out.println("nhap vao ma san pham can xoa");
		String check_2 = input.nextLine();
		int index = 0;
		// check ma san pham 
		for(int i =0; i<dssp.size(); i++)
		{
			SANPHAM sp = dssp.get(i);
			if(check_2.equals(sp.maSP))
			{	
				index = i;
				break;
			}
		}
		dssp.remove(index);
	}
	
	// thanh toan 
	public void ThanhToan()
	{
		double n = 0;
		double soluong= 0;
		System.out.println("Xem lai so luong san hien co trong cua hang ");
		for(SANPHAM sp: dssp)
		{
			sp.output();
			System.out.println("nhap vao ma san pham can mua");
			String check_3 = input.nextLine();
			System.out.println("nhap vao so luong can mua");
			soluong = input.nextDouble();
				if(check_3.equals(sp.maSP))
				{	
					double e = sp.sl - soluong;
					sp.output();
					n = e*sp.gia;
					System.out.println("gia tien la "+n+"đ");
				}
			
		}
		
		
	}
	

}
