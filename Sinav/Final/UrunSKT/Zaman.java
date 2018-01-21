public class Zaman {
	private int ay,yil;
	
	public Zaman(int a,int y) {
		setAy(a); setYil(y);
	}
	
	public void setAy(int a) {
		if(0<a && a<13) {
			ay = a;
		}
	}
	public int getAy()      {return ay;}
	public int getYil()    {return yil;}
	public void setYil(int y) {yil = y;}
}