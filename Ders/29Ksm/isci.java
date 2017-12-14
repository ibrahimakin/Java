public class isci {
	String Ad,Soyad;
	tarih dogum,giris;
	
	public isci(String a, String s,tarih d, tarih g) {
		Ad=a; Soyad=s; dogum=d; giris=g;
	}
	
	public String toString() {
		return String.format("%s %s , Doðum : %s , Ýþe Giriþ : %s",Ad,Soyad,dogum,giris);
	}
}