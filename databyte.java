
import java.util.Scanner;
public class databyte {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	//mendaklarasikan variabel
	byte A,B,C;

	//menganisialisasi variabel
	A=15;
	B=5;

	//melakukan operasi menggunakan variabel
	C = (byte)(A+B);

	//Menampilkan Nilai dari Variabel 
	System.out.println(C);

	//Melakukan inisialisasi variabel melalui keyboard/input melalui keyboard
	System.out.println("memasukan nilai 1");
	byte  D=sc.nextByte();
	System.out.println("memasukan nilai 2");
	byte E=sc.nextByte();

	//penjumlahan
	byte F=(byte)(D+E);
	System.out.println("hasil "+ F);
	}


	}


