import javax.swing.*;
import java.awt.*;
import java.awt.event.*;;

public class Optiuni {
  public static int totalDePlata = 0;
  Imbunatari imb = new Imbunatari();
  Client client = new Client();

  public Optiuni(String car, String an, ModelMasina m) {

    JFrame frame = new JFrame("Checkbox");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 500);
    frame.getContentPane().setBackground(new Color(0xEAFDFC));
    frame.setVisible(true);
    frame.setLayout(null);
    frame.setResizable(false);

    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    JLabel cost = new JLabel("Pret: " + totalDePlata + " de lei");
    panel.add(cost);
    panel.setBackground(new Color(0xEAFDFC));

    JCheckBox optiune1 = new JCheckBox("MP3");
    optiune1.setBackground(new Color(0xEAFDFC));
    optiune1.setFocusable(false);
    optiune1.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
          imb.setMp3Player(true);
          totalDePlata += 20;
        } else {
          imb.setMp3Player(false);
          totalDePlata -= 20;
        }
        cost.setText("Pret: " + totalDePlata + " de lei");
      }
    });
    panel.add(optiune1);

    JCheckBox optiune2 = new JCheckBox("Aer Conditionat");
    optiune2.setBackground(new Color(0xEAFDFC));
    optiune2.setFocusable(false);
    optiune2.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
          imb.setAerConditionat(true);
          totalDePlata += 40;
        } else {
          imb.setAerConditionat(false);
          totalDePlata -= 40;
        }
        cost.setText("Pret: " + totalDePlata + " de lei");
      }
    });
    panel.add(optiune2);

    JCheckBox optiune3 = new JCheckBox("Radio");
    optiune3.setBackground(new Color(0xEAFDFC));
    optiune3.setFocusable(false);
    optiune3.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
          imb.setRadion(true);
          totalDePlata += 15;
        } else {
          imb.setRadion(false);
          totalDePlata -= 15;
        }
        cost.setText("Pret: " + totalDePlata + " de lei");
      }
    });
    panel.add(optiune3);

    JCheckBox optiune4 = new JCheckBox("Incalzire Scaune");
    optiune4.setBackground(new Color(0xEAFDFC));
    optiune4.setFocusable(false);
    optiune4.addItemListener(new ItemListener() {

      public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
          imb.setIncalzireScaune(true);
          totalDePlata += 80;
        } else {
          imb.setIncalzireScaune(false);
          totalDePlata -= 80;
        }
        cost.setText("Pret: " + totalDePlata + " de lei");
      }
    });
    panel.add(optiune4);

    JCheckBox optiune5 = new JCheckBox("Alarma");
    optiune5.setBackground(new Color(0xEAFDFC));
    optiune5.setFocusable(false);
    optiune5.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
          imb.setAlarma(true);
          totalDePlata += 20;
        } else {
          imb.setAlarma(false);
          totalDePlata -= 20;
        }
        cost.setText("Pret: " + totalDePlata + " de lei");
      }
    });
    panel.add(optiune5);

    JCheckBox optiune6 = new JCheckBox("Senzori de parcare");
    optiune6.setBackground(new Color(0xEAFDFC));
    optiune6.setFocusable(false);
    optiune6.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
          imb.setSenzorParcare(true);
          totalDePlata += 70;
        } else {
          imb.setSenzorParcare(false);
          totalDePlata -= 70;
        }
        cost.setText("Pret: " + totalDePlata + " de lei");
      }
    });
    panel.add(optiune6);

    JCheckBox optiune7 = new JCheckBox("Accidente in ultimii 5 ani");
    optiune7.setBackground(new Color(0xEAFDFC));
    optiune7.setFocusable(false);
    optiune7.addItemListener(new ItemListener() {
      public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
          imb.setAccidente(true);
          totalDePlata += 100;
        } else {
          imb.setAccidente(false);
          totalDePlata -= 100;
        }
        cost.setText("Pret: " + totalDePlata + " de lei");
      }
    });
    panel.add(optiune7);

    panel.setBounds(25, 50, 400, 300);
    frame.add(panel);
    frame.setLocationRelativeTo(null);

    var continua = new JButton("Continua");
    continua.setFont(new Font("Times New Roman", Font.BOLD, 18));
    continua.setBackground(new Color(0x91D8E4));
    continua.setFocusable(false);
    continua.setHorizontalAlignment(0);
    continua.setBorderPainted(false);
    continua.setBounds(125, 375, 150, 50);
    continua.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String[] raspuns = JOptionPane.showInputDialog(null, "Introduceti numele complet").split(" ");
        String nume = raspuns[0];
        String prenume = "";
        for (int i = 1; i < raspuns.length; i++) {
          prenume += raspuns[i] + " ";
        }
        String age = JOptionPane.showInputDialog(null, "Introduceti varsta");
        client.setNume(nume);
        client.setMarca(car);
        System.out.println(client.getNume());
        client.setPrenume(prenume);
        client.setVarsta(age);
        client.setImbunatari(imb);
        client.setSpecificatii(m);
        client.setAnMasina(an.toString());
        new Asigurare().addClient(client);
        new Print(client);
        frame.dispose();
        JFrame f = new mainPage();
		f.setTitle("prima pagina");
		f.setSize(1280,720);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(new Color(0xEAFDFC));
		f.setResizable(false);
      }
    });
    frame.add(continua);
  }
}