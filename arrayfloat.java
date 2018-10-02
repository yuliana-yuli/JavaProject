
import java.util.Scanner;

public class arrayfloat {

	public static void main(String[] args) {
		//mendaklarasikan variabel&menginilisasi
		float [] nilai ={22.15f,14.62f,11.27f};
		float [] angka = new float [6];
		//menginilisasi variabel
		angka[4]=14.4f;
		
		//operasi menggunakan variabel
		angka[5]=(float)(nilai[1]+nilai[2]-angka[4]);
		
		//menampilkan operasi menggunakan variabel
		System.out.println("nilai A : "+nilai[1]);
		System.out.println("nilai B : "+nilai[2]);
		System.out.println("nilai C : "+angka[5]);
		System.out.println("hasilnya adalah : "+angka[5]);
		
		//menampilkan operasi menggunakan variabel
		Scanner sc = new Scanner (System.in);
		System.out.print("masukan nilai 1 : ");
		angka[1]=sc.nextFloat();
		System.out.print("masukan nilai 2 : ");
		angka[2]= sc.nextFloat();
		
		angka[3]=(float)(angka[1]/angka[2]);
		System.out.println("hasilnya adalah : "+angka[3]);

	}


	}


