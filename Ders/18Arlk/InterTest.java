public class InterTest {
	public static void main(String[] args) {
		INTER dizi[]=new INTER[4];
		dizi[0]=new SatinAl("u1", 10, 100);
		dizi[1]=new SatinAl("u2", 5, 10);
		dizi[2]=new Maasli("Ali", 1234, 2500);
		dizi[3]=new Yuzdeli("Veli", 4321,2500, 0.5, 10);
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i].toString());
		}
		
		double top=0;
		for(INTER a: dizi) {
			top+=a.Hesap();
		}
		System.out.println("\n"+top);
	}
}