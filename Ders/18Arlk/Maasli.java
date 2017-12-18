public class Maasli extends Calisan2 {
	private double maas;
	
	public Maasli(String n,int t,double m) {
		super(n,t);
		maas=m;
	}
	
	public double Hesap() {
		return getMaas();
	}
	
	public String toString() {
		return String.format("%s Maas %.2f", super.toString(),Hesap());
	}
	
	public double getMaas() {return maas;}
	
	public void setMaas(double maas) {this.maas = maas;}
}