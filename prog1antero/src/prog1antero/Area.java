package prog1antero;

import javax.swing.JOptionPane;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String h�jd=JOptionPane.showInputDialog("Ange h�jd: ");
		
		int h=Integer.parseInt(h�jd);
		
	String bas=JOptionPane.showInputDialog("Ange bas: ");
		
		int b=Integer.parseInt(bas);
		
		int triarea=h*b/2;
		
		int kvadarea=h*b;
		
		JOptionPane.showMessageDialog(null, "triangel area"+triarea+"kvadrat area"+kvadarea);
	}

}
