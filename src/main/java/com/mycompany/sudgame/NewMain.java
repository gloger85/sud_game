
package com.mycompany.sudgame;

import java.util.Scanner;




public class NewMain {


    public static void main(String[] args) {
    
        String imieGracza = zapytajOimie();
        Gracz gracz = new Gracz(imieGracza);
        Lokacja startowaLok = new Lokacja("Lokacja startowa", "Znajdujesz sie na przykladowej lokacji startowej");
        Lokacja NastLok = new Lokacja("Lokacja kolejna", "Znajdujesz sie na przykladowej lokacji kolejnej");
        gracz.setAktualnaLokacja(startowaLok);
        System.out.print(gracz.getAktualnaLokacjaOpis());
        startowaLok.DodajWyjscie(Wyjscie.N,NastLok);
        NastLok.DodajWyjscie(Wyjscie.S,startowaLok);
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


