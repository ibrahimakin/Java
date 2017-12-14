import javax.swing.JOptionPane;

public class Time {
	private int hour,min,sec;
	void setTime(int h,int m, int s) {
		if((h>=0 && h<24) && (m>=0 && m<60) && (s>0 && s<60)) {
			hour=h; min=m; sec=s;
		}else
			JOptionPane.showMessageDialog(null," Hatalý Girdi. ");
	}
	String toUniversalString() {
		return String.format("%02d : %02d : %02d", hour,min,sec);
	}
	
	String toStringg() {
		return String.format("%02d : %02d : %02d %s",(hour==0 || hour==12) ? 12 : hour%12,min,sec,(hour<12 ? "AM":"PM"));
	}
}