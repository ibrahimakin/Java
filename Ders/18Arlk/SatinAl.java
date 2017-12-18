public class SatinAl implements INTER {
	private String urun_adi;
	private double fiyat,miktar;
	public SatinAl(String u,double f,double m) {
		urun_adi=u; fiyat=f; miktar=m;
	}

	@Override
	public double Hesap() {
		return getFiyat()*getMiktar();
	}

	public String toString() {
		return String.format("%s Fiyat %.2f",getUrun_adi(),Hesap());
	}

	public String getUrun_adi() {return urun_adi;}

	public void setUrun_adi(String urun_adi) {this.urun_adi = urun_adi;}

	public double getFiyat() {return fiyat;}

	public void setFiyat(double fiyat) {this.fiyat = fiyat;}

	public double getMiktar() {return miktar;}

	public void setMiktar(double miktar) {this.miktar = miktar;}
}