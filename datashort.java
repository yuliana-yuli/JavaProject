
import java.util.Scanner;
public class datashort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	//mendaklarasikan variabel
	short A,B,C;
	
	//menganisialisasi variabel
	A=1500;
	B=2000;

	//melakukan operasi menggunakan variabel
	C =(short)( A+B);

	//Menampilkan Nilai dari Variabel 
	System.out.println(C);

	//Melakukan inisialisasi variabel melalui keyboard/input melalui keyboard
	System.out.println("memasukan nilai 1");
	short  D=sc.nextShort();
	System.out.println("memasukan nilai 2");
	short E=sc.nextShort();

	//penjumlahan
	short F=(short)(D+E);
	System.out.println("hasil "+ F);
	}


	}


