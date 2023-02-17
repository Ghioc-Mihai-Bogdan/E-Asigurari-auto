import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bazaClienti {
	private JFrame f;
	
	public bazaClienti() {
		f = new JFrame("Baza de date");
		f.setTitle("prima pagina");
		f.setSize(1280,720);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(new Color(0xEAFDFC));
		f.setResizable(false);
		f.setLayout(new BorderLayout());
		JPanel p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		
		
		JButton b = new JButton("Inapoi");
		b.setBackground(new Color(0x91D8E4));
	    b.setFocusable(false);
	    b.setBorderPainted(false);
	    b.setPreferredSize(new Dimension(75,50));
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
				JFrame fm = new mainPage();
				fm.setTitle("prima pagina");
				fm.setSize(1280,720);
				fm.setLocationRelativeTo(null);
				fm.setVisible(true);
				fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				fm.getContentPane().setBackground(new Color(0xEAFDFC));
				fm.setResizable(false);
			}
		});
		
		p1.add(b,BorderLayout.WEST);
		
		JLabel titlu = new JLabel("Lista clienti");
		titlu.setFont(new Font("Monospaced", Font.BOLD, 40));
		titlu.setHorizontalAlignment(JLabel.CENTER);
		p1.add(titlu,BorderLayout.CENTER);
		p1.setBackground(new Color(0xEAFDFC));
		f.add(p1,BorderLayout.NORTH);
		Asigurare a = new Asigurare();
		JPanel p2 = new JPanel();
		p2.setLayout(new GridLayout(a.clienti.size(), 1, 0, 25));
		p2.setBackground(new Color(0xEAFDFC));
		JLabel[] l = new JLabel[a.clienti.size()];
		for(int i=0; i<a.clienti.size();i++) {
			 l[i] = new JLabel(a.clienti.get(i).toStringf());
			 l[i].setBackground(new Color(0xBFEAF5));
			 l[i].setPreferredSize(new Dimension(1280, 30));
			 l[i].setOpaque(true);
			 l[i].setHorizontalAlignment(JLabel.CENTER);
			 p2.add(l[i]);
		}
		f.add(p2, BorderLayout.CENTER);
		JScrollPane scrollPane = new JScrollPane(p2);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.getVerticalScrollBar().setUnitIncrement(6);
		f.add(scrollPane, BorderLayout.CENTER);
		
		
	}
}
