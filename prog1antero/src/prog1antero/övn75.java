package prog1antero;

import java.util.Scanner;

public class övn75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		System.out.println("Ange längd och vindstyrka i m/s: ");
		double l = input.nextDouble();
		double v = input.nextDouble();
		
		if(l>7.92 && v<=2.0){
		System.out.println("Grattis! Du har ett nytt klubbrekord");
		}
		else{
			System.out.println("Du slog inte klubbrekordet");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
