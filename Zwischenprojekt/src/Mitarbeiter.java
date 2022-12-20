public class Mitarbeiter extends Mensch{
    // Die Klasse Mitarbieter ERBT von Mensch (extends)
    
    double gehalt;

    public Mitarbeiter(String vorname, String nachname, int alter, boolean tot, double gehalt){
        super(vorname, nachname, alter, tot);
        setGehalt(gehalt);
    }

    public void setGehalt(double gehalt) {
        this.gehalt = gehalt;
    }
    public double getGehalt() {
        return gehalt;
    }

    public void showInfo(){
        System.out.println(getGehalt());
    }
}
