import java.util.Scanner;

public class Objective3Lab3 {
  public static void main( String[] args ) {
    int birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println( "How old are you?" );

    int age = input.nextInt();

    birthYear = 2017 - age;

    System.out.println( "You were born in " + birthYear );
    input.close();
  }
}
