import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Asigurare {
    ArrayList<Client> clienti = new ArrayList<>();

    Asigurare() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\clienti.txt"));
            while (true) {
                String s = br.readLine();
                if (s == null) {
                    break;
                }
                String[] t = s.split(" ");
                Imbunatari imb = new Imbunatari();
                imb.setRadion(Boolean.parseBoolean(t[8]));
                imb.setMp3Player(Boolean.parseBoolean(t[9]));
                imb.setAlarma(Boolean.parseBoolean(t[10]));
                imb.setSenzorParcare(Boolean.parseBoolean(t[11]));
                imb.setAerConditionat(Boolean.parseBoolean(t[12]));
                imb.setIncalzireScaune(Boolean.parseBoolean(t[13]));
                imb.setAccidente(Boolean.parseBoolean(t[14]));
                clienti.add(new Client(t[0], t[1], t[2], t[3], new ModelMasina(t[4], t[5], t[6], t[7]), imb, t[15]));
            }
            br.close();
        } catch (Exception e) {

        }
    }

    public void addClient(Client ab) {
        for (int i = 0; i < clienti.size(); i++) {
            if (clienti.get(i).getFullName().replace(" ", "").equals(ab.getFullName().replace(" ", ""))) {
                clienti.remove(clienti.get(i));
            }
        }
        clienti.add(ab);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\clienti.txt", false));
            for (int i = 0; i < clienti.size(); i++) {
                bw.append(clienti.get(i).toString() + "\n");
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}