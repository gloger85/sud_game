
package com.mycompany.sudgame;

import java.util.HashMap;
import java.util.Map;


public class Location {
    private String shortDesc;
    private String longDesc;

    public Location(String shortDesc, String longDesc) {
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public String getDesc() {
        return this.shortDesc + "\n" + this.longDesc;
        
    }
    private Map<Exit,Location> exit = new HashMap<>();
    
    public void addExit(Exit w , Location l){
        exit.put(w, l);

    }
    
}
