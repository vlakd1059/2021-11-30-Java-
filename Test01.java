package 자바테스트;

import java.util.Scanner;

public class Test01 {
   public static void main(String[] args) {
      boolean isNum = true;
      Scanner sc = new Scanner(System.in);
      System.out.print("숫자 1입력 >> ");
      int num1 = sc.nextInt();
      System.out.print("숫자 2입력 >> ");
      int num2 = sc.nextInt();
//      int num3 = num1;
//      int i = 0;
//      int j = 0;
      int max = 0;
      int min = 0;
      int i = 2;
      for (; i <= num1 && i <= num2;) {
         if (num1 % i == 0 && num2 % i == 0)
            min = i;
         i++;

      }
      max = num1 * num2 / min; // 최소 공배수 구하는 식
      System.out.println("최소 공배수 : " + max);
      System.out.println("최대 공약수 : " + min);

   }
}