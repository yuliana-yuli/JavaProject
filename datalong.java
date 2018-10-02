
import java.util.Scanner;
public class datalong {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	//mendaklarasikan variabel
	long A,B,C;

	//menganisialisasi variabel
	A=15000000;
	B=20000000;

	//melakukan operasi menggunakan variabel
	C =(long)( A+B);

	//Menampilkan Nilai dari Variabel 
	System.out.println(C);

	//Melakukan inisialisasi variabel melalui keyboard/input melalui keyboard
	System.out.println("memasukan nilai 1");
	long  D=sc.nextLong();
	System.out.println("memasukan nilai 2");
	long E=sc.nextLong();

	//penjumlahan
	long F=(long)(D+E);
	System.out.println("hasil "+ F);
	}


	}


