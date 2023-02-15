public class Main {
    public static void main(String[] args) {

        Perro sasha = new Perro("Sasha", "Grandanes", 50.5, 2020, false, true);

        sasha.adoptable();
        System.out.println(sasha.adoptable());

        sasha.sePuedeEncontrar();
        System.out.println(sasha.sePuedeEncontrar());

        sasha.edad();
        System.out.println(sasha.edad());
    }
}
