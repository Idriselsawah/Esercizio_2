import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int base, esponente;
        System.out.println("Inserisci la base della potenza");
        base = scan.nextInt();
        System.out.println("Inserisci l'esponente della potenza");
        esponente = scan.nextInt();
        System.out.println(Potenza(base,esponente));
        scan.close();
    }
    
    static double Potenza(int base, int esponente)
        {
            return Math.pow(base, esponente);
        }
}
