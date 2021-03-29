import java.util.Scanner;

class NombreJours{
    public static void main(String[] args) {
        Scanner clavier= new Scanner(System.in);
        System.out.println("Veuillez entrer le chiffre d'un mois : ");
        int mois=clavier.nextInt(); 
        System.out.println("Veuillez entrer une année : ");
        int annee=clavier.nextInt(); 

        switch (mois){
        case 2:
            if(annee%4==0 && annee%100!=0 || annee%400==0 ){
                System.out.println("Le mois " +mois+" de l/'année " +annee+ " compte : 29jours");
            }else{
                System.out.println("Le mois " +mois+ " de l/'année " +annee+ " compte : 28jours");
            }
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            System.out.println("Le mois " +mois+ " de l/'année " +annee+ " compte : 30jours");
            break;
        default:
            System.out.println("Le mois " +mois+ " de l/'année " +annee+ " compte : 31jours");
            break;
        } 
    }
}       
