public class PersonelTest {
	public static void main(String[] args) {
		Personel p1=new Personel("abc","xyz","t-45", 100, 0.3);
		System.out.println(p1);
		System.out.println("Maas "+p1.maas());
		
		p1.setKomisyon(5);
		System.out.println(p1);
		
		MaasliPersonel p2=new MaasliPersonel("abc","xyz","t-45", 200, 0.5,15);
		System.out.println(p2);
		System.out.println("Maas "+p2.maas());
	}
}