import java.util.Random;
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// �������� �����ϱ�
		Scanner sc = new Scanner(System.in);
		Random random = new Random(); // ���۷����� ù ���� �빮��
		int result = 0;
		int answer = 0;
		int num1 = 0;
		int num2 = 0;
		int life = 3;
		System.out.println("PLUS GAME!!!");

		while (life > 0) {
			num1 = random.nextInt(5) + 1;
			num2 = random.nextInt(5) + 1;
			System.out.print(num1 + "+" + num2 + "=");
			answer = sc.nextInt();
			result = num1 + num2;
			if (answer == result) {
				System.out.println("�����Դϴ�!!!");
			}

			else {
				while (answer != result) {
					life--;
					System.out.println("�����Դϴ�...");
					System.out.println("���� ���: " + life);
					System.out.print(num1 + "+" + num2 + "=");
					answer = sc.nextInt();
					if (life == 0) {
						System.out.println("���̻� �����Ҽ� �����ϴ�.");
						break;
					}

					else if (answer == result) {
						if (life == 0) {
							System.out.println("�����Դϴ�!!");
						}
					}
				}
			}

		}
	}
}
