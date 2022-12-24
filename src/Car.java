public class Car {
    Integer id;
    String marka;
    String model;
    String rok_produkcji;
    String pojemnosc_silnika;
    String przebieg;
    String paliwo;
    String kraj_pochodzenia;
    String kolor;
    String cena;

    public Car(Integer id, String marka, String model, String rok_produkcji, String pojemnosc_silnika, String przebieg, String paliwo, String kraj_pochodzenia, String kolor, String cena) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.rok_produkcji = rok_produkcji;
        this.pojemnosc_silnika = pojemnosc_silnika;
        this.przebieg = przebieg;
        this.paliwo = paliwo;
        this.kraj_pochodzenia = kraj_pochodzenia;
        this.kolor = kolor;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rok_produkcji='" + rok_produkcji + '\'' +
                ", pojemnosc_silnika='" + pojemnosc_silnika + '\'' +
                ", przebieg='" + przebieg + '\'' +
                ", paliwo='" + paliwo + '\'' +
                ", kraj_pochodzenia='" + kraj_pochodzenia + '\'' +
                ", kolor='" + kolor + '\'' +
                ", cena='" + cena + '\'' +
                '}';
    }
}
