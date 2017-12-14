
public abstract class Calisan1 {
	private String isim,soyisim,tcno;
	public Calisan1(String ad,String soyad,String tc) {
		isim=ad; soyisim=soyad; tcno=tc;
	}
	
	public String getIsim() {return isim;}
	
	public void setIsim(String isim) {this.isim = isim;}
	
	public String getSoyisim() {return soyisim;}
	
	public void setSoyisim(String soyisim) {this.soyisim = soyisim;}
	
	public String getTcno() {return tcno;}
	
	public void setTcno(String tcno) {this.tcno = tcno;}
	
	public String toString() {
		return String.format("%s %s \n %s : %s",getIsim(),getSoyisim(),"TC",tcno);
	}
	public abstract double kazanc();
}