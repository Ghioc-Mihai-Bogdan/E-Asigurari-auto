import java.awt.Color;
import javax.swing.*;
public class Main {

	public static void main(String[] args) {
	
		JFrame f = new mainPage();
		f.setTitle("prima pagina");
		f.setSize(1280,720);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(new Color(0xEAFDFC));
		f.setResizable(false);
		
		
		
	}

}
