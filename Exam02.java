import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// while���� Ȱ���� 1~100 ���� ������ 3�� ����� ����Ͻÿ�.
		System.out.println("1~100 �� 3�� ��� ��� >> ");
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

