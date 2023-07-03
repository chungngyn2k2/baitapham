package pxu.edu.vn.bai09;

public class VongLapKhongXacDinh02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int n;
		do {
			n = (int)(Math.random()*100+1);
			count = count + 1;
			System.out.println("n = "+n);
		} while(n % 20 != 0) ;
		System.out.println("CT ket thuc sau "+count +" buoc");
		System.out.println("ket thuc chuong trinh");
	}

}
