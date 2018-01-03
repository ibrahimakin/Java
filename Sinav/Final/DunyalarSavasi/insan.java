public abstract class insan {
	private int savunma;
	public insan(int s) {
		savunma=s;
	}
	
	public int GucHesapla() {
		return savunma;
	}
	
	public int getSavunma() {return savunma;}
	public void setSavunma(int savunma) {this.savunma = savunma;}
}