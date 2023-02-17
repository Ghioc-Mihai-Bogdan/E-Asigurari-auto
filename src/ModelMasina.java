public class ModelMasina {
    private String numeModel;
    private String capCilindrica;
    private String clasaEuroPol;
    private String combustibil;

    @Override
    public String toString() {
        return numeModel + " " + capCilindrica + " " + clasaEuroPol + " " + combustibil;
    }

    // constructor
    ModelMasina(String name, String capString, String clasEuro, String combString) {
        this.numeModel = name;
        this.capCilindrica = capString;
        this.clasaEuroPol = clasEuro;
        this.combustibil = combString;
    }

    

    public int indicePoluare() {
        int ind = 0;
        if (this.clasaEuroPol.equals("euro3") || this.clasaEuroPol.equals("euro4"))
            ind += 2;
        else
            ind += 1;
        if (this.combustibil.equals("benzina"))
            ind += 1;
        else if (this.combustibil.equals("diesel"))
            ind += 2;
        return ind;
    }

    public int indiceRisc() {
        if (this.combustibil.equals("benzina"))
            return 2;
        if (this.combustibil.equals("diesel"))
            return 1;
        return 3;
    }

    // seters si getters
    public String getModel() {
        return this.numeModel;
    }

    public String getCapCilindrica() {
        return this.capCilindrica;
    }

    public String getClasaEuro() {
        return clasaEuroPol;
    }

    public String getComb() {
        return this.combustibil;
    }

    public void setModel(String name) {
        this.numeModel = name;
    }

    public void setCapCilindrica(String capCili) {
        this.capCilindrica = capCili;
    }

    public void setClasaEuro(String euro) {
        this.clasaEuroPol = euro;
    }

    public void setComb(String comb) {
        this.combustibil = comb;
    }

}