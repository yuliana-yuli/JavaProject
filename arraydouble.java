
import java.util.Scanner;

	public class arraydouble {

	public static void main(String[] args) {
		//mendaklarasikan variabel&menginilisasi
		
		double [] nilai ={25.56,14.67,17.6};
		double [] angka =new double[6];
		
		//menginilisasi variabel
		
		angka[4]=3.55;
		
		//operasi menggunakan variabel
		
		angka[5]=(double)(nilai[1]+nilai[2]-angka[4]);
		
		//menampilkan operasi menggunakan variabel
		
		System.out.println("nilai a : "+nilai[1]);
		System.out.println("nilai b : "+nilai[2]);
		System.out.println("nilai c : "+angka[4]);
		System.out.println("hasilnya adalah : "+angka[5]);
		
		//menampilkan operasi menggunakan variabel
		
		Scanner sc = new Scanner (System.in);
		System.out.print("masukan nilai 1 : ");
		double angka1=sc.nextDouble();
		System.out.print("masukan nilai 2 : ");
		double angka2 = sc.nextDouble();
		double hasilnya=(double)(angka1/angka2);
		System.out.println("hasilnya adalah : "+hasilnya);

	}




	}


