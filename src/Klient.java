public class Klient {
    Integer id;
    String imie;
    String nazwisko;
    String miejscowoć;

    public Klient(Integer id, String imie, String nazwisko, String miejscowoć) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejscowoć = miejscowoć;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", miejscowoć='" + miejscowoć + '\'' +
                '}';
    }
}
