import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// while문을 활용해 1~100 까지 숫자중 3의 배수만 출력하시오.
		System.out.println("1~100 중 3의 배수 출력 >> ");
		int num1=1;
		while (num1<=100) {
			if(num1%3==0) {
				System.out.println(num1);
				num1++;
			}
			else {
				num1++;
			}
		}
	}
}

