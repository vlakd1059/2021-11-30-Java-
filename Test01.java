package 자바테스트;

public class Test01 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int result=0;

		while (num1 <= 100 && num2 <= 100) {
			if (num1 % 2 == 1 && num2 % 2 == 0) {

				System.out.print(num1 + " " + "-" + num2 + " ");
				num1++;
				num2++;
				result = result + num1-num2;
			} else {
				num1++;
				num2++;
			}
		}
		System.out.println(" ");
		System.out.println("결과 : "+result);

	}
}
