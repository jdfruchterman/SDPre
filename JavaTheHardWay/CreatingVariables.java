public class CreatingVariables {
  public static void main( String[] args ) {
    int x, y, age, weight;
    double seconds, e, checking, pi;
    String firstName, lastName, title, gender, team;

    x = 10;
    y = 400;
    age = 39;
    weight = 170;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    pi = 3.14;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    gender = "male";
    team = "San Francisco Giants";

    System.out.println( "The variable x contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "The experiment took " + seconds + " seconds." );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + lastName );
    System.out.println( "I weigh " + weight + "lbs." );
    System.out.println( "The value Pi is approximately " + pi + "." );
    System.out.println( "I am a " + gender + "." );
    System.out.println( "My favorite sports team is the " + team + "." );
  }
}
