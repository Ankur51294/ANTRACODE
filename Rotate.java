package antra;

public class Rotate
{
	
	public static void rotateArr(int[] a, int k) {
		int n=a.length;
		int i=0;
		int j=n-1;
		while(i<j) 
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;j--;
		}
		i=0;
		j=k-1;
		while(i<j) 
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;j--;
		}
		i=k;
		j=a.length-1;
		while(i<j) 
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;j--;
		}
		for (int p : a) {
			System.out.print(p+"  ");
		}
	}
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		rotateArr(a,2);
	}
}
