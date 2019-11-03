package prog1antero;
import java.util.Scanner;
public class öv41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		double tal1, tal2;
		
	System.out.print("mata in två decimaltal: ");
	tal1 = scan.nextDouble();
	tal2 = scan.nextDouble();
	
System.out.println(tal1 + "/" + tal2 + " = " + tal1/tal2);
System.out.println(tal1 + "%" + tal2 + " = " + tal1%tal2);
	}

}
