import java.util.Random;
import java.util.Scanner;

public class War_of_the_Worlds {
	public static void main(String[] args) {
		int n,  puan,toplam=0,insanGuc=0,uzayliGuc=0,  urun,silah,savunma,laser;
		Random deger=new Random();
		Scanner input=new Scanner(System.in);
		
		insan i[] = new insan[500];
		uzayli u[]= new uzayli[500];
		do {
			for (int j = 0; j <500; j++) {
			
				savunma=1+deger.nextInt(10);
				silah=1+deger.nextInt(10);
				urun=1+deger.nextInt(10);
			
				if (savunma%2==0) {
					i[j]=new Asker(savunma,silah);
					insanGuc+=i[j].GucHesapla();
				}
				else {
					i[j]=new Ciftci(savunma, urun);
					insanGuc+=i[j].GucHesapla();
				}
			
				savunma=1+deger.nextInt(10);
				laser=1+deger.nextInt(10);
				urun=1+deger.nextInt(10);
			
				if (savunma%2==0) {
					u[j]=new Cyborg(savunma,laser);
					uzayliGuc+=u[j].GucHesapla();
				}
				else {
					u[j]=new Madenci(savunma,urun);
					uzayliGuc+=u[j].GucHesapla();
				}
			}	
			puan=insanGuc-uzayliGuc;
			System.out.println("Puan "+ (puan<0 ? -1*puan +" uzaylý üstünlüðü": puan +" insan üstünlüðü"));
			toplam+=puan;
			
			System.out.println("Çýkýþ ---> 0");
			n=input.nextInt();
		}while(n!=0);
		System.out.println("Toplam Puan "+ toplam);
	}
}