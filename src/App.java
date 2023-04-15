import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int ore,minuti,secondi;

        System.out.println("Vuoi inserire 1) ORE-MINUTI-SECONDI o 2) solo i SECONDI ?\n");
        int scelta = scanner.nextInt();
        if(scelta == 1){
            System.out.print("Ore : ");
            ore = scanner.nextInt();
            System.out.print("Minuti : ");
            minuti = scanner.nextInt();
            System.out.print("secondi : ");
            secondi = scanner.nextInt();
            Time tm = new Time(minuti, ore, secondi);

            System.out.println(tm.convertiSecondi());
            System.out.println(tm.toString());
        }
        else if(scelta == 2){
            System.out.print("secondi : ");
            secondi = scanner.nextInt();
            Time tm = new Time(secondi);
            System.out.print("inserisci il numero di secondi che vuoi aggiungere : ");
            int ore2 = scanner.nextInt();
            tm.addSecondi(ore2);
            System.out.println(tm.toString());
        }
        else{
            System.out.println("ERRORE VALORE INSERITO NON CORRETTO");
            return;
        }

        
            


    }
}
