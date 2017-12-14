public class YuzdeCalisan extends Calisan {
	private int yuzde;
	public YuzdeCalisan(String a, String s, int i, int su,int cs,int y) {
		super(a,s,i,su,cs);
		yuzde=y;
	}
	public int Kazanc() {
		int fazla;
		if(ca_sa>20){
			fazla=ca_sa-20;
			return (fazla*yuzde)+(20*sa_uc);
		}else {
			return ca_sa*sa_uc;
		}
	}
}