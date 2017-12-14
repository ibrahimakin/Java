public class tarih {
	private int gun,ay,yil;
	
	public tarih(int g,int a,int y){
		gun=g; ay=a; yil=y;
	}
	public String toString(){
		return String.format("%d/%d/%d",gun,ay,yil );
	}
}