package advance2;

public class strnsb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=new String("punya");
		s.concat("lakshmi");
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer("punya");
		sb.append("lakshmi");
		System.out.println(sb);
		
		String st="punya";
		String s1=new String(st);
		String s2=new String(st);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

	}

}
