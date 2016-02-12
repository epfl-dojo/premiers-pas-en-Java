
package app1;
import java.util.Scanner;
//1 radiateur chauffe 8m3
//utlisateur entre hauteur, largeur, longueur de la pièce
//calculer nombre de radiateur nécessaire
public class App1 {
    
    static final int RADPOWER = 8;
    //hauteur 1 largeur 1 longueur 1 retourne 1
    //hauteur 2 largeur 2 longueur 2 retourne 1
    //hauteur 2 largeur 5 longueur 6 retourne 8
    public static void main(String[] args) {
        double hauteur = askDouble("Quel est la hauteur? ");
        double largeur = askDouble("Quel est la largeur? ");
        double longueur = askDouble("Quel est la longueur? ");
        
        double volume = hauteur*largeur*longueur;
        int nbrRadiateurs = (int)Math.ceil(volume / RADPOWER);
        
        System.out.println(nbrRadiateurs);
    }
    
    public static String ask(String question){
        System.out.println(question);
        Scanner scan = new Scanner(System.in);
        String result = scan.nextLine();
        
        return result;
    }
    public static double askDouble(String question){
        double value;
        try{
            value = Double.parseDouble(ask(question));
        }
        catch(Exception e){
            value = askDouble("Entrer un nombre!");
        }
        return value;
    }
    
}
