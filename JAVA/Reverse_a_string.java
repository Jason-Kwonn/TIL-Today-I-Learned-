import java.util.Scanner;
public class Reverse_a_string {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		//your code goes here
		int l = arr.length;
		for (int i = l-1; i >= 0; i--)
		System.out.println(arr[i]);

        scanner.close();
	}
}
