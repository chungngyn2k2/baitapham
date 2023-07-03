package pxu.edu.vn.bai10;

import java.util.Scanner;

public class BaiTao04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("n = ");
		Scanner sc = new Scanner(System.in);
		try {
			int n = sc.nextInt();
			n = Math.abs(n); //Lấy giá trị tuyệt đối của n
			while(n>0) {
				System.out.println("Hello");
				n=n-1;
			}
		}catch(Exception e) {
			System.out.println("Loi nhap du lieu");
		}
	}

}
