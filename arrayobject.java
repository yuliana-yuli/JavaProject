
import java.util.Scanner;
public class arrayobject {

	public static void main(String[] args) {
		//DEKLARASI VARIABEL
		Object[] animals= new Object[2];
		//INISIALISASI VALUE
		animals[0] = "cat";
		animals[1] = "rabbit";
		//MENAMPILKAN HASIL
		System.out.println("jenis peliharaan saya : " + animals[0]);
		System.out.println("jenis peliharaan saya : " + animals[1]);
		//MENGAMBIL IMPUT DARI KEYBOARD
		Object[] animals1= new Object[2];
		Scanner keyboard = new Scanner(System.in);
		System.out.println("masukkan nama kucing :");
		animals1[0] = keyboard.next();
		System.out.println("masukan nama kelinci :");
		animals1[1] = keyboard.next();
		System.out.println("nama kucing saya : " + animals1[0]);
		System.out.println("nama kucing saya : " + animals1[1]);



	}

}
