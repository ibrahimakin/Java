public class CiktiB {
	public static void main(String[] args) {
		int x = 5;
		System.out.println(mtd(x++));
	}
	public int mtd3(int x) {
		x=x+25/5+3%2;
		return x;
	}
	public int mtd2(int x) {
		return mtd3(x*=3);
	}
	public int mtd(int x) {
		return mtd2(x++);
	}
}
		// Hata verir. mtd static olmali.