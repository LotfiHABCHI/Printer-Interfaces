
public class BracePrinter implements Printer {
	@Override
	public void print(String str) {
		System.out.print("{" + str + "}");
	}
}
