
public class AsgariCalisan extends Komisyonlu {

	private double asgari;
	public AsgariCalisan(String ad, String soyad, String tc, double satis, double yuzde,double ucret) {
		super(ad, soyad, tc, satis, yuzde);
		setAsgari(ucret);
	}
	
	public double getAsgari() {return asgari;}
	
	public void setAsgari(double asgari) {this.asgari = asgari;}
	
	public double kazanc() {
		return getAsgari()+super.kazanc();
	}
	public String toString() {
		return String.format("Asgari Ucret : %s \n %s:  %.2f ",super.toString(),"Asgari Ucret",getAsgari());
	}
}