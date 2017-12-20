public class Faturalar implements IGiderler {

	private String faturaNo;
	private int miktar;
	private double parcaFiyat;
	public Faturalar(String f, int m,double p) {
		faturaNo=f;  parcaFiyat=p; 
		setMiktar(m);
	}

	@Override
	public double odemeHesap() {				// Interface metodu implement ettik.
		return getParcaFiyat()*getMiktar();
	}
	public String toString() {					// java Object classýndan override.
		return "Fatura \t       : "+getFaturaNo()+" - "+getMiktar()+" - "+getParcaFiyat();
	}
	
	public String getFaturaNo() {return faturaNo;}

	public void setFaturaNo(String faturaNo) {this.faturaNo = faturaNo;}

	public int getMiktar() {return miktar;}

	public void setMiktar(int miktar) {
		if(miktar>0) {
			this.miktar = miktar;
		}else {
			System.out.println("Miktar > 0 olmalý");
		}
	}

	public double getParcaFiyat() {return parcaFiyat;}

	public void setParcaFiyat(double parcaFiyat) {this.parcaFiyat = parcaFiyat;}
}