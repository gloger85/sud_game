
package com.mycompany.sudgame;


public class Player {
    private String name;
    private Location actualLocation;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Location getActualLocation() {
        return actualLocation;
    }
    
    void setActualLocation(Location startLoc) {
        this.actualLocation = startLoc; 
    }

    public String getActualLocationDesc() {
        return this.actualLocation.getDesc();
    }
}
