package pxu.edu.vn.bai11;

public class Bai123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hienthi();
		hienthi10lan();
		hienthithongdiep("Java co ban rat de");
		hienthithongdiep("Lap trinh khong kho");
		hienthithongdiep("Hoc ki he rat nong");
	}
	public static void hienthi() {
		System.out.println("Java co ban");
	}
	public static void hienthi10lan() {
		for(int i=0 ; i < 10 ; i++) {
		//System.out.println("Java co ban");
		hienthi();
		}
	}
	public static void hienthithongdiep(String msg) {
		System.out.println(msg);
	}
}
