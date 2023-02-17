public class Client {
    private String nume;
    private String prenume;
    private String varsta;
    private String marca;
    private String anMasina;

    private ModelMasina specificatii;
    private Imbunatari imbunatari;

    Client(String nm, String pn, String age, String brand, ModelMasina modM, Imbunatari imb, String anM) {
        this.nume = nm;
        this.prenume = pn;
        this.varsta = age;
        this.marca = brand;
        this.specificatii = modM;
        this.imbunatari = imb;
        this.anMasina = anM;
    }

    Client() {
        this.nume = null;
        this.prenume = null;
        this.varsta = null;
        this.marca = null;
        this.specificatii = null;
        this.imbunatari = null;
    }

    @Override
    public String toString() {// nume marca model
        return this.nume + " " + this.prenume + " " + this.varsta + " " + this.marca + " "
                + this.specificatii.toString() + " "
                + this.imbunatari.toString() + " " + this.anMasina;
    }

    public String toStringf() {// nume marca model
        return this.nume + " " + this.prenume + " " + this.varsta + " " + this.marca + " "
                + this.specificatii.toString();
    }

    public String getFullName() {
        return this.getNume() + " " + this.getPrenume();
    }

    public int calculeazaAsigurare() {
        int n = 0;
        // varsta
        if (Integer.parseInt(this.varsta) < 30) {
            n += 400 * 0.10;
        } else if (Integer.parseInt(this.varsta) >= 30 && Integer.parseInt(this.varsta) < 40) {
            n -= 400 * 0.10;
        } else if (Integer.parseInt(this.varsta) >= 40 && Integer.parseInt(this.varsta) < 60) {
            n -= 400 * 0.05;
        } else {
            n += 400 * 0.05;
        }
        // indice de poluare
        if (specificatii.indicePoluare() > 1 && specificatii.indicePoluare() <= 3) {
            n += 0.10 * 400;
        } else if (specificatii.indicePoluare() == 4) {
            n += 0.15 * 400;
        }
        // indice de risc
        if (specificatii.indiceRisc() == 3) {
            n += 0.10 * 400;
        } else if (specificatii.indiceRisc() == 2) {
            n += 0.05 * 400;
        }
        return n + 400 + imbunatari.calculeazaImb();
    }

    ///////////////////////// setters si getters \\\\\\\\\\\\\\\\\\\\\\\\\
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getVarsta() {
        return varsta;
    }

    public void setVarsta(String vaString) {
        this.varsta = vaString;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ModelMasina getSpecificatii() {
        return specificatii;
    }

    public void setSpecificatii(ModelMasina m) {
        this.specificatii = m;
    }

    public Imbunatari getImbunatari() {
        return imbunatari;
    }

    public void setImbunatari(Imbunatari imbunatari) {
        this.imbunatari = new Imbunatari();
        this.imbunatari = imbunatari;
    }

    public String getAnMasina() {
        return anMasina;
    }

    public void setAnMasina(String anMasina) {
        this.anMasina = anMasina;
    }

}
