import java.util.Scanner;

class Comparaison{
    public static void main(String[] args) {
        Scanner nbr1=new Scanner(System.in);
        System.out.print("Entrez votre premier nombre : ");
        int entier1=nbr1.nextInt();

        Scanner nbr2=new Scanner(System.in);
        System.out.print("Entrez votre deuxième nombre : ");
        int entier2=nbr2.nextInt();

        if (entier1<entier2) {
            System.out.println("Le plus grand nombre est : " + entier2 + ", et le plus petit est : " +entier1);
        } else if (entier1==entier2) {
            System.out.println("Les deux entiers sont égaux!");
        } else {
            System.out.println("Le plus grand nombre est : " + entier1 + ", et le plus petit est : " +entier2);
        }
    }
}
