import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class listaModele {
	JButton[] b;
	String[] cM, tM, e;
	String capMotor, tipMotor, euro;
	Masina m;
	JFrame modele;

	public listaModele(String car, String an) {
		m = new Masina(car);
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(m.Modele.size(), 1, 0, 25));
		p.setBackground(new Color(0xEAFDFC));

		System.out.println(car);
		b = new JButton[m.Modele.size()];
		JLabel titlu = new JLabel("Alege modelul");
		titlu.setFont(new Font("Monospaced", Font.BOLD, 40));
		titlu.setHorizontalAlignment(JLabel.CENTER);

		modele = new JFrame("Modele");
		modele.setSize(1000, 900);
		modele.setResizable(false);
		modele.setLayout(null);
		modele.setVisible(true);
		modele.setLocationRelativeTo(null);
		modele.setLayout(new BorderLayout());
		modele.getContentPane().setBackground(new Color(0xEAFDFC));
		modele.add(titlu, BorderLayout.NORTH);
		modele.add(p);

		JScrollPane scrollPane = new JScrollPane(p);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.getVerticalScrollBar().setUnitIncrement(6);
		modele.add(scrollPane, BorderLayout.CENTER);

		String path = "D:\\" + car + ".txt";

		for (int j = 0; j < m.Modele.size(); j++) {
			// createButton(j);
			createButton(j, car, an);
			p.add(b[j]);
		}

	}

	public void createButton(int i, String car, String an) {
		b[i] = new JButton();
		b[i].setPreferredSize(new Dimension(800, 50));
		b[i].setText(m.toString(i));
		b[i].setFont(new Font("Times New Roman", Font.BOLD, 18));
		b[i].setBackground(new Color(0xBFEAF5));
		b[i].setFocusable(false);
		b[i].setBorderPainted(false);
		b[i].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s[] = m.toString(i).split(" ");
				ModelMasina m = new ModelMasina(s[1], s[4], s[7], s[10]);

				new Optiuni(car, an, m);
				modele.dispose();

			}
		});

	}
}