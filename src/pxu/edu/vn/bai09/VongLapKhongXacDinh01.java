package pxu.edu.vn.bai09;

public class VongLapKhongXacDinh01 {

	public static void main(String[] args) {
		// Sinh ngẫu nhiên 1 số thực dấu chấm động trong [0;1]
		double snn = Math.random();
		// Tạo số nguyên dương ngẫu nhiên trong [0;1] dựa trên snn
		int n = (int)(100*snn+1);
		// Xuất n
		System.out.println("n = "+n);
		while(n % 15 != 0) {
			snn = Math.random();
			n = (int)(100*snn+1);
			System.out.println("n = "+n);
		}
		System.out.println("CHUONG TRINH KET THUC");
	}

}
