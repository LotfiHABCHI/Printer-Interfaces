import java.util.ArrayList;

public class TestSansInterface {

	public static void main(String[] args) {
		ArrayList<String> values = new ArrayList<>();
		values.add("java");
		values.add("unix");
		values.add("html");
		values.add("php");

		SansInterfaceUtils.bracePrint(values);
		SansInterfaceUtils.upperCasePrint(values);
		SansInterfaceUtils.simplePrint(values);
		SansInterfaceUtils.simplePrintAndUpperCasePrint("habchi");
		SansInterfaceUtils.SimplePrintAndBracePrintAndUpperCasePrint("habchi");
	}
}
