import java.util.Scanner;

class Signe{
    public static void main(String[] args) {
        Scanner signe=new Scanner(System.in);
        System.out.println("Entrez un entier");
        int entier=signe.nextInt();

        if (entier<0) {
            System.out.println("Ceci est un nombre négatif");
        } else if (entier>0) {
            System.out.println("Ceci est un nombre positif");
        } else {
            System.out.println("Ce nombre est nul");
        }
    }
}
