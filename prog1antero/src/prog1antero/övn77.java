package prog1antero;

import java.util.Scanner;

public class övn77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        
        int saldo = 1000;
        int val = 0;
        do {
        System.out.println("Meny \n1. Insättning \n2. Uttag \n3. Visa saldo");
         val = input.nextInt();
        
     
        switch (val) {
        
        case 1:
        	
        	System.out.println("Ange belopp du vill sätta in: ");
        	
        	saldo = saldo + input.nextInt();
        	System.out.println(saldo+" kr");
        	break;
        case 2:
	            System.out.println("Ange belopp du vill ta ut: ");
	        	
	        	saldo = saldo - input.nextInt();
	        	System.out.println(saldo+" kr");
        	
	        	break;
        case 3:
        	
        	System.out.println(saldo+" kr");
        	break;
        }
        
        }while( val!=0 );
        
	}
	

}
