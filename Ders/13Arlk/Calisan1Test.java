import org.omg.CORBA.PUBLIC_MEMBER;

public class Calisan1Test {

	public static void main(String[] args) {
		MaasliCalisan c1=new MaasliCalisan("Elif", "Kuru", "1234", 800.0);
		SaatliCalisan c2=new SaatliCalisan("Ayþe", "Engin", "7894", 16.75,40);
		Komisyonlu c3=new Komisyonlu("Ali", "Yýlmaz", "9875", 10000,0.06);
		AsgariCalisan c4=new AsgariCalisan("Veli", "Kuru", "6645", 5000,0.04,300);
		
		Calisan1[] calisanlar=new Calisan1[4];
		
		calisanlar[0]=c1;
		calisanlar[1]=c2;
		calisanlar[2]=c3;
		calisanlar[3]=c4;

		for(Calisan1 suanki:calisanlar) {
			System.out.println(suanki);
			if (suanki instanceof AsgariCalisan) {
				AsgariCalisan c=(AsgariCalisan)(suanki);
				c.setAsgari(1.10*c.getAsgari());
				System.out.printf("Kazancý %.2f \n\n",suanki.kazanc());
			}
		}
	}
}