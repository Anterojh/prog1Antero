package prog1antero;
import java.util.Scanner;
public class �v42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Ange antal m�nader: ");
		
		int m�nader1 = input.nextInt();
		int �r = m�nader1 / 12;
		int m�nader = m�nader1 % 12;
		
		System.out.print(m�nader1 + "m�nader =" + �r + "�r " + m�nader + "m�nader");
	

	}

}
