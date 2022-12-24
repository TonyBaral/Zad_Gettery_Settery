public class Sklep {
    Integer id;
    String nazwa;
    String miejscowosc;

    public Sklep(Integer id, String nazwa, String miejscowosc) {
        this.id = id;
        this.nazwa = nazwa;
        this.miejscowosc = miejscowosc;
    }

    @Override
    public String toString() {
        return "Sklep{" +
                "id=" + id +
                ", nazwa='" + nazwa + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                '}';
    }
}
