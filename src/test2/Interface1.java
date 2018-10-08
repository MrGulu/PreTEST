package test2;

public class Interface1 implements InterfaceTest{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 test = new Interface1();
		test.print();
		test.success();
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		prt("ok!");
	}

	@Override
	public void success() {
		// TODO Auto-generated method stub
		prt("success!");
	}
static void prt(String s){
	System.out.println(s);
}
}
