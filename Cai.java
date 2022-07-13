import java.security.SecureRandom;
import java.util.Scanner;

public class Cai {

  public static void main(String[] args) {
    SecureRandom ranNum = new SecureRandom();
    Scanner in = new Scanner(System.in);

    int num1 = ranNum.nextInt(10), num2 = ranNum.nextInt(2);
    int result = num1 * num2;
    int ans = 0;
    do {
      System.out.println("How much is " + num1 + " times " + num2);
      ans = in.nextInt();
      if (result == ans) {
        System.out.println("Good work");
        break;
      } else {
        continue;
      }
    } while (result != ans);
  }
}
 