public class Main{
	//判断这个数字有几位
	public static void numNumber(int n) {
		int i;
		int count=0;
		for(i=n;i>0;i/=10) {
			count++;
		}
		System.out.printf("%d",count);
	}
	//n的阶乘
	public static void factorial(int n) {
		int i;
		int ret=1;
		for(i=1;i<=n;i++) {
			ret=ret*i;
		}
		System.out.printf ("%d",ret);
	}
	//用递归写阶乘
	public static int LogarithmE(int n) {
		  if(n==0||n==1) {
			  return 1;
		  }
		  else {
			  return LogarithmE(n-1)*n;
		  }
		  
	}
	//求pi/4=1-1/3+1/5-1/7
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
	//反转字符串
	public static String reverse(String s) {
		int length=s.length();   //s.length()=c中的length(s)
		String r=" "; //String 本身就是一个字符数组
		for(int i=length-1;i<=length;i--) {
			char ch =s.charAt(i);  //字符串S的第i个位置
			r=r+ch;
		}
		return r;
	}
	//十进制数转换十六进制数
	public static String decToHex(int dec) {
		String hex ="";  //定义空的字符串来放置16进制数
		while(dec>=16) {
			int remainder=dec%16;
			dec=dec/16;
			if(remainder<10){
				hex+=remainder;
			}
			else {
				char ch = (char)('A'+(remainder-10)); //A+1相当于B
				hex+=ch;
			}
		}
		if(dec!=0) {       //在0到16之间的数直接写入
			hex+=dec;
		}
		return reverse(hex);
	}
	public static void main(String[] args) {
		int m;
		double n;
		String r;
		String h;
		numNumber(7896);
		System.out.printf("\n");
		factorial(6);
		System.out.printf("\n");
		m=LogarithmE(6);
		System.out.printf("%d",m);
		n=calcPi(5);
		System.out.printf("%d",n);
		r=reverse("abcd");
		System.out.printf("%d",r);
		h=decToHex(156);
		System.out.printf("%d",h);
	}
}