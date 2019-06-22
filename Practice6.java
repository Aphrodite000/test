public class Practice6 {
	//二分查找
	public static int binarySearch(int[] array,int n) {
		int left=0;
		int right=array.length-1;
		while(left<=right) {
		int mild=left+(right-left)/2;
		if(array[mild]<n) {
			left=mild+1;
		}else if(array[mild]>n) {
			right=mild-1;
			}else if(array[mild]==n){
				return mild;
			}			
		}		
		return -1;//left>right 找不到时
	}
	public static void main (String[] args) {
		int[] array={2,3,4,5,6,7,8,9,10};
		int a;
		a=binarySearch(array,9);
		System.out.printf("%d",a);
	}
}
