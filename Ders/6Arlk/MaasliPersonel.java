public class MaasliPersonel extends Personel {
	private double tabanMaas;
	
	public MaasliPersonel(String a, String soy, String ssk, double s, double k,double tm) {
		super(a, soy, ssk, s, k);
		tabanMaas=tm;
	}
	
	double maas() {
		return tabanMaas+super.maas();
	}
	public String toString() {
		return super.toString()+" "+tabanMaas;
	}
	
	public double getTabanMaas() {return tabanMaas;}
	public void setTabanMaas(double tabanMaas) {this.tabanMaas = tabanMaas;}
}