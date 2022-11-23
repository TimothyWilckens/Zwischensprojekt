public class Mitarbeiter extends Mensch{
    // Die Klasse Mitarbieter ERBT von Mensch (extends)
    
    int gehalt;

    public Mitarbeiter(String vorname, String nachname, int alter, boolean tot, int gehalt){
        super(vorname, nachname, alter, tot);
        setGehalt(gehalt);
    }

    public void setGehalt(int gehalt) {
        this.gehalt = gehalt;
    }
    public int getGehalt() {
        return gehalt;
    }
}
