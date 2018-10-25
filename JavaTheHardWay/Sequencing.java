import java.util.Scanner;

public class Sequencing {
  public static void main( String[] args ) {
    // This code is broken until you fix it

    Scanner keyboard = new Scanner(System.in);
    double price, salesTax, total;

    System.out.print( "How much is the purhase price? " );
    price = keyboard.nextDouble();

    salesTax = price * 0.0825;
    total = price + salesTax;

    System.out.println( "Item price:\t" + price );
    System.out.println( "Sales tax:\t" + salesTax );
    System.out.println( "Total cost:\t" + total );
  }
}
// 1. you get an error
// 2. yes it works
// 3. no it doesn't, i'm not surprised because it doesn't try
// to use price until after it has been defined
