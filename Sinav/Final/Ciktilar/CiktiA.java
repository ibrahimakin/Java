public class CiktiA {
	public static void main(String[] args) {
		int i,top=0;
		for (i = 0; i < 10; i++) {
			if (i%2!=1) {
				break;
			}
			top+=1*2;
			continue;
		}
		System.out.println(top);
	}
}
		// Cikti -> 0