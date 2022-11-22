import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        Mensch m1 = new Mensch("hans", "Müller", 10, false);
        Mitarbeiter ma1 = new Mitarbeiter("Max", "Mustermann", 20, false, 20000);

        ArrayList<Mensch> alleMenschen = new ArrayList<>();
        alleMenschen.add(ma1);

        Mensch[] lebendeMenschen = new Mensch[10];
        int k = 0;
        for(Mensch menschen : alleMenschen){
            if(menschen.getTOT() == false){
                lebendeMenschen[k] = menschen;
                k++;
            }
        }
        

    }
}
