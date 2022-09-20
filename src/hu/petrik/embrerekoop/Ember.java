package hu.petrik.embrerekoop;

import java.time.LocalDate;

public class Ember {
    private String nev;
    private String SzulDatum;
    private String SzulHely;

    public Ember(String nev, String szulDatum, String szulHely) {
        this.nev = nev;
        SzulDatum = szulDatum;
        SzulHely = szulHely;
    }

    public int getSzuletesiEv(){
        return Integer.parseInt(SzulDatum.substring(0, 4));
    }
    public int getSzuletesiHonap(){
        return Integer.parseInt(SzulDatum.split("-")[1]);
    }
    public int getSzuletesiNap(){
        return Integer.parseInt(SzulDatum.split("-")[2]);
    }
    public int getEletkor(){
        LocalDate maidatum = LocalDate.now();
        return maidatum.getYear()-this.getSzuletesiEv();
    }

    @Override
    public String toString() {
        return String.format("%-30s %10s (%d) %20s",this.nev,this.SzulDatum,this.getEletkor(), this.SzulHely);
    }
}
