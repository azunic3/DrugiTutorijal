package org.example;

public class Osoba {
    String ime;
    String prezime;
    Osoba(String ime, String prezime){
        this.ime=ime;
        this.prezime=prezime;
    }



    public String toString(){
        String myString=ime+" "+prezime;
        return myString;
    }

}
