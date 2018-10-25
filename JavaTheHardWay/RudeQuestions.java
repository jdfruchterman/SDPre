import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name, party;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? " );
    name = keyboard.next();

    System.out.print( "Hi, " + name + "! How old are you ?" );
    age = keyboard.nextInt();

    System.out.println( "So you're " + age + ", eh? That's not very old." );
    System.out.println( "How much do you weigh, " + name + "?" );
    weight = keyboard.nextDouble();

    System.out.println( weight + "! Better keep that quiet!!" );
    System.out.println( "Finally, what's your income, " + name + "?" );
    income = keyboard.nextDouble();

    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );

    System.out.println( "What political party do you support, " + name + "?" );
    party = keyboard.next();

    System.out.println( "The " + party + " party, seriously? " + name + ", don't you know both parties are the same?" );

    System.out.print( "Well, thanks for answering my rude questions, ");
    System.out.println( name + "." );
  }
}
// 1. no because whole numbers can be doubles, you just can't have fractions in an integer
// 2. no, because you can enter letters or numbers into a string
// 3. easy to blow up all but the first question by entering letters or symbols, can't
// figure out how to blow up the first question
