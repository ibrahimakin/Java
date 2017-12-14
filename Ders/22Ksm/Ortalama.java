public class Ortalama {
	public static void main(String[] args) {
		int sayilar1[  ] = {1,4,0,15};
		int sayilar2[][] = {{1,2},{1,1,1},{4,5,6}};
		ortalama(sayilar1);
		System.out.println("----");
		ortalama(sayilar2);
	}
	static void ortalama(int dizi[]) {
		int toplam=0;
		for(int i=0;i<dizi.length;i++) {
			toplam+=dizi[i];
		}
		System.out.println((double)toplam/dizi.length);
	}
	static void ortalama(int dizi[][]) {
		int ort=0,sayi=0;
		for(int i=0;i<dizi.length;i++) {
			int toplam=0;
			for(int j=0;j<dizi[i].length;j++) {
				toplam+=dizi[i][j];
				//ort+=toplam;
				ort+=dizi[i][j];
				sayi++;
			}
			System.out.println((double)toplam/dizi[i].length);
		}
		System.out.println((double)ort/sayi);
	}
}