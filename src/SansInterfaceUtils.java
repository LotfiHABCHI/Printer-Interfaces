import java.util.ArrayList;

public class SansInterfaceUtils {
	public static void upperCasePrint(ArrayList<String> strs) {
//		for (int pos=0; pos<strs.size(); pos++) {
//			System.out.println(strs.get(pos).toUpperCase());
//		}
		
		for (String str : strs)
			System.out.println(str.toUpperCase());
	}
	
	public static void simplePrint(ArrayList<String> strs) {
		for (String str : strs)
			System.out.println(str);
	}

	public static void bracePrint(ArrayList<String> strs) {
		
		for (String str : strs)
			System.out.println("{" + str + "}");
	}
	
	public static void simplePrintAndUpperCasePrint(String str) {
		System.out.print(str + " ");
		System.out.print(str.toUpperCase() + " ");
		System.out.println();
	}
	
	public static void SimplePrintAndBracePrintAndUpperCasePrint(String str) {
		System.out.print(str + " ");
		System.out.print("{" + str + "}" + " ");
		System.out.print(str.toUpperCase() + " ");
		System.out.println();
	}
}
