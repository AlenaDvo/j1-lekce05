package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Adresa;
import cz.czechitas.lekce5.model.Osoba;
import cz.czechitas.lekce5.model.Telefon;

/**
 * Hlaví třída pro lekci 5.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {

        System.out.println("Slavnostne prisaham, ze nejsem pripraven na nic.");

        // pridani nove osoby
        Osoba dvorakova = new Osoba();
        dvorakova.setJmeno("Alena");
        dvorakova.setPrijmeni("Dvorakova");
        // test prazdneho rodneho cisla
        dvorakova.setRodneCislo("");
        // test rodneho cisla bez lomitka
        dvorakova.setRodneCislo("8057021111");
        // test spravneho rodneho cisla
        dvorakova.setRodneCislo("805702/1111");


        // pridani e-mailu k osobe
        // test prazdneho soukromeho e-mailu
        dvorakova.setSoukromyEmail("");
        // test pracovniho e-mailu bez @
        dvorakova.setPracovniEmail("ric");
        // test platnych e-mailu
        dvorakova.setSoukromyEmail("a@b.cz");
        System.out.println("soukromy e-mail: " + dvorakova.getSoukromyEmail());
        dvorakova.setPracovniEmail("b@a.cz");
        System.out.println("pracovni e-mail: " + dvorakova.getPracovniEmail());

        // pridani telefonu k osobe
        Telefon telefon = new Telefon();
        telefon.setPredcisli("0420");
        telefon.setTelefonniCislo("608542899");
        dvorakova.setTelefon(telefon);
        System.out.println(dvorakova.getTelefon());

        System.out.println(dvorakova);

        // pridani adresy k osobe
        Adresa adresa = new Adresa();
        adresa.setUlice("K Domu 1");
//        adresa.setCastObce("Stodola");
        adresa.setObec("Pragl");
        adresa.setPsc("11111");
        dvorakova.setAdresa(adresa);
        System.out.println(dvorakova.getAdresa());

        // vypis kontakty
        System.out.println(dvorakova.getKontakty());
    }

}
