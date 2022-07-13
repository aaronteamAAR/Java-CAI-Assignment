import java.security.SecureRandom;
import java.util.Random;
import java.util.Scanner;

public class Cai3 {

  public static void main(String[] args) {
    SecureRandom ranNum = new SecureRandom();
    Scanner in = new Scanner(System.in);
    System.out.println("Level 1 or Level 2 ");
    System.out.print("Choose your level of difficulty: ");
    int difficulty = in.nextInt();

    if (difficulty == 1) {
      int count = 0;
      for (int i = 1; i <= 10; i++) {
        int num1 = ranNum.nextInt(10), num2 = ranNum.nextInt(10);
        int result = num1 * num2;
        int ans = 0;
        do {
          int incre = count++;
          int cutoff = incre - i;
          System.out.println("How much is " + num1 + " times " + num2 + " ?");
          ans = in.nextInt();
          if (result == ans) {
            response();
            space();
            break;
          } else {
            incorrect();
            space();
            if (cutoff == 5) {
              System.out.println(
                "Please contact your teacher for help, regardless you can do this"
              );
            }
            continue;
          }
        } while (result != ans);
        if (i == 10) {
          System.out.print("Yes champ, you've passed the cutoff of 75%, share the game with your mate!!!");
        }
      }
    } else if (difficulty == 2) {
      int count = 0;
      for (int i = 1; i <= 10; i++) {
        int num1 = ranNum.nextInt(10 << 100), num2 = ranNum.nextInt(10 << 100);
        int result = num1 * num2;
        int ans = 0;
        do {
          int incre = count++;
          int cutoff = incre - i;
          System.out.println("How much is " + num1 + " times " + num2 + " ?");
          ans = in.nextInt();
          if (result == ans) {
            response();
            space();
            break;
          } else {
            incorrect();
            space();
            if (cutoff == 5) {
              System.out.println(
                "Please contact your teacher for help, regardless you can do this"
              );
            }
            continue;
          }
        } while (result != ans);
        if (i == 10) {
          System.out.print("yes champ");
        }
      }
    }
  }

  private static void incorrect() {
    Random ran = new Random();
    int limit = 5;
    int genran = ran.nextInt(1 + limit);

    switch (genran) {
      case 1:
        System.out.println("No. Please try again");
        break;
      case 2:
        System.out.println("Wrong. Try once more.");
        break;
      case 3:
        System.out.println("Don't give up!");
        break;
      case 4:
        System.out.println("No. Keep trying.");
        break;
    }
  }

  private static void response() {
    Random ran = new Random();
    int limit = 5;
    int genran = ran.nextInt(limit);

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
  }

  private static void space() {
    System.out.println("------------------");
  }

  private static void lvl2() {
    SecureRandom ranNum = new SecureRandom();
    Scanner in = new Scanner(System.in);
    int count = 0;
    for (int i = 1; i <= 10; i++) {
      int num1 = ranNum.nextInt(10), num2 = ranNum.nextInt(10);
      int result = num1 * num2;
      int ans = 0;
      do {
        int incre = count++;
        int cutoff = incre - i;
        System.out.println("How much is " + num1 + " times " + num2 + " ?");
        ans = in.nextInt();
        if (result == ans) {
          response();
          space();
          break;
        } else {
          incorrect();
          space();
          if (cutoff == 5) {
            System.out.println(
              "Please contact your teacher for help, regardless you can do this"
            );
          }
          continue;
        }
      } while (result != ans);
      if (i == 10) {
        System.out.print("yes champ");
      }
    }
  }
}
