import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println(minute());
        motto();
    }
    public static int minute()
    {
        System.out.print("Adaugati numarul de minute ");
        Scanner inputDevice=new Scanner(System.in);
        int minute;
        minute=inputDevice.nextInt();
        total(minute);
        System.out.print("Nr de minute este= ");
        return minute;
    }
    public static void motto()
    {
        System.out.print("MOTTOTOTOT");
    }
    public static void total(int m)
    {
        int inchiriere , inchiriereextra = 0, inchiereMeh, ore;


        inchiriere = m * 40;
        if (inchiriere > 240) {
            for (int i = 60; i < m; i++) {
                inchiriereextra++;

            }
        }
        System.out.print("Pretul fara orele extra e ");
        System.out.println(inchiriere);

        System.out.print("Pretul minute suplimentare este ");
        System.out.println(inchiriereextra);


        inchiereMeh = inchiriere + inchiriereextra ;

        System.out.print("Pretul complet este");
        System.out.println(inchiereMeh);
        ore=m/60;
        System.out.print("Numarul de ore ");
        System.out.println(ore);
    }
}