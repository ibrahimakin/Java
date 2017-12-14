
public class SaatliCalisan extends Calisan1 {
	
	private double ucret,saat;
	
	public SaatliCalisan(String ad, String soyad, String tc,double ucret,double saat) {
		super(ad, soyad, tc);
		setUcret(ucret); setSaat(saat);
	}
	public double getUcret() {return ucret;}

	public void setUcret(double ucret) {this.ucret = ucret;}

	public double getSaat() {return saat;}

	public void setSaat(double saat) {
		if ((saat>=0.0)&&(saat<=0.0))
			this.saat = saat;
		else {
			throw new IllegalArgumentException("0 < Calisma Saati < 168  olmalı.");
		}
	}

	@Override
	public double kazanc() {
		if (getSaat()<=40) {
			return getSaat()*getUcret();
		}
		else {
			return 40*getUcret()+(getSaat()-40)*getUcret()*1.5;
		}
	}
	public String toString() {
		return String.format("Saatlik Calisan : %s \n %s:  %.2f ; %s: %2.f",super.toString(),"Saatlik Ucret",getUcret(),"Calisma Saati",getSaat());
	}
}
