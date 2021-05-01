import java.util.ArrayList;

public class PrinterUtils {
	public static void printList(ArrayList<String> strs, Printer printer) {
		for (String str : strs) {
			printer.print(str);
			System.out.println();
		}
	}
	
	public static void printWith(Printer[] printers, String str) {
		for(Printer printer : printers)
			printer.print(str + " ");
		System.out.println();
	}
}
