public class Sprzedawca {
    Integer id;
    String imie;
    String nazwisko;
    String miejscowosc;

    public Sprzedawca(Integer id, String imie, String nazwisko, String miejscowosc) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejscowosc = miejscowosc;
    }

    @Override
    public String toString() {
        return "Sprzedawca{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                '}';
    }
}
