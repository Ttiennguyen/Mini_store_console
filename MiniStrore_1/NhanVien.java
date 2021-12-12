package MiniStrore_1;

import java.util.Scanner;

public class NhanVien {
	
	
	String maNV;
	String tenNV;
	int tuoi;
	String quequan;
	int cmnd;
	
	Scanner input = new Scanner(System.in);
	
	
	public NhanVien() {
		
	}


	public NhanVien(String maNV, String tenNV, int tuoi, String quequan, int cmnd) {
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.tuoi = tuoi;
		this.quequan = quequan;
		this.cmnd = cmnd;
	}


	public String getMaNV() {
		return maNV;
	}


	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}


	public String getTenNV() {
		return tenNV;
	}


	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}


	public int getTuoi() {
		return tuoi;
	}


	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}


	public String getQuequan() {
		return quequan;
	}


	public void setQuequan(String quequan) {
		this.quequan = quequan;
	}

	public int getCmnd() {
		return cmnd;
	}


	public void setCmnd(int cmnd) {
		this.cmnd = cmnd;
	}

	public void nhapNV()	{
		System.out.println("Nhap vao ma Nhan vien");
		maNV = input.nextLine();
		System.out.println("Nhap vao ten Nhan vien ");
		tenNV= input.nextLine();
		System.out.println("Nhap tuoi Nhan vien");
		tuoi = input.nextInt();
		System.out.println("Nhap vao que quan");
		input.next();
		quequan = input.nextLine();
		System.out.println("nhap vao cccd");
		cmnd = input.nextInt();
		
	}
	
	public void xuatNV()
	{
		System.out.print("Ten nhan vien la: "+tenNV+"; ma so: "+maNV+"; tuoi: "+tuoi+"\n");
	}

	

}
