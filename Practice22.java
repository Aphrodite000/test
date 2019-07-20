/*
父子类的静态东西
父类的构造代码块
父类的构造方法（要根据对象用的子类的哪个构造方法去找对应的构造方法，
找到后执行父类构造方法，这时子类的构造方法没有进行完先不管，然后是
子类的构造代码块，执行完所有的代码块之后回到刚才的构造方法）

*/
class Base {
	{
		System.out.printf("父类构造代码块1");
	}
	Base(int n){
		System.out.printf("Base的构造方法");
	}
	Base(){
		System.out.printf("Base的构造方法2");
	}
	
}
class Derived extends Base{
	{
		System.out.printf("子类构造代码块1");
	}
	Derived(){
	   this(18);
	   System.out.printf("无参构造函数");
	}
	Derived(int n) {
		//super(12);
		System.out.printf("有参构造函数");
	}
}
public class Practice22 {
	public static void main (String[] args){
		new Derived(14);
	}
}