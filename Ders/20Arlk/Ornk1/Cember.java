public class Cember implements Sekil {
	double yaricap;
	public Cember(int r) {
		yaricap=r;
	}

	@Override
	public void ciz(int renk) {				// implement ettik.
		System.out.println("Cember ciz \t Renk kodu : "+renk);
	}

	@Override
	public double alanHesap() {
		return Math.PI*yaricap*yaricap;
	}
}