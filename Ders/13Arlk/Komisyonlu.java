public class Komisyonlu extends Calisan1 {

	private double haftalik,komisyon;
	public Komisyonlu(String ad, String soyad, String tc,double satis,double yuzde) {
		super(ad, soyad, tc);
		setHaftalik(satis); setKomisyon(yuzde);
	}

	public double getHaftalik() {return haftalik;}

	public void setHaftalik(double haftalik) {
		if (haftalik>0.0)
			this.haftalik = haftalik;
		else {
			throw new IllegalArgumentException(" 0 < Haftalik Satis olmali.");
		}
	}

	public double getKomisyon() {return komisyon;}

	public void setKomisyon(double komisyon) {
		if(komisyon>0.0 && komisyon<1.0)
			this.komisyon = komisyon;
		else {
			throw new IllegalArgumentException(" 0 < Komisyon < 1 olmalý.");
		}
	}

	@Override
	public double kazanc() {
		return getKomisyon()*getHaftalik();
	}
	
	public String toString() {
		return String.format("Komisyonlu : %s \n %s:  %.2f ; %s: %2.f",super.toString(),"Haftalik Satis",getHaftalik(),"Komisyon Yuzdesi",getKomisyon());
	}
}