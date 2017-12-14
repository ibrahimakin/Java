import java.util.ArrayList;

public class OgrenciTest {
	public static void main(String[] args) {
		
		Ogrenci ogr1=new Ogrenci();		
		Ogrenci ogr2=new Ogrenci("Mike",12);
		Ogrenci ogr3=new Ogrenci("Lucas",11);
		
		ArrayList<Ogrenci>Ogrenciler=new ArrayList<Ogrenci>();
		Ogrenciler.add(ogr1);
		Ogrenciler.add(ogr2);
		Ogrenciler.add(ogr3);
		
		for(Ogrenci i:Ogrenciler) {
			System.out.println(i.Ad+"\t"+i.Yas);
		}
		
		System.out.println("----------");
		
		for(int i=0;i<Ogrenciler.size();i++) {
			System.out.println(Ogrenciler.get(i).Ad+"\t"+Ogrenciler.get(i).Yas);
		}
		
		System.out.println("----------");
		
		Ogrenciler.set(0,new Ogrenci("Will",11));
		
		for(int i=0;i<Ogrenciler.size();i++) {
			System.out.println(Ogrenciler.get(i).Ad+"\t"+Ogrenciler.get(i).Yas);
		}
	}
}