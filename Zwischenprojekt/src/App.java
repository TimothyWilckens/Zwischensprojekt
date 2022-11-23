import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {

        //OBJEKTERZEUGUNG:

        Mensch m1 = new Mensch("Hans", "Müller", 10, false);
        Mensch m2 = new Mensch("Klara", "Schmidt", 101, false);
        Mitarbeiter ma1 = new Mitarbeiter("Max", "Mustermann", 20, false, 20000);

        //ARRAYLISTEN:

        ArrayList<Mensch> alleMenschen = new ArrayList<>();
        alleMenschen.add(ma1);
        alleMenschen.add(m1);
        alleMenschen.add(m2);

        //SWITCH-CASES:

        switch(alleMenschen.size()){ //das macht gar nicht mal so viel Sinn (weil es eine Array-LIST ist, aber egal)
            
            case 0: //diese zahl ist der korrespondierende Wert der Variable, nicht die Nummer der Cases!!
            System.out.println("hmm, nicht so viele");
            break;
            case 1:
            System.out.println("wow, ein Mensch");
            break;
            case 2:
            System.out.println("wow, sogar zwei");
            case 3:
            System.out.println("hmm, vielleicht zu viele...");
            break;
        }

        //ARRAYS (+ IF-ABFRAGEN):

        Mensch[] lebendeMenschen = new Mensch[10];
        int k = 0;
        for(Mensch menschen : alleMenschen){
            if(menschen.getTOT() == false){            //mögliche Operatoren: >, <, >=, <=, != und == 
                lebendeMenschen[k] = menschen;
                k++;
            } else{                                    //else oder else-if sind nicht zwingend notwendig
                System.out.println(menschen.getVorname() + "ist (leider) nicht mehr am leben :(");
            }
        }

        //FOR-SCHLEIFEN:

        for(int i = 0; i < 10; i++){     //wenn die Abbruchbedingung: i < 10 false ist, bricht die Schleife ab 
            System.out.println(i);
        }

        for(int i = 2; i < 20; i= i+2){
            System.out.println(i);
        }
        

    }
}
