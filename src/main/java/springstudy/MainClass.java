package springstudy;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		B b = new B();
		
		C c = new C();
		
		c.maker(a);
		c.maker(b);
	}

}
