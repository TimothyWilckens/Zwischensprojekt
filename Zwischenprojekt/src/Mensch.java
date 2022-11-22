public class Mensch {
    
    //elematare Datentypen:
    
    String vorname;
    String nachname;
    int alter;
    boolean tot;

    //Konstruktor

    public Mensch(String vorname, String nachname, int alter, boolean tot){
        setAlter(alter);
        setNachname(nachname);
        setVorname(vorname);
        setTot(tot);
    }

    //Setter und Getter: Dienstleistungs- und Rückgabemethoden

    public void setAlter(int alter) {
        this.alter = alter;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public void setTot(boolean tot) {
        this.tot = tot;
    }
    public int getAlter() {
        return alter;
    }
    public String getNachname() {
        return nachname;
    }
    public String getVorname() {
        return vorname;
    }
    public boolean getTOT() {
        return tot;
    }
}
