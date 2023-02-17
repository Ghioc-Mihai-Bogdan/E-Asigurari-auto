public class Imbunatari {
    private boolean radio, mp3Player, alarma, senzoriParcare, aerConditionat, incalzireScaune, accidente;

    @Override
    public String toString() {
        return radio + " " + mp3Player + " " + alarma + " "
                + senzoriParcare + " " + aerConditionat + " " + incalzireScaune
                + " " + accidente;
    }

    Imbunatari() {
        radio = false;
        mp3Player = false;
        alarma = false;
        senzoriParcare = false;
        aerConditionat = false;
        incalzireScaune = false;
        accidente = false;
    }

    // calculeaza imbunatariri
    public int calculeazaImb() {
        int n = 0;
        if (radio == true) {
            n += 15;
        }
        if (mp3Player == true) {
            n += 20;
        }
        if (alarma == true) {
            n += 20;
        }
        if (senzoriParcare == true) {
            n += 70;
        }
        if (aerConditionat == true) {
            n += 40;
        }
        if (incalzireScaune == true) {
            n += 80;
        }
        if (accidente == true) {
            n += 100;
        }
        return n;
    }

    // getters
    public boolean getRadio() {
        return radio;
    }

    public boolean getMp3Player() {
        return mp3Player;
    }

    public boolean getAlarma() {
        return alarma;
    }

    public boolean getSenzoriParcare() {
        return senzoriParcare;
    }

    public boolean getAerConditionat() {
        return aerConditionat;
    }

    public boolean getIncalzireScaune() {
        return incalzireScaune;
    }

    // setters
    public void setRadion(boolean val) {
        this.radio = val;
    }

    public void setMp3Player(boolean val) {
        this.mp3Player = val;
    }

    public void setAlarma(boolean val) {
        this.alarma = val;
    }

    public void setSenzorParcare(boolean val) {
        this.senzoriParcare = val;
    }

    public void setAerConditionat(boolean val) {
        this.aerConditionat = val;
    }

    public void setIncalzireScaune(boolean val) {
        this.incalzireScaune = val;
    }

    public boolean isAccidente() {
        return accidente;
    }

    public void setAccidente(boolean accidente) {
        this.accidente = accidente;
    }
}