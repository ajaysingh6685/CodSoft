import java.util.*;

public class Number_Guessing_Game {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Let's Start the Game ");

    int randomnumber = (int) (Math.random() * 100 + 1);
    int count = 0;

    while (true) {
      System.out.println("Guess the  Correct Number");
      int guess = sc.nextInt();
      count++;

      if (guess < 1) {
        System.out.println("Guessed Number is out of range");
      }

      else if (guess > 100) {
        System.out.println("Guessed Number is out of range");
      }

      else if (guess == randomnumber) {
        System.out.println("Hurray! You Win");
        break;

      } else if (guess < randomnumber) {
        System.out.println("Guessed number is too low");
      }

      else {
        System.out.println("Guessed number is too high");
      }

    }

    System.out.println("Your Score is " + ((10 - count) * 10) + " out of 100");
    System.out.println("It took you " + count + " tries");
    sc.close();
  }
}