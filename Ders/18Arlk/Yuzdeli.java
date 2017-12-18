public class Yuzdeli extends Maasli {
	private double satis, oran;
	public Yuzdeli(String n, int t, double m,double o,double s) {
		super(n, t, m);
		oran=o;	satis=s;
	}
	

	public double Hesap() {
		return getMaas()+(getOran()*getSatis());
	}

	public String toString() {
		return String.format("%s Maas %.2f", super.toString(),Hesap());
	}

	
	public double getSatis() {return satis;}
	
	public void setSatis(double satis) {this.satis = satis;}
	
	public double getOran() {return oran;}
	
	public void setOran(double oran) {this.oran = oran;}
}