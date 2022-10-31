package org.example;
import java.util.List;
public class Banka {
    private long brojRacuna;
    Banka(){
        super();
    }
    Korisnik kreirajNovogKorisnika(String ime,String prezime){
        Korisnik b=new Korisnik(ime,prezime);
        return b;
    }
    Zaposlenik kreirajNovogZaposlenika(String ime,String prezime){
        Zaposlenik b=new Zaposlenik(ime,prezime);
        return b;
    }
    Racun kreirajNoviRacunZaKorisnika(Korisnik p){
        Osoba b=new Osoba(p.ime,p.prezime);

        Racun k=new Racun(brojRacuna,b);
        return k;
    }

}
