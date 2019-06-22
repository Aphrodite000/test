public class Practice5 {
	//求数组的最大值
	public static int max (int[] array) {
		for(int i=1;i<=4;i++) {
			if(array[0]<array[i]){
				array[0]=array[i];
			}
		}
		return array[0];
	}
	public static int index (int[] array,int n) {
		for(int i=0;i<5;i++) {
			if(array[i]==5) {
				return i;
			}
		}
		return -1;
	}
	//求平均分，去掉最高和最低分
	public static double average(int[] array) {
		int t;
	    for(int i=0;i<5;i++) {
			if(array[0]<array[i]) {   //求最大,array[0]是最大
				t=array[i];
				array[0]=t;
				array[i]=array[0];
			}
		}
		for(int i=1;i<5;i++) {
			if(array[4]>array[i]) {
				t=array[i];          //求最小，array[4]是最小
				array[4]=t;
				array[i]=array[4];
			}
		}
		t=(array[1]+array[2]+array[3])/3;
		return t;  //方法二：用和减去最大值最小值除3；
	}
	public static void main (String[] args){
		int a;
		int[] array={6,7,4,9,5};
		a=max(array);
		System.out.printf("%d%n",a);
		int b;
		b=index(array,5);
		System.out.printf("5的下标是%d%n",b);
	    double c;
		c=average(array);
		System.out.printf("average是%4f%n",c);
	}
}