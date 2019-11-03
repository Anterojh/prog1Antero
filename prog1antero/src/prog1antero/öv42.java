package prog1antero;
import java.util.Scanner;
public class öv42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Ange antal månader: ");
		
		int månader1 = input.nextInt();
		int år = månader1 / 12;
		int månader = månader1 % 12;
		
		System.out.print(månader1 + "månader =" + år + "år " + månader + "månader");
	

	}

}
