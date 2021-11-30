import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		// while 사용 1~10까지 출력
		//Scanner sc = new Scanner(System.in);
		System.out.println("0~10 까지 숫자 입력 : ");
		int console = 0;
		while(console<10) {
			console++;
			System.out.println(console);
		}
	}
}
