
package com.mycompany.sudgame;


public class Gracz {
    private String imie;
    private Lokacja aktualnaLokacja;

    public Gracz(String imie) {
        this.imie = imie;
    }

    public String getImie() {
        return imie;
    }

    public Lokacja getAktualnaLokacja() {
        return aktualnaLokacja;
    }
    
    void setAktualnaLokacja(Lokacja startowaLok) {
        this.aktualnaLokacja = startowaLok; 
    }

    public String getAktualnaLokacjaOpis() {
        return this.aktualnaLokacja.getOpis();
    }
}
