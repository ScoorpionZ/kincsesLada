
package kincseslada;

import java.io.IOException;

public class program {
    
    public void program() throws IOException{
        ladaSzoveg();
        megfejtes(tipp());
    }
    
    
    private static void ladaSzoveg(){
        String[] ladak ={"Arany","Ezust","Bronnz"};
        String[] feliratok={"Bennem van a kincs.","Nem én rejtem a kincset.","Az aranyláda hazudik."};
        String[] feliratosLada = new String[3];
        for (int i = 0; i < ladak.length; i++) {
            feliratosLada[i]=ladak[i]+" "+feliratok[i];
            System.out.printf("%d %S\n",i+1,feliratosLada[i]);
        }
    }
    
    
    public static int tipp() throws IOException{
        System.out.println("");
        System.out.print("Melyik láda mond igazat?\nLáda száma: ");  
        int ladaSzam= System.in.read()-48;
        System.in.read();
        return ladaSzam;
    }
    
     public static void megfejtes(int tipp) {
        switch (tipp) {
            case 1:
                System.out.println("Nem találtad el.");
            break;
            case 2:
                System.out.println("Nem találtad el.");
            break;
            case 3:
                System.out.println("Jol választotál.");
            break;
        }
    }
}
