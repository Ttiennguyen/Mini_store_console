package MiniStrore_1;

import java.util.Scanner;

public class SANPHAM {
	

    String maSP;
	String tenSP;
    String dvt;
	double gia;
	String chatlieu;
	double sl;

    Scanner input = new Scanner(System.in);

    public SANPHAM() {

    }

	public SANPHAM(String maSP, String tenSP, String dvt, double gia, String chatlieu, double sl) throws Exception {
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.dvt = dvt;
		this.gia = gia;
		this.chatlieu = chatlieu;
		this.sl =sl;
		try {
            setDvt(dvt);
            setGia(gia);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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
        if(dvt.length()>10) 
        {
            throw new Exception("nhap sai don vi tinh ");
        }
	}


	public double getGia() {
		return gia;
	}


	public void setGia(double gia)  throws Exception {
        if(gia < 0) 
        {
            throw new Exception("nhap sai gia");
        }
	}


	public String getChatlieu() {
		return chatlieu;
	}

	public void setChatlieu(String chatlieu) {
		this.chatlieu = chatlieu;
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
		System.out.println("Nhap xuat su san pham");
		input.nextLine();
		chatlieu = input.nextLine();
	}
	
	
	
	public String toString()
	{
		return "ma SP la: "+maSP+"; ten SP la: "+tenSP+"; gia: "+gia+"; so luong: "+sl+"; don vi tinh la: "+dvt;
	}
	
	public void output()
	{
		System.out.println(toString());
	}
}
