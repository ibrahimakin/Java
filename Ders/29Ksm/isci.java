public class isci {
	String Ad,Soyad;
	tarih dogum,giris;
	
	public isci(String a, String s,tarih d, tarih g) {
		Ad=a; Soyad=s; dogum=d; giris=g;
	}
	
	public String toString() {
		return String.format("%s %s , Do�um : %s , ��e Giri� : %s",Ad,Soyad,dogum,giris);
	}
}