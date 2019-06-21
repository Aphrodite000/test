public class Practice4 {
	public static String reverse(String s) {
		int length=s.length();
		String r="";
		for(int i=length-1;i>=0;i--) {
			char ch=s.charAt(i);
			r=r+ch;
		}
		return r;
	}
	public static void main(String[] args) {
		String e;
		e=reverse("abcd");
		System.out.printf("%s",e);
	}
}