public class SekilTest {
	public static void main(String[] args) {
		Sekil s1=new Cember(3);
		//Cember c1=new Cember(3);
		s1.ciz(Sekil.mavi);
		System.out.println("S1 Alan : "+s1.alanHesap());
		
		Dortgen s2=new Dortgen(4, 5);
		s2.ciz(Sekil.sari);
		System.out.println("S2 Alan : "+s2.alanHesap());
		
									// Dogru abstract olduðundan nesnesi yaratýlamaz
		s1=new Dortgen(5, 6);		// Cemberden dortgene donusturduk.
		s1.ciz(Sekil.siyah);
		}
}