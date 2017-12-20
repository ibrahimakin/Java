
public class Dortgen implements Sekil {

	private double en,boy;
	public Dortgen(double e,double b) {
		en=e; boy=b;
	}

	@Override
	public void ciz(int renk) {
		System.out.println("Dortgen ciz \t Renk kodu : "+renk);
	}

	@Override
	public double alanHesap() {
		return en*boy;
	}
}