package cz.czechitas.lekce5.model;

public class Adresa {

    private String ulice;

    private String castObce;

    private String obec;

    private String psc;

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        if (ulice != null && !ulice.isEmpty()) {
            this.ulice = ulice;
        } else {
            System.err.println("Ulice nesmi byt prazdna]!");
        }
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
        if (obec != null && !obec.isEmpty()) {
            this.obec = obec;
        } else {
            System.err.println("Obec nesmi byt prazdna!");
        }
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        if (psc != null && !psc.isEmpty() && psc.length() == 5) {
            this.psc = psc;
        } else {
            System.err.println("PSC nesmi byt prazdne!");
        }
    }

    @Override
    public String toString() {
        if (castObce == null) {
            return "Adresa: " +
                    "ulice: " + ulice +
                    ", obec: " + obec +
                    ", psc: " + psc;
        } else {
            return "Adresa: " +
                    "ulice: " + ulice +
                    ", cast obce: " + castObce +
                    ", obec: " + obec +
                    ", psc: " + psc;
        }
    }
}
