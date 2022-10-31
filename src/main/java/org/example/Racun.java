package org.example;

public class Racun {
    private Osoba korisnikRacuna;
    private Long brojRacuna;
    private boolean odobrenjePrekoracenja;
    private double stanjeRacuna;
    Racun(Long broj,Osoba Vlasnik){
        korisnikRacuna=Vlasnik;
        brojRacuna=broj;
    }
    private boolean provjeriOdobrenjePrekoracenja(double x){
        if(odobrenjePrekoracenja)
            return true;
        return false;
    }
    double izvrsiUplatu(double x){
        stanjeRacuna+=x;
        return stanjeRacuna;
    }
    double izvrsiIsplatu(double x){
        stanjeRacuna-=x;
        return stanjeRacuna;
    }
    void odobriPrekoracenje(double x){
        if(x<100)
            odobrenjePrekoracenja=true;
        else odobrenjePrekoracenja=false;
    }

}
