public abstract class Dogru implements Sekil {
									// Alan hesaplamay� kullanmamak icin abstract
	public Dogru() {}

	@Override
	public void ciz(int renk) {
		System.out.println("Dogru ciz \t Renk kodu : "+renk);
	}

//	@Override
//	public double alanHesap() {
//		return 0;
//	}
}