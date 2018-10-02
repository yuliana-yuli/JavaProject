import java.util.Scanner;


public class arraystring {


	public static void main(String[] args) {
		//Deklarasi variabel & Menganalisis
		
				byte [] nilai =new byte[6];
				
				//menginilisasi variabel
				
				nilai[0]=10;
				nilai[1]=20;
				nilai[2]=35;
				byte hasil;
				
				//operasi menggunakan variabel
				
				hasil=(byte)(nilai[0]+nilai[1]-nilai[2]);
				
				//menampilkan operasi menggunakan variabel
				
				System.out.println("hasilnya adalah : "+hasil);
				
				//menampilkan operasi menggunakan variabel
				
				Scanner sc = new Scanner (System.in);
				System.out.print("masukan nilai 1 : ");
				nilai[4]=sc.nextByte();
				System.out.print("masukan nilai 2 : ");
				nilai[3] = sc.nextByte();
				
				nilai[5]=(byte)(nilai[4]+nilai[3]);
				System.out.println("hasilnya adalah : "+nilai[5]);
				

	}

}
