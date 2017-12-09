import java.util.Random;
public class Zarİstatistik {

	public static void main(String[] args) {
		Random rand=new Random();
		int f1=0,f2=0,f3=0,f4=0,f5=0,f6=0;
		int x=0;
		for(int i=0;i<20;i++) {
			x=rand.nextInt(6)+1;
			//System.out.println(x);
			switch(x) {
				case 1:f1++;
					break;
				case 2:f2++;
					break;
				case 3:f3++;
					break;
				case 4:f4++;
					break;
				case 5:f5++;
					break;
				case 6:f6++;
					break;
			}
		}
		System.out.println("1 : "+f1+" kez.");
		System.out.println("2 : "+f2+" kez.");
		System.out.println("3 : "+f3+" kez.");
		System.out.println("4 : "+f4+" kez.");
		System.out.println("5 : "+f5+" kez.");
		System.out.println("6 : "+f6+" kez.");
	}
}