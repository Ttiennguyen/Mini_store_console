package MiniStrore_1;

import java.util.Scanner;

public class Danhmuc {

	public static void main(String[] args) throws Exception {
		
		Scanner input = new Scanner(System.in);
		// gán giá trị flag = true chạy vòng lặp
		boolean flag = true;
		// a là nhập chức năng còn n là nhập số lượng ngay case 1
		int a,n,e;
		//ham ql để gọi các phần tử ra và hàm quan li nhân viên 
		QuanLi ql =new QuanLi();
		QuanLi_NhanVien ql_nv =new QuanLi_NhanVien();
		//println bth
		 System.out.println("\t      Welcome ban den Mini-Store \n");
		
		//vòng lặp vô tận
		 do {	 
			 System.out.println("+---\t\tChon chuc nang can lam\t\t\t     ---+");
		     System.out.println("| 1.Nhap thong tin san pham  \t 6.Nhap thong tin Nhan Vien     |");
		     System.out.println("| 2.Xuat danh sach san pham  \t 7.Xem Nhan Vien trong cua hang |");
		     System.out.println("| 3.tim san pham             \t 8.Tim Nhan Vien                |");
		     System.out.println("| 4.San pham gia cao nhat    \t 9.Xoa Nhan Vien                |");
		     System.out.println("| 5.Xoa san pham             \t 10.thanh toan                  |");
		     System.out.println("+---\t\tNhap so khac de thoat\t\t\t     ---+");
		     //nhập chức năng 
			 a = input.nextInt();
			 // chạy vòng swich case 
			  switch (a) 
	            {
	            	case 1:// nhập thông tin sản phẩm 
	            		System.out.println("nhap so luong san pham can them");
	            		n = input.nextInt();
	            		System.out.println("nhap danh sach can them: ");
	            		for(int i =0; i<n; i++)
	            		{
	            			SANPHAM sp =new SANPHAM();
	            			sp.nhapthongtin();
	            			// them sp
	            			ql.addSP(sp);
	            		}	         
	            		break;
	            	case 2:// in thông tin sản phẩm ra màn hình console
	            		ql.output();
	            		break;
	            	case 3:// tìm kiếm mã sản phẩm và in ra mã sản phâm r
	            		ql.timkiem();
	            		break;
	            	case 4:// tim san pham gia cao nhat trong cua hangs
	            		System.out.println(ql.giacao());
	            		break;
	            	case 5:// xoá sản phẩm theo mã sản phẩm 
	            		ql.xoaSP();
	        			ql.output();
	            	case 6:// cập nhật nhân viên trong cửa hàng
	            		System.out.println("nhap so luong nhan vien can them ");
	            		n = input.nextInt();
	            		System.out.println("nhap danh sach can them: ");
	            		for(int i =0; i<n; i++)
	            		{
	            			NhanVien nv =new NhanVien();
	            			nv.nhapNV();
	            			// them sp
	            			ql_nv.addNV(nv);
	            		}	         
	            		break;
	            	case 7:// xem nhân viên trong cửa hàng 
	            		ql_nv.xuatNV();
	            		break;
	            	case 8: // tìm nhân viên trong cửa hàng
	            		ql_nv.timkiem_NV();
	            		break;
	            	case 9: // xoá nhân viên trong cửa hàng
	            		ql_nv.xoaNV();
	            		break;
	            	case 10: // thanh toan 
	            		ql.ThanhToan();
	            		break;
	            	default:// nhập 1 số bất kì để thoát chương trình
	                    System.out.println("Goodbye");
	                    flag = false;
	                    break;
	            }
		 }while (flag);// kết thúc vòng lặp

	}

}
