class Group {
	//属性
	String name;//名称
	int num;    //人数
	//方法
	//构造方法
	Group(String n,int m) {
		name=n;
		num=m;
	}
	void print(String welcome) {
		System.out.printf("%s %s的%d位同学们%n",welcome,name,num);
	} //welcome：形参；  name：属性； num :属性；
}
class B {
	int sum;
	B(int a,int b,int c) {
		System.out.println(a+b+c);
		sum=a+b+c;
	}
	void print() {
		System.out.println(sum);
	}
	
}
//一个文件中只能有一个类用public，且类为文件名同名
	public class Practice8 {
		public static void main(String[] args) {
			Group group=new Group("java10班",50); //对象名是group
			group.print("欢迎来到比特");
			B b=new B(1,2,3);  //对象名为b
			b.print(); //又打印一遍
		}
	}