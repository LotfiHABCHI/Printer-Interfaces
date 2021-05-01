
public class UpperCasePrinter implements Printer {
	@Override
	public void print(String str) {
		System.out.print(str.toUpperCase());
	}
}
