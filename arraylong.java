
import java.util.Scanner;

public class arraylong {

	public static void main(String[] args) {
		//mendaklarasikan variabel&menginilisasi
		
		long [] nilai ={1400000,1482000,1721000};
		long [] angka=new long [6];
		
		//menginilisasi variabel
		
		angka[3]=11400;
		
		//operasi menggunakan variabel
		
		angka[5]=(long)(nilai[0]+nilai[1]-nilai[2]+angka[3]);
		
		//menampilkan operasi menggunakan variabel
		
		System.out.println("hasilnya adalah : "+angka[5]);
		
		//menampilkan operasi menggunakan variabel
		
		Scanner sc = new Scanner (System.in);
		System.out.print("masukan nilai 1 : ");
		angka[1]=sc.nextLong();
		System.out.print("masukan nilai 2 : ");
		angka[2] = sc.nextLong();
		angka[4]=(long)(angka[1]+angka[2]);
		System.out.println("hasilnya adalah : "+angka[4]);

	}



	}


