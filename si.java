import com.sun.jdi.InvalidTypeException;
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;
public class si {
public static void main(String[] args) {
   //SHOPPING CART PROGRAM
Scanner sc = new Scanner(System.in);
String item;
double Price;
int quantity;
char currency = '₹';
double total;
System.out.println("What item would you like to buy? :");
item =  sc.nextLine();
System.out.print("What is the price? :");
Price =  sc.nextDouble();
System.out.print("Number of plates Required");
quantity=  sc.nextInt();
total = Price*quantity;
System.out.println(total);
System.out.println("\nYou Have Brought " + quantity + " " + item +"/s");
System.out.println("Your total is " + currency + total);
sc.close();
}
}