
package com.mycompany.sudgame;

import java.util.Scanner;




public class NewMain {


    public static void main(String[] args) {
    
        String playerName = askForName();
        Player gracz = new Player(playerName);
        Location startLoc = new Location("Start Location", "You are in start location");
        Location NextLoc = new Location("Next Location", "You are in next example location");
        gracz.setActualLocation(startLoc);
        System.out.print(Player.getActualLocationDesc());
        startLoc.addExit(Exit.N,NextLoc);
        NextLoc.addExit(Exit.S,startLoc);
    }

    private static String askForName() {
        System.out.print("type name for player: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("\nHello " + name + "\n");
        scanner.close();
        return name;
    }
}


