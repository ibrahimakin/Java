
public class Maasli1 extends Calisan3 {

	private double haftalik;
	public Maasli1(String a, String s, double h) {
		super(a, s);
		haftalik=h;
	}

	@Override
	public double odemeHesap() {				// interface Giderler metodu implement ettik.
		return getHaftalik();
	}
	
	public String toString() {					// java Object classından override.
		return "Maasli "+super.toString();
	}

	public double getHaftalik() {return haftalik;}

	public void setHaftalik(double haftalik) {this.haftalik = haftalik;}
}