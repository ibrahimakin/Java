// 3*x1-0.1*x2-0.2*x3 = 7.85
// 0.1*x1+7*x2-0.3*x3 = -19.3
// 0.3*x1-0.2*x2+10*x3 = 71.4

// x1 = (7.85 +0.1*x2 + 0.2*x3)/3
// x2 = (-19.3 - 0.1*x1 + 0.3*x3)/7
// x3 = (71.4 - 0.3*x1 + 0.2*x2)/10

public class Gauss_Siedel {
	public static void main(String[] args) {
		double x1=0, x2=0, x3=0;
		for (int i = 0; i < 20; i++) {
			x1=(7.85+0.1*x2-0.2*x3)/3;
			x2=(-19.3-0.1*x1+0.3*x3)/7;
			x3=(71.4-0.3*x1+02*x2)/10;
		}
		System.out.println(x1+" "+x2+" "+x3);
	}
}