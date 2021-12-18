package MiniStrore_1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLi_NhanVien {

	// tạo mảng nhân viên
	 public ArrayList<NhanVien> dsnv;	 
	 
	 Scanner input = new Scanner(System.in);
	
	 // tạo mảng nhân viên 
	 public QuanLi_NhanVien()
	 {
		 dsnv = new ArrayList();
	 }
	// them nv
	 public void addNV(NhanVien nv)
	 {
		 dsnv.add(nv);
	 }
	 
	 // in nhân viên ra ngoài màn hình
	 public	void xuatNV()
	 {
		 for(NhanVien nv: dsnv)
		 {
			 nv.xuatNV();
		 }
	 }
	 // tìm kiếm nhân viên
	 public void timkiem_NV()
	 {
		 System.out.println("nhap vao ten nhan vien can tim kiem: ");
		 String check_1 = input.nextLine();
		 
		 for(NhanVien nv: dsnv)
		 {
			 if(nv == null )
					continue;
			 ///
			 if(check_1.equals(nv.tenNV))
				{
				 	nv.xuatNV();
				}
				else 
				{
					System.out.println("san pham khong ton tai");
				}
		 }
	 }
	 
	 public void xoaNV()
		{
			System.out.println("nhap vao ma nhan vien can xoa");
			String check_2 = input.nextLine();
			int index = 0;
			// check tên nhân viên
			for(int i =0; i<dsnv.size(); i++)
			{
				NhanVien nv = dsnv.get(i);
				if(check_2.equals(nv.maNV))
				{	
					index = i;
					break;
				}
			}
			dsnv.remove(index);
		}
	 
	 
	 
	 
}
