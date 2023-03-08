package cz.czechitas.lekce5.model;

public class Adresa {

    private String ulice;
    private String castObce;
    private String obec;
    private String psc;

    public String getUlice() {
        return ulice;
    }

    public String getCastObce() {
        return castObce;
    }

    public void setCastObce(String castObce) {
        this.castObce = castObce;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        this.obec = obec;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }
}
