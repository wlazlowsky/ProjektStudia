import java.util.ArrayList;


public class main {
    public static void main(String[] args) {
        ArrayList<Ocena> oceny = new ArrayList<>();
        Student student = new Student("Olaf", "Kaczka");
        Nauczyciel nauczyciel = new Nauczyciel("Pani","Jakaś");
        Przedmiot polski = new Przedmiot("Polski", nauczyciel);
        Przedmiot angielski = new Przedmiot("Angielski", nauczyciel);
        nauczyciel.wystawOcene(polski, student,3,1);
        nauczyciel.wystawOcene(angielski, student,2,2);
        System.out.println(student.getListaOcen());
    }
}