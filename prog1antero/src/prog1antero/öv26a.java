package prog1antero;
import java.util.Scanner;
public class öv26a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Ange ett belopp: ");
		
		double belopp = input.nextDouble();
		
		double belopp1 = belopp/100;
		
		double belopp2 = belopp1+0.5;
		
		int uttag = (int) belopp2;
		
		int uttag2 = uttag*100;
		
		System.out.print("Uttag: " + uttag2);
		
	}

}
