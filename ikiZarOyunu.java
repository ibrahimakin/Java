import java.util.Random;

public class ikiZarOyunu {

	public static void main(String[] args) {
		int sayac=1,a=0,b,puan=0;
		while(sayac!=0){
			if (sayac==1){
				a=zarAt();
				if (a==7 || a==11){
					System.out.println(sayac+".denemede iki zar toplamý "+a+" Kazandýn.");
					break;}
				
				else if(a==2 || a==3 || a==12) {
					System.out.println(sayac+".denemede iki zar toplamý "+a+" Kaybettin.");
					break;}
				
				else {
					puan=a;
				}
			}
			System.out.println("Puan "+puan);
			sayac++;
			b=zarAt();
			System.out.println(sayac+".denemede zar toplamý "+b);
			if(b==puan) {
				System.out.println(sayac+". denemede iki zar toplamý "+b+" Kazandýn.");
				break;
			}if(b==7) {
				System.out.println(sayac+". denemede iki zar toplamý "+b+" Kaybettin.");
				break;
			}
		}
	}
	static int zarAt() {
		Random zar=new Random();
		int x,y;
		x=1+zar.nextInt(6);
		y=1+zar.nextInt(6);
		return x+y;
	}
}