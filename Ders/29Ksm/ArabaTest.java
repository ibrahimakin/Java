public class ArabaTest {
	public static void main(String[] args) {
		
		Renk r1=new Renk("Mavi");
		Marka m1=new Marka("BMW");
		
		Araba a1=new Araba(r1,m1,"M3-GTR",2005);
		
		System.out.println(a1);
	}
}