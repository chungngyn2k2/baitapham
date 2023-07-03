package pxu.edu.vn.bai08;

import java.util.Scanner;

public class LapTrinhMenu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("************************************");
		System.out.println("Hiển thị lời chào (Nhấn W hoặc w)");
		System.out.println("Đặt hàng (Nhấn O hoặc o)");
		System.out.println("Thanh toán (Nhấn P hoặc p)");
		System.out.println("************************************");
		System.out.print("Lựa chọn của bạn: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		switch (Character.toLowerCase(ch)) {
		case 'w':
			System.out.println("WELCOME TO PXU !!");
			break;
		case 'o':
			System.out.println("Ban da chon dat hang!");
			break;
		case 'p':
			System.out.println("Ban da chon thanh toan!");
			break;
		default:
			System.out.println("Ban da khong chon menu");
		}
		System.out.println("KET THUC CHUONG TRINH");
	}

}
