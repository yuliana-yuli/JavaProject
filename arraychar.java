
import java.util.Scanner;

public class arraychar {

	public static void main(String[] args) {
	//mendaklarasikan variabel&menginilisasi
		char [] nilai ={'a','b','c',};
		
		//contoh menginisialisasi variabel
		//char nilai1='a';
		
		//operasi menggunakan variabel
		int a=78;
		if (a>80){
			//menampilkan operasi menggunakan variabel
			System.out.println("nilai saya adalah : "+nilai[0]);}
		else if (a>69){
			System.out.println("nilai saya adalah : "+nilai[1]);
		}
		else {
			System.out.println("nilai saya adalah : "+nilai[2]);
		}
		
			//melakukan inisialisasi menggunakan input dari keyboard
		
			Scanner sc = new Scanner (System.in);
			System.out.print("masukan nilai : ");
			int nilai3 = sc.nextInt();
			if (nilai3>80){
				//menampilkan operasi menggunakan variabel
				
				System.out.println("nilai saya adalah : "+nilai[0]);}
			else if (nilai3>75){
				System.out.println("nilai saya adlah : "+nilai[1]);
			}
			else {
				System.out.println("nilai saya adalah : "+nilai[2]);
			}
			
		}


	}


