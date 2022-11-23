public class Mensch {
    
    //ELEMENTARE DATENTYPEN:
    
    String vorname;
    String nachname;
    int alter;
    boolean tot;

    //KONSTRUKTOR: überprüft ob die notwendigen Parameter für die Objekterzeugung gegeben sind 

    public Mensch(String vorname, String nachname, int alter, boolean tot){
        setAlter(alter);
        setNachname(nachname);
        setVorname(vorname);
        setTot(tot);
    }

    //SETTER & GETTER: Dienstleistungs- und Rückgabemethoden

    public void setAlter(int alter) { //Schlüsselwort: void
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
    public int getAlter() { //Schlüsselwort: return (und kein void)
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
