/**
 * Questa classe permette la gestione di ore, minuti e secondi con vari metodi
 * @author Rida Carola
 */


public class Time {
    protected int minuti;
    protected int ore;
    protected int secondi;

    /**
     * costruttore che prende in ingresso minuti, ore e secondi e che controllndoli li mette tutti a 0 se sono maggiori a 60
     * @param minuti
     * @param ore
     * @param secondi
     */
    public Time(int minuti, int ore, int secondi) {

        if(minuti > 60 || ore > 60 || secondi > 60){
            this.minuti = 0;
            this.secondi = 0;
            this.ore = 0;
            return;
        }

        this.minuti = minuti;
        this.ore = ore;
        this.secondi = secondi;
    }
    
    /**
     * costruttore che prende in ingresso solo i secondi e che controllando il parametro in ingresso aggiorna i minuti se i secondi sono maggiori di 60
     * @param secondi
     */
    public Time(int secondi) {

        if(secondi >= 60){
            int t = 0;
            while(secondi < 60){
                secondi -= 60;
                t++;
            }
            this.minuti = t;
            this.secondi = secondi;
            return;
        }

        this.secondi = secondi;
    }


    public int getMinuti() {
        return minuti;
    }

    public int getOre() {
        return ore;
    }

    public int getSecondi() {
        return secondi;
    }
    
    /**
     * aggiorna i secondi, e nel caso siano maggiori di 60 aggionrna anche i minuti
     * @param secondi
     */
    public void addSecondi(int secondi){
        this.secondi += secondi;
        if(this.secondi > 60 ){
            this.secondi -= 60;
            this.minuti += 1;
        }    
    }

    /**
     * converte minuti e ore in secondi ritornando il totale di secondi presenti e in tutti e 3 i parametri
     * @return
     */
    public int convertiSecondi(){
        this.ore *= 3600;
        this.minuti *= 60;
        this.secondi += this.ore;
        this.secondi += this.minuti;
        return this.secondi;
    }

    /**
     * metodo che stampa i valori di ORE, MINUTI e SECONDI 
     */
    public String toString(){
        String s = "";
        s = "Ore : " + this.ore + "\nMinuti : " + this.minuti + "\nOre : " + this.ore;
        return s;
    }
}
