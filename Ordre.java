import java.util.Scanner;

class Ordre{
    public static void main(String[] args) {
        Scanner nbr1=new Scanner(System.in);
        System.out.print("Entrez votre premier nombre : ");
        int entier1=nbr1.nextInt();

        Scanner nbr2=new Scanner(System.in);
        System.out.print("Entrez votre deuxième nombre : ");
        int entier2=nbr2.nextInt();

        Scanner nbr3=new Scanner(System.in);
        System.out.print("Entrez votre troisième nombre : ");
        int entier3=nbr3.nextInt();

        if (entier1>entier2 && entier1>entier3 && entier2>entier3) {
            System.out.println("Dans l'ordre décroissant : " +entier1+ "," +entier2+"," +entier3);
            System.out.println("Dans l'ordre croissant : " +entier3+ "," +entier2+"," +entier1);


        } else if (entier1>entier2 && entier1>entier3 && entier3>entier2) {
                System.out.println("Dans l'ordre décroissant : " +entier1+ "," +entier3+"," +entier2);
                System.out.println("Dans l'ordre croissant : " +entier2+ "," +entier3+"," +entier1);

      
        } else if (entier2>entier1 && entier2>entier3 && entier1>entier3) {
            System.out.println("Dans l'ordre décroissant : " +entier2 + "," +entier1+ "," +entier3);
            System.out.println("Dans l'ordre croissant : " +entier3 + "," +entier1+ "," +entier2);


        } else if (entier2>entier1 && entier2>entier3 && entier3>entier1) {
            System.out.println("Dans l'ordre décroissant : " +entier2 + "," + entier3 + "," +entier1);
            System.out.println("Dans l'ordre croissant : " +entier1 + "," + entier3 + "," +entier2);

        } else if (entier3>entier1 && entier3>entier2 && entier2>entier1) {
            System.out.println("Dans l'ordre décroissant : " +entier3 + "," + entier2 + "," +entier1);
            System.out.println("Dans l'ordre croissant : " +entier1 + "," + entier2 + "," +entier3);

        } else if (entier3>entier1 && entier3>entier2 && entier1>entier2) {
            System.out.println("Dans l'ordre décroissant : " +entier3 + "," + entier1 + "," +entier2);
            System.out.println("Dans l'ordre croissant : " +entier2 + "," + entier1+ "," +entier3);
        }
    }
}

