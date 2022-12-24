public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Aster","Husky");

        System.out.println("----------------------------------------------------------------------");

        Klient klient = new Klient(23123,"Oskar","Cieśla","Warszawa");
        Car car = new Car(50493,"Lexus","ZFD23","2008","80L","60tkm","benzyna","Japonia","niebieski","200.000PLN");
Sprzedawca sprzedawca = new Sprzedawca(21167,"Michał","Dolny","Kielce");
Sklep sklep = new Sklep(72459,"BeAuto","Kielce");
        System.out.println(klient.toString());
        System.out.println(car.toString());
        System.out.println(sprzedawca.toString());
        System.out.println(sklep.toString());






    }
}