import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Siralama {	
	public static void main(String[] args) {
		int input[]= {16,5,1,12,4,3};
		DiziGoster(input);
		bubble(input);		
		ArrayList<Integer> input2=new ArrayList<Integer>();
		input2.addAll(Arrays.asList(16,5,1,12,4,3));
		
		System.out.println("ArrayList");
		for(int i:input2) {
			System.out.print(i+" ");
		}
		
		Collections.sort(input2);
		
		System.out.println(" ");
		for(int i:input2) {
			System.out.print(i+" ");
		}
	}
	static int[] bubble(int dizi[]) {
		
		for(int i=0;i<dizi.length;i++) {
			System.out.println(i+1+". Hareket");
			
			for(int j=0;j<dizi.length-1-i;j++) {
				if(dizi[j]>dizi[j+1]) {
					int temp=dizi[j];
					dizi[j]=dizi[j+1];
					dizi[j+1]=temp;
				}
				DiziGoster(dizi);
			}
		}
		return dizi;
	}
	
	static void DiziGoster(int dizi[]) {
		System.out.print("[ ");
		for(int i=0;i<dizi.length;i++) {
			System.out.print(dizi[i]+" ");
		}
		System.out.println(" ]");
	}
}