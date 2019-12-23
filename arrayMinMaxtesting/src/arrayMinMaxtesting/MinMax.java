package arrayMinMaxtesting;

public class MinMax {
   
	public int Max(int num) {
		int[] a= {4,8,6,2};
		
		for(int i=1;i<a.length;i++) {
		if(num<a[i]) {
				num=a[i];
	
		
	}
		
		}
       return num;
	}
	public int Min(int num) {
		int[] a= {4,8,6,2};
		
		for(int i=1;i<a.length;i++) {
		if(num>a[i]) {
				num=a[i];
	
		
	}
		
		}
       return num;
	}
	public static void main(String[] args) {
		
//		MinMax b =new MinMax();
//		System.out.println("max num is "+b.Max(9));
	}
	
	}