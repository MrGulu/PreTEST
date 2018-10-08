package test2;

import java.util.Arrays;

public class quicksortttt {
	public static void main(String[] args) {
		int[] a = new int[10];
		Arrays.fill(a, 10);
		int n = 9;
		for(int i = 1;i<a.length;i++){
			a[i] = n;
			n--;
		}
		for(int i : a){
			prt(i);
		}
		int first = 0;
		int end = a.length-1;
		quicksortttt q = new quicksortttt();
		q.sort(a, first, end);
		prtString("later sort:");
		for(int i : a){
			prt(i);
		}
	}
	static void prt(int s){
		System.out.println(s);
	}
	static void prtString(String s){
		System.out.println(s);
	}
	public int partition(int[] a,int first,int end){
		int temp;
		while(first<end){
			while(first<end && a[first]<=a[end]){
				end--;
			}
			if(first<end){
				temp = a[first];
				a[first] = a[end];
				a[end] = temp;
			}
			while(first<end && a[first]<=a[end]){  //此处要写a[first]<=a[end]不是a[first]<a[end]
				first++;
			}
			if(first<end){                         //此处要写first<end不是first<=end
				temp = a[first];
				a[first] = a[end];
				a[end] = temp;
			}
		}
		int pivod = first;
		return pivod;
	}
	public void sort(int[] a,int first,int end){
		if(first<end){
			int pivod = partition(a,first,end);
			sort(a,first,pivod-1);
			sort(a,pivod+1,end);
		}
	}
}
