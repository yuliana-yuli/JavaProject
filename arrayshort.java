
import java.util.Scanner;

public class arrayshort {

	public static void main(String[] args) {
		//mendaklarasikan variabel&menginilisasi
		
		short [] nilai ={3210,1000,3000};
		short [] angka =new short [4];
		
		//menginilisasi variabel
		
		short hasil;
		
		//operasi menggunakan variabel
		
		hasil=(short)(nilai[0]+nilai[1]-nilai[2]);
		
		//menampilkan operasi menggunakan variabel
		System.out.println("nilai ke 1 : "+nilai[0]);
		System.out.println("nilai ke 2 : "+nilai[1]);
		System.out.println("nilai ke 3 : "+nilai[2]);
		System.out.println("hasilnya   : "+hasil);
		
		//menampilkan operasi menggunakan variabel
		
		Scanner sc = new Scanner (System.in);
		System.out.print("masukan nilai 1 : ");
		angka[1]=sc.nextShort();
		System.out.print("masukan nilai 2 : ");
		angka[2] = sc.nextShort();
		angka[3]=(short)(angka[1]+angka[2]);
		System.out.println("hasilnya adalah : "+angka[3]);

	}



	}


