import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println(invitati());
        motto();
    }
    public static int invitati()
    {
        int inv,z;
        System.out.print("Adaugati numarul de invitati=  ");
        Scanner inputDevice=new Scanner(System.in);
        inv=inputDevice.nextInt();
        z=inv;
        pret(z);
        System.out.print("Numarul de invitati este =  ");
        return inv;
    }
    public static void motto()
    {

        System.out.print("MOTTTTTTTTTTTOOOOOOOOOOO LAB 1 \n" );
    }

    public static void pret(int a2)
    {

        int p2=a2*35;
        System.out.print("Pretul este  ");
        System.out.println(p2);
        System.out.print("Este un eveniment mare?=  ");
        System.out.println(a2>50);
    }

}
