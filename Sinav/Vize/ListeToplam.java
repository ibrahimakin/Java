
public class ListeToplam {
	
	public static void main(String[] args) {
		
		int top=0;
		int a[][][]= {{{1,2,3},{4},{5,6},{8,9}},{{12,13,14},{5},{9,11},{20,22}}};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i][0].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					top+=a[i][j][k];
				}
			}
		}
		System.out.println(top);
		
		// Toplam = 85
	}
}
