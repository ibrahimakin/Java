public class IsciTest {
	public static void main(String[] args) {
		tarih dogum=new tarih(24,07,1949);
		tarih giris=new tarih(12,03,1988);

		isci i1=new isci("Ali","Yýlmaz",dogum,giris);
		System.out.print(i1);
	}
}