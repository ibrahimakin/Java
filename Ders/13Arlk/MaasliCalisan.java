
public class MaasliCalisan extends Calisan1 {

	private double haftalik;
	public MaasliCalisan(String ad, String soyad, String tc,double maas) {
		super(ad, soyad, tc);
		setHaftalik(maas);	
	}
	
	public double getHaftalik() {return haftalik;}

	public void setHaftalik(double haftalik) {
		this.haftalik = haftalik<0.0 ? 0.0:haftalik;
	}

	@Override
	public double kazanc() {
		return getHaftalik();
	}
	public String toString() {
		return String.format("Maasli Calisan : %s \n  Haftalik %.2f ",super.toString(),getHaftalik());
	}
}
