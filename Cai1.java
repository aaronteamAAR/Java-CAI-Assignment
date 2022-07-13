import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Cai1 {

  public static void main(String[] args) {
    SecureRandom ranNum = new SecureRandom();
    Scanner in = new Scanner(System.in);
    Random ran = new Random();

    for (int i = 1; i <= 10; i++) {
      int num1 = ranNum.nextInt(10), num2 = ranNum.nextInt(10);
      int result = num1 * num2;
      int ans = 0;
      do {
        int limit = 4;
        int genran = ran.nextInt(limit);
        System.out.println("How much is " + num1 + " times " + num2 + " ?");
        ans = in.nextInt();
        if (result == ans) {
          switch (genran) {
            case 1:
              System.out.println("Very good!");
              break;
            case 2:
              System.out.println("Excellent!");
              break;
            case 3:
              System.out.println("Nice work!");
              break;
            case 4:
              System.out.println("Keep up the good work!");
              break;
          }
          break;
        } else {
          continue;
        }
      } while (result != ans);
    }
  }
}
