import java.util.Random;
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 랜덤숫자 추출하기
		Scanner sc = new Scanner(System.in);
		Random random = new Random(); // 래퍼런스형 첫 글자 대문자
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
				System.out.println("정답입니다!!!");
			}

			else {
				while (answer != result) {
					life--;
					System.out.println("오답입니다...");
					System.out.println("남은 목숨: " + life);
					System.out.print(num1 + "+" + num2 + "=");
					answer = sc.nextInt();
					if (life == 0) {
						System.out.println("더이상 도전할수 없습니다.");
						break;
					}

					else if (answer == result) {
						if (life == 0) {
							System.out.println("정답입니다!!");
						}
					}
				}
			}

		}
	}
}
