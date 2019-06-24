import java.util.Arrays;
public class Practice10 { 
    //seqList   顺序表  0525
	//顺序表中保存的数据类型是 int
    //属性
	private int[] array;
	private int size;
	//构造方法
	public Practice10() {
		//初始化部分
		//初始化array，给定一个默认大小
		//初始化size，size是数据个数，没有数据，所以size=0
		array=new int[11];
		//11可以调节（扩容）
		size=0;
	}
	//支持的方法
	//插入是从后往前遍历，删除是从前往后遍历
	//头插 O(n)
	public void pushFront(int element) {
		//数据下标遍历（size-1,0）（移动之前的）
		for(int i=size-1;i>=0;i--) {
			array[i+1]=array[i];
		}
		//空间下标遍历（size,1）
		//for(int i=size;i>0;i--) {
		//array[i]=array[i-1];  0可以换成index,index是插入的地方的下标	
		// }
		array[0]=element;
		size++;
	}
    //尾插
    public void pushBack(int element) {
	  array[size++]=element;//后置++在++之前会先存值，返回值也就是++之前的值，
    }
	//中间插入
    public void insert(int index,int element){ 
	//index的合法性（0，size-1）
	if(index<0||index>size-1) {
		System.out.println("index非法");
		return;
	}
	//i代表的是空见下标（移了之后的）
	for(int i=size-1;i>=index;i--){
		array[i+1]=array[i];
	}
	array[index]=element;
	size++;
    }
	//头删
    public void popFront() {
		if(size==0) {
			System.out.println("空顺序表，无法删除");
			return;
		}
	    for(int i=1;i<=size-1;i++) {
		array[i-1]=array[i];
	}
	size--;//array[--size]=0;
    }
	//尾删
	public void popBack() {
		if(size==0) {
			System.out.println("空顺序表，无法删除");
			return;
		}
		size--;
	}
	//正常删除
	public void erase(int index) {
		if(size==0) {
			System.out.println("空顺序表，无法删除");
			return;
		}
		for(int i=index;i<=size-1;i++){
			array[i]=array[i+1];
		}
		size--;
	}
	//查找
    public int indexOf(int element) {
		for(int i=0;i<=size-1;i++) {
			if(array[i]==element) {
				return i;
			}
		}
		return -1;
    }
	//根据下标，获取元素
	public int get(int index) {
        if(index<0||index>size-1) {
			System.out.println("下标错误");
			return -1;
		}	
		return array[index];
	}
	//给定下标，修改下标所在元素的值
	public void set(int index,int element) {
		if(index<0||index>=size) {
			System.out.println("下标错误");
			return;
		}
		array[index]=element;
	}
	//获得数据个数
	public int size(){
		return size;
	}
	//判断是否为空顺序表
	public boolean isEmpty(){
		return size==0;
	}
	//获得动态数组长度,当前容量
	public int capacity() {
		return array.length;
	}
	//便于打印，显示顺序表中已有元素
	public String toString() {
		return Arrays.toString(
			Arrays.copyOf(array, size)
		);
	}
	//在顺序表中查找该元素并且删除
	public void remove(int element) {
		int index=indexOf(element);
		if(index!=-1) {
			erase(index);
		}
	}
	//除掉这个元素，搬移数组
	public void removeAll(int element) {
		int j=0;
		for(int i=0;i<=size-1;i++) {
			if(array[i]!=element) {
				array[j++]=array[i];
			}
		}
		size=j;
	}
	//内部使用的方法，
	//无论是否需要扩容，调用完这个方法，容量一定够用
	private void ensureCapacity() {
		if(size<array.length) {
			//不需要扩容
			return;
		}
		//1.申请新房子
		int newCapacity=array.length+array.length/2;
		int[] newArray=new int[newCapacity];
		//2.搬家
		for(int i=0;i<array.length;i++) {
			newArray[i]=array[i];
		}
		//3.公布
		this.array=newArray;
		//4.退老房子，利用java的垃圾回收，自动回收原来的数组
	}
	public static void test1(String[] args) {
		Practice10 seqList = new Practice10();
		
		// []
		System.out.println(seqList.toString());
		// 尾插 1 2 3
		seqList.pushBack(1);
		seqList.pushBack(2);
		seqList.pushBack(3);
		// [ 1, 2, 3 ]
		System.out.println(seqList.toString());
		
		// 头插 10 20 30
		seqList.pushFront(10);
		seqList.pushFront(20);
		seqList.pushFront(30);
		// [ 30, 20, 10, 1, 2, 3 ]
		System.out.println(seqList.toString());
		
		seqList.insert(2, 100);
		seqList.insert(4, 200);
		// [ 30, 20, 100, 10, 200, 1, 2, 3 ]
		System.out.println(seqList.toString());
		System.out.printf("当前容量: %d%n", seqList.capacity());
		
		seqList.pushBack(1000);
		seqList.pushBack(2000);
		seqList.pushBack(3000);
		seqList.pushBack(4000);
		seqList.pushBack(5000);
		seqList.pushBack(6000);
		System.out.printf("当前容量: %d%n", seqList.capacity());

		seqList.popFront();
		seqList.popFront();
		seqList.popFront();
		seqList.popFront();
		// [ 200, 1, 2, 3 ]
		System.out.println(seqList.toString());
		
		seqList.popBack();
		seqList.popBack();
		seqList.popBack();
		// [ 200 ]
		System.out.println(seqList.toString());
	}
	
	public static void test2(String[] args) {
		Practice10 s = new Practice10();
		s.pushBack(1);
		s.pushBack(2);
		s.pushBack(3);
		s.pushBack(4);
		s.pushBack(1);
		s.pushBack(2);
		s.pushBack(3);
		s.pushBack(4);
		// [ 1, 2, 3, 4, 1, 2, 3, 4 ]
		System.out.println(s.toString());
		s.remove(2);
		// [ 1, 3, 4, 1, 2, 3, 4 ]
		System.out.println(s.toString());
		s.removeAll(4);
		// [ 1, 3, 1, 2, 3 ]
		System.out.println(s.toString());
	}
	
    public static void main(String[] args) {
		test1(args);
		test2(args);
    }
}