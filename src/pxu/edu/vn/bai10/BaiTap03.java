package pxu.edu.vn.bai10;

import java.util.Scanner;

public class BaiTap03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("n = ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		n = Math.abs(n); //Lấy giá trị tuyệt đối của n
		while(n>0) {
			System.out.println("Hello");
			n=n-1;
		}
	}

}
