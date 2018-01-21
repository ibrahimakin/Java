public class Sinif1 {
	public void mtd() {
		System.out.println("Sinif1");
	}
}
public class Sinif2 extends Sinif1 {
	public void mtd() {
		System.out.println("Sinif2");
	}
	public void mtd1() {
		System.out.println("AAA");
	}
}
public class Sinif3 extends Sinif2 {
	public void mtd() {
		System.out.println("Sinif3");
	}
	public void mtd1() {
		System.out.println("BBB");
	}
}
public class Test{
	public static void main(String[] args) {
		Sinif1 s2;
		Sinif2 s3,s4;
		Sinif3 s5,s6;
		s2=new Sinif1();
		s3=new Sinif2();
		s4=new Sinif3();
		s5=new Sinif3();
		s2.mtd();
		s4.mtd();
		s2.mtd1();
		s5.mtd1();
	}
}