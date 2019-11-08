package prog1antero;

import java.util.Scanner;

public class Area2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("Ange höjd: ");
       int h = input.nextInt();
    		   System.out.println("Ange bas: ");
    		   int b=input.nextInt();
    		   
    		   int tarea=b*h/2;
    		   int rarea=b*h;
    		   
    		   System.out.println("t area"+tarea+"r area"+rarea);
		
	}

}
