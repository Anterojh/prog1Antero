package prog1antero;

import java.util.Scanner;

public class Medelvärde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        System.out.print("Ange ett tal: ");
        int a = input.nextInt();
        
        System.out.print("Ange ett tal: ");
                int b = input.nextInt();
                
                System.out.print("Ange ett tal: ");
                        int c = input.nextInt();
                        
                        int medel = (a+b+c)/3;
                        		
                        		int summa = a+b+c;
                        		
                        		System.out.print("Summa = "+summa+" medelvärde = "+medel);
	}

}
