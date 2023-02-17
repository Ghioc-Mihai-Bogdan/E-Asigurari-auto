import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class listaAni extends mainPage {
  private JFrame listaAni;
  private String selected;
  protected String car;

  public listaAni(String car) {
    this.car = car;
    listaAni = new JFrame();
    listaAni.setSize(400, 600);
    listaAni.setResizable(false);
    listaAni.setLayout(null);
    listaAni.setVisible(true);
    listaAni.setLocationRelativeTo(null);
    listaAni.getContentPane().setBackground(new Color(0xEAFDFC));
    setTitle("Alege an");
    JLabel j = new JLabel("Alegeti anul");
    j.setBounds(125, 30, 300, 50);
    j.setFont(new Font("Monospaced", Font.BOLD, 20));
    listaAni.add(j);
    DefaultListModel<String> l1 = new DefaultListModel<>();
    l1.addElement("2010");
    l1.addElement("2011");
    l1.addElement("2012");
    l1.addElement("2013");
    l1.addElement("2014");
    l1.addElement("2015");
    l1.addElement("2016");
    l1.addElement("2017");
    l1.addElement("2018");
    l1.addElement("2019");
    l1.addElement("2020");
    l1.addElement("2021");
    l1.addElement("2022");
    l1.addElement("2023");

    // get vehicle's
    // year------------------------------------------------------------------------------

    JList an = new JList(l1);
    an.addListSelectionListener(new ListSelectionListener() {
      public void valueChanged(ListSelectionEvent evt) {
        if (!evt.getValueIsAdjusting()) {
          JList source = (JList) evt.getSource();
          selected = source.getSelectedValue().toString();
          System.out.println(selected);
        }
      }
    });

    // get vehicle's
    // year------------------------------------------------------------------------------

    an.setBounds(150, 100, 100, 300);
    an.setBackground(new Color(0xEAFDFC));
    listaAni.add(an);
    DefaultListCellRenderer renderer = (DefaultListCellRenderer) an.getCellRenderer();
    renderer.setHorizontalAlignment(JLabel.CENTER);

    JButton b = new JButton("Continua");
    b.setFocusable(false);
    b.setBackground(new Color(0xBFEAF5));
    b.setContentAreaFilled(false);
    b.setBounds(150, 500, 100, 50);
    b.setBorderPainted(false);
    b.setOpaque(true);
    b.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        new listaModele(car, selected);
        listaAni.dispose();
      }
    });

    listaAni.add(b);

  }
}