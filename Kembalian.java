import java.util.Scanner;
public class Kembalian {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan jumlah uang : ");
		int jumlahUang = in.nextInt();
		System.out.print("Masukkan total pembayaran : ");
		int jumlahBayar = in.nextInt();
		System.out.println(hitungKembalian(jumlahUang, jumlahBayar));
	}
	
	public static String hitungKembalian(int jumlahUang, int jumlahBayar) {
		int kembalian = jumlahUang - jumlahBayar;
		if (kembalian >= 50000) {
			return kembalian/50000 + " x 50000\n" +hitungKembalian(kembalian, (kembalian/50000) * 50000);
		} else if (kembalian >= 20000) {
			return kembalian/20000 + " x 20000\n" +hitungKembalian(kembalian, (kembalian/20000) * 20000);
		} else if (kembalian >= 10000) {
			return kembalian/10000 + " x 10000\n" +hitungKembalian(kembalian, (kembalian/10000) * 10000);
		} else if (kembalian >= 5000) {
			return kembalian/5000 + " x 5000\n" +hitungKembalian(kembalian, (kembalian/5000) * 5000);
		} else if (kembalian >= 2000) {
			return kembalian/2000 + " x 2000\n" +hitungKembalian(kembalian, (kembalian/2000) * 2000);
		} else if (kembalian >= 1000) {
			return kembalian/1000 + " x 1000\n" +hitungKembalian(kembalian, (kembalian/1000) * 1000);
		} else if (kembalian >= 500){
			return "1 x 500";
		} else {
			return "";
		}
	}
}
