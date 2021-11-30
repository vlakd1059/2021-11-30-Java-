package 자바테스트;

public class Test02 {

	public static void main(String[] args) {
		int a = 0;
		int b = 78;
		int sum=0;
		while (a < 77) {
			a++;
			b--;
			sum+=a*b;
		}
		System.out.println(sum);
	}
}



//0+1*77
//0+1*77+2*76
//3*75