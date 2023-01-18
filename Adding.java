package antra;

public class Adding {
	public static int minNo(int[] a) {
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
			if(min>a[i]) { min=a[i];}
		return min;
	}
	public static int maxNo(int[] a) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
			if(max<a[i]) { max=a[i];}
		return max;
	}
	public static void main(String[] args) {
		int[] a= {5,-4,0,6,2,4,-5,-3,8,9};
		int b=minNo(a);
		int c=maxNo(a);
		System.out.println(b+c);
		
	}
}
