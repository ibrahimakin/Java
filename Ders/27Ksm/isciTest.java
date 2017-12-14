public class isciTest {

	public static void main(String[] args) {
		
		isciTarih d=new isciTarih(01,05,1998);
		isciTarih g=new isciTarih(02,01,2001);
		isciTarih c=new isciTarih(05,04,2006);
		
		//System.out.println(d);
		
		isciBilgi i1=new isciBilgi();
		
		i1.isciBilgi("Abc","QWER",d,g,c);
		
		System.out.println("isci Ad : "+i1.Ad+" "+i1.Soyad+" - Dogum Gunu : "+i1.dogum+" - ise Giris "+i1.giris+" - cikis "+i1.cikis);
	}
}