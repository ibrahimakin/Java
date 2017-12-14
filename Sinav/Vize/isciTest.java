import java.util.Scanner;

public class isciTest {
	public static void main(String[] args) {
		isci i1=new isci();
		isci i2=new isci();
		
		i1.setAd("isim");
		i1.setSoyad("Soy");
		i1.setCa(84);
		i1.setSu(20);
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("isci Ad: ");
		i2.setAd(input.nextLine());
		System.out.println("Soyad: ");
		i2.setSoyad(input.nextLine());
		System.out.println("Calisma Saati: ");
		i2.setCa(input.nextInt());
		System.out.println("Saatlik Ucret: ");
		i2.setSu(input.nextInt());
		
		System.out.println("isci 1 -> Ad: "+i1.getAd()+" - Soyad: "+i1.getSoyad()+" - Maas: "+Hesapla(i1.getCa(),i1.getSu()));
		System.out.println("isci 2 -> Ad: "+i2.getAd()+" - Soyad: "+i2.getSoyad()+" - Maas: "+Hesapla(i2.getCa(),i2.getSu()));
	}
	
	static int Hesapla(int cs,int su) {
		int hesap=cs*su;
		if(cs>100) {
			hesap+=(cs-100)*50;
		}
		return hesap;
	}
}