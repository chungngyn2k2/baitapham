package pxu.edu.vn.bai08;

import java.util.Scanner;

public class LapTrinhMenu {

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
		if((ch=='V')||(ch=='v')) {
			System.out.println("WELCOME TO PXU");
		}
		if((ch=='O')||(ch=='o')) {
			System.out.println("BẠN LỰA CHỌN ĐẶT HÀNG");
		}
		if((ch=='P')||(ch=='p')) {
			System.out.println("BẠN LỰA CHỌN THANH TOÁN");
		}
		System.out.println("KẾT THÚC CHƯƠNG TRÌNH");
	}

}
