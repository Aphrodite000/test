class ListNode {
	public  int value;
	public  ListNode next;
	public ListNode(int val) {
		this.value=val;
	}
	//没有构造函数对象就不能实例化
}
public class Practice13 {
	//打印链表
	public static void displayLinkedList(ListNode head) {
		for(ListNode cur=head;cur!=null;cur=cur.next) { 
		//遍历了所有的元素，且cur最后指向了null
			System.out.printf("(%d)-->",cur.value);
		}//while(cur!=nul){cur=cur.next;}
		System.out.println("null");
	}
	//创建链表
	public static ListNode createdLinkedList() {
		ListNode n1=new ListNode(1); 
		//类后加变量名，变量是类的复制版，有类中的性质
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		//ListNode n5=new ListNode(5);有构造函数且实例化了
		//ListNode n5=new ListNode();这是没有构造函数的时候，也就没有实例化了，系统会给一个默认
		//的无参的构造函数，只是构造了对象，并没有实例化
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		return n1;
	}
	//在链表中删除指定元素
	public  static ListNode removeElement(ListNode head,int val) {
		if(head==null) {
			return null;
		}
		ListNode cur=head.next;
		ListNode prev=head;
		while(cur!=null) {
			if(cur.value==val){
				prev.next=cur.next;
			}else{
				prev=cur;
			}
			cur=cur.next;
		}
		if(head.value==val) {   
		//最后在处理第一个元素
			head=head.next;
		}
		return head;
	} 
	public static void main (String[] args) {
		ListNode head=createdLinkedList();
		displayLinkedList(head);
		head=removeElement(head,4);
		displayLinkedList(head);
	}
}