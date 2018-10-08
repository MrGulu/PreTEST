package test2;
import java.util.Arrays;
public class For {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = new int[10];
		Arrays.fill(a, 5);
		Arrays.fill(a,1,3,6);
		for(Integer s : a){
			prt(s);
		}
	}
static void prt(int s){
	System.out.println(s);
}
}
