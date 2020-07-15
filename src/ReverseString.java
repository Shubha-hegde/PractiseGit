import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		String in = str.toLowerCase();
		char[] ch = in.toCharArray();
		// String[] s1 = in.split(" ");

		String rev = " ";
		int n = ch.length;

		for (int i = n - 1; i >= 0; i--) {
			rev = rev + ch[i];

		}
		System.out.println(rev);

	}
}
