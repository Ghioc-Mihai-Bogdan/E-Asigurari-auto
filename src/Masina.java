import java.io.*;
import java.util.*;

public class Masina {
    private String brand;
    public ArrayList<ModelMasina> Modele = new ArrayList<ModelMasina>();

    Masina(String brand) {
        this.brand = brand;
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\modele\\" + brand + ".txt"));
            while (true) {
                String line = br.readLine();
                if (line == null)
                    break;
                else {
                    try {
                        String tbl[] = line.split(" ");
                        this.addModel(tbl[0], tbl[1], tbl[2], tbl[3]);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Nu exista fisierul");
        }
    }

    // adauga nou model de masina
    public void addModel(String numeModel, String capCilindrica, String clasEuro, String tipCombustibil) {
        ModelMasina model = new ModelMasina(numeModel, capCilindrica, clasEuro, tipCombustibil);
        Modele.add(model);
    }

    public ModelMasina cautaModel(String model) {// returneaza modelul masinii daca exista si null daca nu
        for (int i = 0; i < Modele.size(); i++) {
            if (Modele.get(i).getModel().equals(model) == true)
                return Modele.get(i);
        }
        return null;
    }

    public String getCapCilindrica(String model) {// returneaza cap cilindrica a masinii daca exista si -1 daca nu
        for (int i = 0; i < Modele.size(); i++) {
            if (Modele.get(i).getModel().equals(model) == true)
                return Modele.get(i).getCapCilindrica();
        }
        return null;
    }

    public String getBrand() {
        return brand;
    }

    public String toString(int i) {
        return "Model: " + Modele.get(i).getModel() + " Capacitate Cilindrica: " + Modele.get(i).getCapCilindrica()
                + " Motor euro: " + Modele.get(i).getClasaEuro() + " Tip motor " + Modele.get(i).getComb()
                + " Indice de poluare: " + Modele.get(i).indicePoluare() + "/5 Indice de risc: "
                + Modele.get(i).indiceRisc() + "/3";
    }
}