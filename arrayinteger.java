
import java.util.Scanner;

public class arrayinteger {

	public static void main(String[] args) {
		//mendaklarasikan variabel&menginilisasi
		
		int [] nilai ={11000,12000};
		int [] angka =new int [6];
		
		//menginilisasi variabel
		
		angka[4]=13000;
		
		//operasi menggunakan variabel
		
		angka[5]=(int)(nilai[0]+nilai[1]-angka[4]);
		
		//menampilkan operasi menggunakan variabel
		
		System.out.println("hasilnya adalah : "+angka[5]);
		
		//menampilkan operasi menggunakan variabel
		
		Scanner sc = new Scanner (System.in);
		System.out.print("masukan nilai 1 : ");
		angka[1]=sc.nextInt();
		System.out.print("masukan nilai 2 : ");
		angka[2]= sc.nextInt();
		angka[3]=(int)(angka[1]+angka[2]);
		System.out.println("hasilnya adalah : "+angka[3]);


	}



	}


