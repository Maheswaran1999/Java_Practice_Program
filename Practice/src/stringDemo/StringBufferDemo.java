package stringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {

		System.out.println("************StringBuffer*******************");

		StringBuffer buffer = n	ew StringBuffer("Sachin");
		System.out.println(buffer);
		buffer.append("Tendulkar");
		System.out.println(buffer);

		System.out.println("************String*******************");

		String s = "Dhoni";
		System.out.println(s);
		s.concat("tendulkar");
		System.out.println(s);

	}

}
