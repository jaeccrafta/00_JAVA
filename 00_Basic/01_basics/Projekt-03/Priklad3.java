public class Priklad3 {
    public static void main(String args[])
    {
        // Tento program ilustruje rozdiel
        // medzi premennou int a double
        int iProm1;
        double dProm2;

        iProm1 = 10;
        dProm2 = 10.0;

        System.out.println("Pôvodná hodnota premennej iProm1: " + iProm1);
        System.out.println("Pôvodná hodnota premennej dProm2: " + dProm2);
        System.out.println();

        iProm1 /= 4;
        dProm2 /= 4;

        // Vypíše hodnoty po vydelení
        System.out.println("Hodnota iProm1 po vydelení: " + iProm1);
        System.out.println("Hodnota dProm2 po vydelení: " + dProm2);
    }
}