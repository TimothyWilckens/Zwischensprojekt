import java.util.ArrayList;
public class App {

    static ArrayList<Mensch> alleMenschen;
    public static void main(String[] args) throws Exception {

        //OBJEKTERZEUGUNG:

        Mensch m1 = new Kunde("Hans", "Müller", 10, false, 12345);
        Mensch m2 = new Kunde("Klara", "Schmidt", 101, false, 98765);
        Mensch m3 = new Mitarbeiter("Max", "Mustermann", 20, false, 20000);

        //ARRAYLISTEN:

        alleMenschen = new ArrayList<>();
        alleMenschen.add(m3);
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

        alleForschleifen();
        

        // While-Do und Do-While 
        int i = 1;
        while(i == 1){
            System.out.println(1);
            i ++;
        }


        int b = 2;
        do{
            System.out.println(1);
        } while (b == 2);

    }

    public static void alleForschleifen(){
        for(int i = 0; i < 10; i++){     //wenn die Abbruchbedingung: i < 10 false ist, bricht die Schleife ab 
            System.out.println(i);
        }

        for(int i = 2; i < 20; i= i+2){
            System.out.println(i);
        }

        for(int i = 500; i > 100; i -= 6){
            System.out.println(i);
        }
    }
}
