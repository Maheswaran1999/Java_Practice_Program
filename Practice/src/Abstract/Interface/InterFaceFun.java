package Abstract.Interface;

interface Mobile {
	
	abstract void charger();

	void headSet();
}

abstract class Speaker implements Mobile {
	public void charger() {
		System.out.println("charger working fine");
	}
}

public class InterFaceFun extends Speaker implements Mobile {

	public static void main(String[] args) {
		InterFaceFun obj = new InterFaceFun();
		obj.headSet();
		obj.charger();

	}

	@Override
	public void headSet() {
		System.out.println("headset");

	}
	
}
