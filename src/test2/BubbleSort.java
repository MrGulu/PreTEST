package test2;

public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {1,54,73,4,24,46,32,6,23,6};
		for(int i : a){
			prt(i);
		}
		System.out.println();
		BubbleSort b = new BubbleSort();
		b.sort(a);
		for(int i : a){
			prt(i);
		}
	}
private void sort(int []a){
	int i,j,tem;
	for(i = 0;i<a.length;i++){
		for(j = 0;j<a.length-i-1;j++){
			if(a[j]>a[j+1])
			{
				tem = a[j];
				a[j] = a[j+1];
				a[j+1] = tem;
			}
		}
	}
}
static void prt(int a){
	System.out.println(a);
}
}
