
import java.util.Scanner;
public class databoolean {

	public static void main(String[] args) {
		// Mendeklarasi Variabel
		int r;
		int a;
		
		//Menganalisiasi Variabel
		r = 20;
		a = 5;
		
		//Melakukan Operasi Menggunakan Variabel
		boolean test_and = false;
		boolean test_or = false;
		test_and = (r < 20) && (r++ < 19);
		test_or = (a < 20) || (a++ < 19);
		
		//Menampilkan Nilai dari Variabel
		System.out.println("R : " + r);
		System.out.println("A : " + a);
		System.out.println("Logika AND :" + test_and);
		System.out.println("Logika OR :" + test_or);
		
		//Melakukan Insialisasi Variabel Melalui keyboard/input 
		int m;
		boolean and = false;
		boolean or = false;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("masukan nilai variabel");
		System.out.println("m :");
		m = keyboard.nextInt();
		and = (m < 10) && (a++ < m);
		or = (m < 10) || (a++ < m);
		System.out.println("m : " + m);
		System.out.println("Logika AND : " + and);
		System.out.println("Logika OR : " + or);
		
		}
		

	




	}


