

public class Exam05 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		System.out.println("3�� ��� ��� >> ");
		for (num = 3; num < 100; num += 3) {
			System.out.print(num + " ");
			sum = sum + num;
		}
		System.out.println(" ");
		System.out.println("3�� ��� �� ��� >> "+sum);
	}
}
