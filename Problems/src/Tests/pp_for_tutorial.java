package Tests;

public class pp_for_tutorial {

	public static void main(String[] args) {
		for (int i = 0; i < 10; ++i) {
			System.out.print(i);
		}
		int b = 0;
		int c = 1;
		c = c + (b++);
		System.out.println(c);
		System.out.println(b);

		Test(10);
	}

	public static void Test(int n) {
		n++;
	}
}
