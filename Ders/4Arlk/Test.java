public class Test {
	public static void main(String[] args) {
		Calisan c1=new Calisan("ali","veli",123,10,25);
		YuzdeCalisan c2=new YuzdeCalisan("abc","xyz",333,10,25,10);
		System.out.println(c1.getAd()+" "+c1.getSoyad()+" "+c1.Kazanc());
		System.out.println(c2.getAd()+" "+c2.getSoyad()+"  "+c2.Kazanc());
	}
}