public class Priklad5_if {
    public static void main(String[] args)
    {
        int a, b, c;

        a = 2;
        b = 3;

        // testovanie premenných a, b
        if(a<b) System.out.println("Premenná a je menšia ako b.");
        if(a==b) System.out.println("Tento príkaz sa nevykoná.");
        System.out.println();

        c = b - a; // priradí premennej c nezápornú hodnotu

        System.out.println("Premenná c má hodnotu 1.");
        if(c>=0) System.out.println("Premenná c má nezápornú hodnotu.");
        if(c<0) System.out.println("Premenná c má zápornú hodnotu.");
        System.out.println();

        c = a - b; // priradí premennej c zápornú hodnotu
        System.out.println("Premenná c má hodnotu -1.");
        if(c>=0) System.out.println("Premenná c má nezápornú hodnotu.");
        if(c<0) System.out.println("Premenná c má zápornú hodnotu.\n");

        System.out.println("Tymto je program ukončený!");
    }
}
