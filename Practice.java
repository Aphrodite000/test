import java.util.Scanner;
public class Practice {
	//n的阶乘
	public static int factorial(int n) {
		int i;
		int ret=1; 
		for(i=1;i<=n;i++) {
			ret=ret*i;
		}
		return ret;
	}
	public static void main (String[] args) {
		int a;
		Scanner x=new Scanner(System.in);
        System.out.print("请输入一个整数：");
        //读取一个int数值
        int i=x.nextInt();
		a=factorial(i);
	    System.out.printf("%d",a);
	}
}