package test2;

public class quicktest {
static void sort(int []r,int first,int end){
	if(first<end){
		int pivod = partition(r,first,end);
		sort(r,first,pivod-1);
		sort(r,pivod+1,end);
	}
}
static int partition(int []r,int first,int end){
	int i,j,tem1,tem2;
	i = first;
	j = end;
	while(i<j){
		while(i<j && r[i]<=r[j])
			j--;
		if(i<j){
			tem1 = r[i];
			r[i] = r[j];
			r[j] = tem1;
		}
		while(i<j && r[i]<=r[j])
			i++;
		if(i<j){
			tem2 = r[i];
			r[i] = r[j];
			r[j] = tem2;
		}
	}
	return i;
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	int r[]={1,50,24,13,95,24,15,36,22,7};
	int first=0;
	int end=r.length-1;
	int i;
	for(i=0;i<r.length;i++)
		System.out.println("before:"+r[i]);
	sort(r,first,end);
	for(i=0;i<r.length;i++)
		System.out.println("later:"+r[i]);
	return;
}
}
