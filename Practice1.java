import java.util.Scanner;
public class Practice1 {
	//输出数字共有几位
	public static int numNumber (int n){
		int i;
		int count=0;
		for(i=n;i>0;i/=10) {
			count++;
		}
		return count;
	}
	public static void main (String[] args) {
		int b;
		Scanner x=new Scanner(System.in);
		System.out.printf("请输入一个整数");
		int i=x.nextInt();
		b=numNumber(i);
		System.out.printf("%d",b);
	}
}