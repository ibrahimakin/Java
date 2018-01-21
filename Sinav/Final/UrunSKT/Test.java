import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,y;
		Zaman z;
		Urun u[]=new Urun[10];
		
		for (int i=0; i < 10; i++) {
			System.out.println("Son Kullanma Tarihi Ay  ");
			a=input.nextInt();
			if(a>12 || 0>a) {
				System.out.println("Hatalý Tarih. ");
				break;
			}
			System.out.println("Son Kullanma Tarihi Yil ");
			y=input.nextInt();
			z=new Zaman(a,y);
			u[i]=new Urun("Urun"+(i+1),"UrunTipi"+(i+1),z);
		}
		Yazdir(u);
		Sirala(u);
		Yazdir(u);
	}
	public static void Sirala(Urun u[]) {
		int i,j,min,s=u.length;
		Urun temp=new Urun();
		for (i = 0;  i< s; i++) {
			min=i;
			for (j = i+1; j < s; j++) {
				if(u[j].getSkt().getYil()==u[min].getSkt().getYil()) {
					if(u[j].getSkt().getAy()<u[min].getSkt().getAy()) {
						min=j;
					}else {
						min=i;
					}
				}if (u[j].getSkt().getYil()<u[min].getSkt().getYil()) {
					min=j;
				}
			}
			temp=u[j];
			u[j]=u[i];
			u[i]=temp;
		}
		//return u;
	}
	public static void Yazdir(Urun u[]) {
		for (int i = 0; i < u.length; i++) {
			System.out.println(u[i]);
		}
	}
}