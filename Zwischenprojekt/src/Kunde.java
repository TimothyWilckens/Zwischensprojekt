public class Kunde extends Mensch{
    int kundennummer;

    public Kunde(String vorname, String nachname, int alter, boolean tot, int kundennummer){
        super(vorname, nachname, alter, tot);
        setKundennummer(kundennummer);
    }
    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }
    public int getKundennummer() {
        return kundennummer;
    }
    public void showInfo(){
        System.out.println(getKundennummer());
    }
}
