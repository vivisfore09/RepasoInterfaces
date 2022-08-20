public class Main {

    public static void main(String[] args) {

        Perro p=new Perro("Mamifero","Perro",5,"Paco","Bulldog");
        System.out.println("Metodos del Padre: ");
        p.nacer();
        p.respirar();
        p.comer();
        System.out.println("Metodos de Interfaz");
        p.bañar();
        p.vacunar();
    }
}
