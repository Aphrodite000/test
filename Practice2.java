import java.util.Scanner;
public class Practice2 {
	//用递归写阶乘
	public static int LogarithmE(int n) {
		int i;
		if(n==1||n==0){
			return 1;
	}else{
		return LogarithmE(n-1)*n;
	}
	}
	public static void main (String[] args) {
		int c;
		Scanner x=new Scanner(System.in);
		System.out.printf("请输入一个整数");
		int i=x.nextInt();
		c=LogarithmE(i);
		System.out.printf("%d",c);
	}
}