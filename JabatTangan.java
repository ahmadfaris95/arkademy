import java.util.Scanner;
public class JabatTangan {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Banyak orang = ");
		int banyakOrang = in.nextInt();
		System.out.println("Banyak jabat tangan = " +count_handshake(banyakOrang));
	}
	
	// Metode pengulangan secara rekursif
	public static int count_handshake(int orang) {
		if (orang == 1) return 0;
		else if (orang == 2) return 1;
		else return orang - 1 + count_handshake(orang-1);
	}
}
