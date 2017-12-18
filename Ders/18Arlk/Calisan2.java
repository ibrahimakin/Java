public interface INTER {public double Hesap(); }
public abstract class Calisan2 implements INTER {

	private String name;
	private int TcNo;
	
	public Calisan2(String n, int t) {
		name=n;	TcNo=t;
	}
	
	public String toString() {
		return String.format("%s Tc %d",getName(),getTcNo());
	}

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public int getTcNo() {return TcNo;}

	public void setTcNo(int tcNo) {TcNo = tcNo;}
}