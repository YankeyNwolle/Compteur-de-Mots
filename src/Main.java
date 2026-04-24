
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        int total_mots = 0 ;

        try {
            File fichier = new File("test.txt") ;
            Scanner scanner = new Scanner(fichier) ;

            while(scanner.hasNextLine()){
                String ligne = scanner.nextLine() ;

                // Sépare les chaînes avec des espaces
                String[] mots = ligne.trim().split("\\s+") ;

                // Évite de compter des lignes vides
                if (!ligne.trim().isEmpty()){
                    total_mots += mots.length ;
                }
            }

            scanner.close();

            System.out.println(" Nombre total de mots : " + total_mots);

        }catch (FileNotFoundException e){
            System.err.println("Fichier introuvable : " + e.getMessage());
        }


    }
}