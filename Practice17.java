//复杂链表的复制
class Node {
	int value;
	Node next;
	Node random;//指向链表中的任意一个结点
	public Node(int value) {
		this.value=value;
	}
}
public class Practice17 {
	//打印链表
	public static void displayLinkedList(Node head) {
		for(Node cur=head;cur!=null;cur=cur.next) {
			System.out.printf("(%d)-->",cur.value);
		}
		System.out.println("null");
	}
	//创建链表
	public static Node createdLinkedList() {
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(3);
		Node n4=new Node(4);
		Node n5=new Node(5);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		return n1;
	} 
	public static Node copyRandomList(Node head) {
		Node cur=head;
		//复制每个新结点
		while(cur!=null) {
			Node node=new Node(cur.value);
		//新结点插入到对应旧结点之后
		node.next=cur.next;
		cur.next=node;
		//让新结点指向下一个老的结点 1(cur) 1(node) 2 2 3 3
		cur=cur.next.next;
		//cur=node.next;
		}
		//新结点之间建立random
		cur=head;
		while(cur!=null) {
			if(cur.random!=null) {
				cur.next.random=cur.random.next;
			}else{
				cur.next.random=null;
			}
			cur=cur.next.next;
		}
		// 3. 把 head 代表的链表拆分新的和老的
		cur = head;
		Node newHead = head.next;
		while (cur != null) {
			// 拆分链表，要改变两个 next 的指向
			Node node = cur.next;
			cur.next = node.next;
			if (node.next != null) {
				node.next = node.next.next;
			}
			// 让 cur 指向老的下一个结点
			cur = cur.next;
		}
		return newHead;
	}
	public static void main(String[] args) {
		Node head=createdLinkedList();
		displayLinkedList(head);
		Node newhead=copyRandomList(head);
		displayLinkedList(newhead);
	}
}