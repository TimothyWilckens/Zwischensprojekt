public class Manager extends Mensch{
    String position;

    public Manager(String vorname, String nachname, int alter, boolean tot, String position){
        super(vorname, nachname, alter, tot);
        setPosition(nachname);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void showInfo(){
        System.out.println(getPosition());
    }

}
