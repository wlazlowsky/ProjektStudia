public class Przedmiot {
    private String nazwa;
    private Nauczyciel nauczyciel;

    public Przedmiot(String nazwa, Nauczyciel nauczyciel) {
        this.nazwa = nazwa;
        this.nauczyciel = nauczyciel;
        nauczyciel.uczPrzedmiotu(this);
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
