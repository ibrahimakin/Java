import java.util.ArrayList;
import java.util.Arrays;

public class ArraySilme {
	
	public static void mtd(ArrayList<Integer> list){
	
		if(list.size()%2!=0) {
				list.remove(list.size()-1);
		}
			
		for(int i=0;i<list.size();i+=2) {
			if (list.get(i)>list.get(i+1)) {
				list.remove(i);
				list.remove(i);
				i-=2;
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.addAll(Arrays.asList(3,7,2,5,5,8,5,6,3,4,7,3,1));
		
//		for(int i=0;i<list.size();i++) {
//			System.out.print(list.get(i)+" ");
//		}
//		
//		System.out.println(" ");
		
		for(int i:list) {
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		
		mtd(list);
		
		for(int i:list) {
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
	}
}
