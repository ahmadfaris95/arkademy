import java.util.Scanner;
public class DrawImage {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan ukuran persegi (contoh 3) : ");
		int ukuran = in.nextInt();
		boolean genap = true;
		
		// If-else condition, untuk mencetak output persegi
		if (ukuran <= 0) System.out.println("Ukuran tidak valid");
		else if (ukuran == 1) System.out.println("*");
		// Untuk kasus ukuran ganjil
		else if (ukuran % 2 == 1) System.out.println(drawImage(ukuran));
		// Untuk kasus ukuran ganjil
		else {
			// While, untuk mengecek input apakah genap atau ganjil
			while (genap) {
				System.out.println("Ukuran harus ganjil");
				System.out.print("Masukkan ukuran persegi (contoh 3) : ");
				ukuran = in.nextInt();
				// Untuk kasus ukuran ganjil
				if (ukuran % 2 == 1) {
					System.out.println(drawImage(ukuran));
					genap = false;
				}
			}
		}
	}
	
	// Untuk mencetak output dengan ukuran bilangan ganjil, ukuran > 1
	public static String drawImage(int ukuran) {
		String persegi = "";
		for (int i = 1; i <= ukuran; i++) {
			for (int j = 1; j <= ukuran; j++) {
				// Untuk baris pertama dan terakhir
				if (i == 1 || i == ukuran) {
					if (j == 1 || j == (ukuran+1)/2 || j == ukuran) persegi += "* ";
					else persegi += "= ";
				} 
				// Untuk baris tengah dan kolom tengah
				else if (i == (ukuran+1)/2 || j == (ukuran+1)/2) {
					persegi += "* ";
				} else {
					persegi += "= ";
				}
			}
			
			persegi += "\n"; // Untuk output baris baru
		}
		
		return persegi; // Untuk mencetak output persegi
	}
}
