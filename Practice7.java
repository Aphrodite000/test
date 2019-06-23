import java.util.Arrays;
public class Practice7 {
	//冒泡排序   不需要返回值只是数组排序，所以用void
	public static void swap (int[] array,int i,int j) {
		int t= array[i];
		array[i]=array[j];
		array[j]=t;  //数组是引用数据类型，所以交换了，如果是基本数据类型
	}                //则只是给形参交换了，实参并没有变
	public static void  bubbleSort(int[] array) {//减治算法：一次处理一个数
		for(int i=0;i<array.length;i++) {
			boolean isSwapped=false;
			for(int j=0;j<array.length-i-1;j++){
				if(array[j]>array[j+1]) {  //大的往后靠
					swap(array,j,j+1);
					isSwapped=true;
				}
			}
			if(!isSwapped) {//如果一次交换都没有发生，就说明有序，直接退出
			return;
		    }//中途退出可以使用return，void只是没有返回值，不代表不能用return
		} 
	}
	public static void main (String[] args) {
		int[] array={5,2,8,9,1,4,3,6,7};
		bubbleSort(array);
		System.out.println(Arrays.toString(array));
	}
}