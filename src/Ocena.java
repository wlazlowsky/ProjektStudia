public class Ocena {
    private Przedmiot przedmiot;
    private Student student;
    private int wartosc;
    private int waga;

    public Ocena(Przedmiot przedmiot, Student student, int wartosc, int waga) {
        this.przedmiot = przedmiot;
        this.student = student;
        this.wartosc = wartosc;
        this.waga = waga;
    }

    @Override
    public String toString() {
        return "{"+przedmiot+", "+wartosc+" waga: "+waga+"}";
    }
}
