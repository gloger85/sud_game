
package com.mycompany.sudgame;

import java.util.Scanner;




public class NewMain {


    public static void main(String[] args) {
    
        String imieGracza = zapytajOimie();
        Gracz gracz = new Gracz(imieGracza);
        Lokacja startowaLok = new Lokacja("Lokacja startowa", "Znajdujesz sie na przykladowej lokacji startowej");
        
        gracz.setAktualnaLokacja(startowaLok);
        System.out.print(gracz.getAktualnaLokacjaOpis());
    }

    private static String zapytajOimie() {
        System.out.print("podaj imie dla gracza");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.print("\nWitaj " + name + "\n");
        scanner.close();
        return name;
        
    }
    
}


