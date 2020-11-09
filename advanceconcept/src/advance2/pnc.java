package advance2;

class parent{
	public void parent()
	{
		System.out.println("punyavathi");
	}
	
}
class child extends parent{
	public void child()
	{
		System.out.println("lakshmi");
	}
}
public class pnc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
child p=new child();
p.child();
parent p1=new child();
p1.parent();
	}

}
