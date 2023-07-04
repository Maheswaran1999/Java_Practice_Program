package interfaceDemo;

interface Car {

	public void engine();
}

class BMW implements Car {
	public void engine() {
		System.out.println("engine start");
	}

}

class SimpleDemo {
	public static void main(String[] args) {
		BMW obj = new BMW();
		print(obj);
	}

	public static void print(BMW arg) {
		arg.engine();
	}
}
