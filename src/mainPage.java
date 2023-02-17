import java.awt.*;
import javax.swing.*;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class mainPage extends JFrame{
	private JLabel titlu;
	private JButton asigurare, clienti;
	private JFrame fAsigurare;
	
	public mainPage() {
		setLayout(null);
				
		titlu = new JLabel("Asigurări D&G");
		titlu.setFont(new Font("Monospaced", Font.BOLD, 40));
		titlu.setBounds(475, 50, 400, 80);
		
		asigurare = new JButton("Întocmește asigurare");
		asigurare.setBounds(475,200,300,50);
		asigurare.setFont(new Font("Times New Roman", Font.BOLD, 18));
		asigurare.setFocusable(false);
		asigurare.setBackground(new Color(0x91D8E4));
		asigurare.setBorderPainted(false);
		asigurare.addActionListener(new ascultator1());

		
		clienti = new JButton("Vezi clienți");
		clienti.setBounds(475,275,300,50);
		clienti.setFont(new Font("Times New Roman", Font.BOLD, 18));
		clienti.setFocusable(false);
		clienti.setBackground(new Color(0x91D8E4));
		clienti.setBorderPainted(false);
		clienti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new bazaClienti();
				dispose();
			}
		});
		add(titlu);
		add(asigurare);
		add(clienti);
 	
	}
	private class ascultator1 implements ActionListener {
		private JFrame fAsigurare;
		private JButton b1, b2, b3, b4, b5, b6;
		private ImageIcon i1, i2, i3, i4, i5, i6;
		private String masina;
		ascultator1(){
			
		}
		
		public void actionPerformed(ActionEvent e) {
			dispose();
			fAsigurare = new JFrame("Intocmeste asigurare");
			fAsigurare.setSize(1280, 720);
			fAsigurare.setVisible(true);
			fAsigurare.setLocationRelativeTo(null);
			fAsigurare.setResizable(false);
			fAsigurare.setDefaultCloseOperation(EXIT_ON_CLOSE);
			fAsigurare.setLayout(new GridLayout(2,3));
			fAsigurare.getContentPane().setBackground(new Color(0xEAFDFC));
			b1 = new JButton();
			i1 = new ImageIcon("D:/bmw.png");
			b1.setIcon(i1);
			b1.setBackground(new Color(0xEAFDFC));
			b1.setFocusable(false);
			b1.setBorderPainted(false);
			b1.setContentAreaFilled(false);
			b1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				new listaAni("BMW");
				fAsigurare.dispose();
			}});
			fAsigurare.add(b1);
			
			b2 = new JButton();
			i2 = new ImageIcon("D:/audi.png");
			b2.setIcon(i2);
			b2.setBackground(new Color(0xEAFDFC));
			b2.setFocusable(false);
			b2.setBorderPainted(false);
			b2.setContentAreaFilled(false);
			b2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				new listaAni("Audi");
				fAsigurare.dispose();
			}});
			fAsigurare.add(b2);
			
			b3 = new JButton();
			i3 = new ImageIcon("D:/Volkswagen.png");
			b3.setIcon(i3);
			b3.setBackground(new Color(0xEAFDFC));
			b3.setFocusable(false);
			b3.setBorderPainted(false);
			b3.setContentAreaFilled(false);
			b3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				new listaAni("volkswagen");
				fAsigurare.dispose();
			}});
			fAsigurare.add(b3);
			
			b4 = new JButton();
			i4 = new ImageIcon("D:/mercedes.png");
			b4.setIcon(i4);
			b4.setBackground(new Color(0xEAFDFC));
			b4.setFocusable(false);
			b4.setBorderPainted(false);
			b4.setContentAreaFilled(false);
			b4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				new listaAni("Mercedes");
				fAsigurare.dispose();
			}});
			fAsigurare.add(b4);
			
			b5 = new JButton();
			i5 = new ImageIcon("D:/dacai.png");
			b5.setIcon(i5);
			b5.setBackground(new Color(0xEAFDFC));
			b5.setFocusable(false);
			b5.setBorderPainted(false);
			b5.setContentAreaFilled(false);
			b5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				new listaAni("Dacia");
				fAsigurare.dispose();
			}});
			fAsigurare.add(b5);
			
			b6 = new JButton();
			i6 = new ImageIcon("D:/renault.png");
			b6.setIcon(i6);
			b6.setBorderPainted(false);
			b6.setBackground(new Color(0xEAFDFC));
			b6.setFocusable(false);
			b6.setContentAreaFilled(false);
			b6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				new listaAni("Renault");
				fAsigurare.dispose();
			}});
			fAsigurare.add(b6);

		}
	}
  }
