import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int x = fs.nextInt();
			System.out.println(x * 10);
		}
		fs.close();
	}
}
