
package com.mycompany.sudgame;

import java.util.HashMap;
import java.util.Map;


public class Lokacja {
    private String krotkiOpis;
    private String dlugiOpis;

    public Lokacja(String krotkiOpis, String dlugiOpis) {
        this.krotkiOpis = krotkiOpis;
        this.dlugiOpis = dlugiOpis;
    }

    public String getKrotkiOpis() {
        return krotkiOpis;
    }

    public String getDlugiOpis() {
        return dlugiOpis;
    }

    public String getOpis() {
        return this.krotkiOpis + "\n" + this.dlugiOpis;
        
    }
    private Map<Wyjscie,Lokacja> wyjscie = new HashMap<>();
    
    public void DodajWyjscie(Wyjscie w , Lokacja l){
        wyjscie.put(w, l);

    }
    
}
