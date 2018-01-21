public class MatrisToplamTranspoz {
	public static int[][] MatrisTopla(int a[][], int b[][]) {
		System.out.println("\n \t Matris Toplama \n");
		int satir=a.length;
		int sutun=a[0].length;
		int sonuc[][]=new int[satir][sutun];
		for(int i=0;i<satir;i++) {
			for (int j = 0; j < sutun; j++) {
				sonuc[i][j]=a[i][j]+b[i][j];
			}
		}
		return sonuc;
	}
	public static int[][] MatrisTranspoz(int a[][]) {
		System.out.println("\n \t Matris Transpoz \n");
		int satir=a.length;
		int sutun=a[0].length;
		int sonuc[][]=new int[sutun][satir];
		for (int i = 0; i < satir; i++) {
			for (int j = 0; j < sutun; j++) {
				sonuc[j][i]=a[i][j];
			}
		}
		return sonuc;
	}
	public static int[][] RandomMatris(int m,int n) {
		System.out.println("\n \t Rastgele Matris Üret \n");
		int a[][]=new int[m][n];
		for (int i = 0; i < m ; i++) {
			for (int j = 0; j < n ; j++) {
				a[i][j]=(int)(Math.random()*10);
			}
		}
		return a;
	}
	private static void MatrisGoster(int a[][]) {
		for (int i = 0; i < a.length ; i++) {
			for (int j = 0; j < a[0].length ; j++) {
				System.out.print("\t"+a[i][j]);
			}
			System.out.println();
		}	System.out.println("\n\t -----------------");
	}
	public static void main(String[] args) {
		int matris1[][]=RandomMatris(3, 4);
		MatrisGoster(matris1);
		int matris2[][]=RandomMatris(3, 4);
		MatrisGoster(matris2);
		
		int matris3[][]=MatrisTopla(matris1, matris2);
		MatrisGoster(matris3);
		
		int matris4[][]=MatrisTranspoz(matris3);
		MatrisGoster(matris4);
	}
}