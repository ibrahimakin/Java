import javax.swing.JOptionPane;

public class Personel {
	
	private String ad,soyad,sskNo;
	protected double satis,komisyon;
	
	public Personel(String a,String soy,String ssk,double s,double k) {
		ad=a; soyad=soy; sskNo=ssk; satis=s; komisyon=k;
	}
	
	double maas() {
		return satis*komisyon;
	}
	public String toString() {
		return String.format("Personel \t %s %s %s %.2f %.2f",ad,soyad,sskNo,satis,komisyon);
	}
	
	
	public String getAd() {return ad;}

	public void setAd(String ad) {this.ad = ad;}
	
	public String getSoyad() {return soyad;}
	
	public void setSoyad(String soyad) {this.soyad = soyad;}
	
	public String getSskNo() {return sskNo;}
	
	public void setSskNo(String sskNo) {this.sskNo = sskNo;}
	
	public double getSatis() {return satis;}
	
	public void setSatis(double satis) {
		if (satis>0)
			this.satis = satis;
		else {
			JOptionPane.showMessageDialog(null,"Satýþ > 0 olmalý.");
		}
	}
	
	public double getKomisyon() {return komisyon;}
	
	public void setKomisyon(double komisyon) {
		if(komisyon>0 && komisyon<1)
			this.komisyon = komisyon;
		else {
			JOptionPane.showMessageDialog(null, "0 < Komisyon < 1");
		}
	}
}