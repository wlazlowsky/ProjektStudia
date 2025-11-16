import java.util.ArrayList;

public class Student extends Osoba {
    private ArrayList<Ocena> listaOcen;

    public Student(String imie, String nazwisko) {
        super(imie, nazwisko);
        this.listaOcen = new ArrayList<>();
    }

    public ArrayList<Ocena> getListaOcen() {
        System.out.println("Oceny studenta: "+ this);
        return listaOcen;
    }

    public void setListaOcen(ArrayList<Ocena> listaOcen) {
        this.listaOcen = listaOcen;
    }

    public void addOcena(Ocena ocena) {
        listaOcen.add(ocena);
    }
}
