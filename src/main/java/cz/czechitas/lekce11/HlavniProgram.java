package cz.czechitas.lekce11;

import cz.czechitas.lekce11.grafika.Ctverec;
import cz.czechitas.lekce11.grafika.Trojuhelnik;
import cz.czechitas.lekce11.grafika.Tvar;

/**
 * Hlaví třída aplikace.
 */
public class HlavniProgram implements Runnable {
    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String[] args) {
        new HlavniProgram().run();
    }

    /**
     * Hlavní metoda obsahující výkonný kód.
     */
    @Override
    public void run() {
        nakresliTvar(new Ctverec());
        nakresliTvar(new Trojuhelnik());
    }

    private void nakresliTvar(Tvar tvar) {
        tvar.nakresli();
    }

}
