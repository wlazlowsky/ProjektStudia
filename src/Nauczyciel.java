import java.util.ArrayList;

public class Nauczyciel extends Osoba {
    private ArrayList<Przedmiot> nauczanePrzedmioty;

    public Nauczyciel(String imie, String nazwisko) {
        super(imie, nazwisko);
        this.nauczanePrzedmioty = new ArrayList<>();
    }

    void wystawOcene(Przedmiot przedmiot, Student student, int wartosc, int waga) {
        student.addOcena(new Ocena(przedmiot, student, wartosc, waga));
    }
}
