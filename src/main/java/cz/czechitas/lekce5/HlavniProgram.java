package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Adresa;
import cz.czechitas.lekce5.model.Osoba;

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

        System.out.println("Slavnostně přísahám, že jsem připraven ke každé špatnosti.");

        Osoba testovaciOsoba = new Osoba();
        testovaciOsoba.setPracovniEmail("huhuh@hehe.com");

        Adresa adresaProOsobu = new Adresa();
        adresaProOsobu.setObec("praha");
        adresaProOsobu.setCastObce("smichov");
        adresaProOsobu.setUlice("heydukova");
        adresaProOsobu.setPsc("11500");

        testovaciOsoba.setAdresa(adresaProOsobu);


    }

}
