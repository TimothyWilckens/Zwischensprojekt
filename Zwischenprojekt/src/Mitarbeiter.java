public class Mitarbeiter extends Mensch{
    
    int gehalt;

    public Mitarbeiter(String vorname, String nachname, int alter, int gehalt){
        super(vorname, nachname, alter);
        setGehalt(gehalt);
    }

    public void setGehalt(int gehalt) {
        this.gehalt = gehalt;
    }
    public int getGehalt() {
        return gehalt;
    }
}
