
public class GiderlerTest {

	public static void main(String[] args) {
		IGiderler[] gider=new IGiderler[4];
		gider[0]=new Faturalar("a45", 4, 2.25);
		gider[1]=new Faturalar("b23", 3, 5.50);
		gider[2]=new Maasli1("aaa","g-34", 100);
		gider[3]=new Maasli1("bbb","g-35", 200);

		System.out.println(" Giderleri Goster \n - - - ");
		for(IGiderler g:gider) {
			System.out.println(g.toString()+" - - - >"+g.odemeHesap());
		}
	}
}