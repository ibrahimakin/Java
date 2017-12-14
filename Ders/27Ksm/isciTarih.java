import javax.swing.JOptionPane;

public class isciTarih {
	int gun,ay,yil;
	isciTarih(int g,int a,int y) {
		if((g>0 && g<31) && (a>0 && a<12)) {
			gun=g; ay=a; yil=y;
		}else
			JOptionPane.showMessageDialog(null," Hatalý Tarih. ");
	}
	public String toString() {
		return String.format("%d/%d/%d",gun,ay,yil );
	}
}