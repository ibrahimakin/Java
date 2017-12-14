public class Araba {
	String Model;
	int Yil;
	Renk R;
	Marka M;
	
	public Araba(Renk r,Marka m,String model,int yil) {
		R=r; M=m; Model=model; Yil=yil;
	}
	public String toString() {
		return String.format("%s %s %s %d", R, M, Model, Yil);
	}
}