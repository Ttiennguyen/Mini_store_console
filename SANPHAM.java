package MiniStrore_1;

import java.util.Scanner;

public class SANPHAM {
	

    String maSP;
	String tenSP;
	double gia;
	double sl;
	String dvt;

    Scanner input = new Scanner(System.in);

    public SANPHAM() {

    }

	public SANPHAM(String maSP, String tenSP,double gia, double sl, String dvt)
	{
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.gia = gia;
		this.sl =sl;
		this.dvt = dvt;
		
	}

	public String getMaSP() {
		return maSP;
	}

	public void setMaSP(String maSP) {
		this.maSP = maSP;
	}


	public String getTenSP() {
		return tenSP;
	}


	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}


	public String getDvt() {
		return dvt;
	}


	public void setDvt(String dvt) throws Exception {
       this.dvt=dvt;
	}


	public double getGia() {
		return gia;
	}


	public void setGia(double gia)  throws Exception {
      this.gia= gia;
	}

	public double getSl() {
		return sl;
	}

	public void setSl(double sl) {
		this.sl = sl;
	}

	public void nhapthongtin()
	{
		System.out.println("Nhap ma San Pham ");
		maSP = input.nextLine();
		System.out.println("Nhap ten San Pham ");
		tenSP = input.nextLine();
		System.out.println("Nhap don vi tinh ");
		dvt = input.nextLine();
		System.out.println("Nhap gia");
		gia = input.nextDouble();
		System.out.println("Nhap so luong san pham");
		sl = input.nextDouble();
	}
	
	
	
	public String toString()
	{
		return maSP+";"+tenSP+";"+gia+";"+sl+";"+dvt;
	}
	
	public void output()
	{
		System.out.println(toString());
	}
}
