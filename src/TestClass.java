
public class TestClass {

	public static void main(String[] args) {
		String s = "abab";
		int len = s.length();
		int count = 0;
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		String srev = sb.toString();
		if(s.equals(srev)) {
			System.out.println(count);
		}
		else {
			for(int i=0,j=len-1;i<len/2;i++,j--) {
				if(s.charAt(i)!=s.charAt(j)) {
					count++;
					j++;
					len++;
				}
			}
			System.out.println(count);
		}
	}
}