import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, f, i, lbs, inches;

    System.out.print( "Your height (feet only): " );
    f = keyboard.nextDouble();
    System.out.print( "Your height (inches): " );
    i = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    lbs = keyboard.nextDouble();

    inches = (f*12) + i;
    m = inches*0.0254;
    kg = lbs*0.453592;
    bmi = kg / (m*m);

    System.out.println( "Your BMI is " + bmi );
  }
}
