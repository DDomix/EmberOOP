package hu.petrik.embrerekoop;

public class Ember {
    private String nev;
    private String SzulDatum;
    private String SzulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        SzulDatum = szulDatum;
        SzulHely = szulHely;
    }

    @Override
    public String toString() {
        return String.format("%-30s %10s %20s",this.nev,this.SzulDatum,this.SzulHely);
    }
}
