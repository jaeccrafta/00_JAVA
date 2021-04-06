// Úlohou programu je vypočítať prevod jednotiek palce<->metre
// jeden meter = 39,37 palcov
// prevodná tabulka pre 12 stôp: jedna stopa obsahuje 12 palcov

public class Priklad7_inchToM {
    public static void main(String args[])
    {
        double palce, metre;
        final double meterPalcov = 39.37;
        int citac = 0;

        System.out.println("\nPrevedie palce na metre:");
        // palce na metre
        for(palce=1; palce<=144; palce++)
        {
            metre = palce / meterPalcov;  // prevedie palce na metre
            System.out.println(palce + " palcov sa rovná " + metre + " metrov.");

            citac++;
            if(citac==12)   // po každom 12-tom riadku vypíše nový riadok
            {
                System.out.println();
                citac = 0; // vynuluje čítač, začína odznova: po 12-ty riadok
            }
        }

        System.out.println("Prevedie metre na palce:");
        // metre na palce
        for(metre=1; metre<101; metre++)
        {
            palce = metre * meterPalcov;  // prevedie metre na palce
            System.out.println(metre + " metrov sa rovná " + palce + " palcov.");

            citac++;
            if(citac==10)   // po každom 10-tom riadku vypíše nový riadok
            {
                System.out.println();
                citac = 0; // vynuluje čítač, začína odznova: po 10-ty riadok
            }
        }
    }
}
