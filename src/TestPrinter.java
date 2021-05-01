import java.util.ArrayList;

public class TestPrinter {
	public static void main(String[] args) {
		ArrayList<String> values = new ArrayList<>();
		values.add("java");
		values.add("unix");
		values.add("html");
		values.add("php");

		PrinterUtils.printList(values, new BracePrinter());
		PrinterUtils.printList(values, new UpperCasePrinter());
		PrinterUtils.printList(values, new SimplePrinter());

		PrinterUtils.printWith(new Printer[] { new SimplePrinter(), new UpperCasePrinter() }, "habchi");
		PrinterUtils.printWith(new Printer[] { new SimplePrinter(), new BracePrinter(), new UpperCasePrinter() },
				"habchi");

	}
}
