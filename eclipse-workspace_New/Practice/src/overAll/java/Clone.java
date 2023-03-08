package overAll.java;

public class Clone {
	int a=10;
}
class Main implements Cloneable{
	
public void main() throws CloneNotSupportedException{
	 super.clone();
	
	System.out.println("Clone Method run successfuly");

}
	public static void main(String[] args) {
		Main.main(args);

	}

}
