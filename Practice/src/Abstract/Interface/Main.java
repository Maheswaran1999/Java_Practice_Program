package Abstract.Interface;

import Abstract.Interface.FunInterface;
class Main extends AbstractFun implements FunInterface {

	public void fun() {
		System.out.println("fun");
	}

	public void interfacefun() {
		System.out.println("interface fun");
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.fun();
		obj.interfacefun();
	}
}