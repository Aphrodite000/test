//import java.util.Scanner
public class Practice3 {
		//求pi/4=1-1/3+1/5-1/7...
	public static double calcPi(int n) {
		double Pi=0;
		for(int i=0 ;i<n;i++) {
			int m=2*i+1;
			if (i%2==0) {
				Pi=Pi+1.0/m;
			}
			else {
				Pi=Pi-1.0/m;
			}
		}
		return Pi*4; 
	}
	public static void main (String[] args) {
		double b;
		//Scanner x=new Scanner(System.in);
		//System.out.printf("请输入一个整数");
		//int i=x.nextInt();
		b=calcPi(6000);
		System.out.println(b);
	}  
}