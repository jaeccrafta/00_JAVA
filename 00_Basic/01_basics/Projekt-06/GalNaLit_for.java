// program prevedie galóny na litre a vypíše tabuľku po 10 galónoch do 100

public class GalNaLit_for {
    public static void main(String args[]) {

        double litre, galony;
        final double GalNaLit = 3.7854;
        int citac = 0;

        // vypočíta hodnotu litre podľa konštanty GalNaLit a
        // aktuálnej hodnoty riadiacej premennej cyklu (galony), následne ich vypíše
        for(galony = 1.0; galony < 101; galony++)
        {
            litre = GalNaLit * galony;
            System.out.println(galony + " galónov je " + litre + " litrov.");

            citac++;
            if(citac == 10)     // po každom 10-tom riadku vypíše prázdny riadok
            {
                System.out.println();
                citac = 0;		// vynuluje čítač, začína počítať odznova: do 10
            }
        }
    }
}
