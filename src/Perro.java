
public class Perro extends Animal implements Mascotas  {

    private int edad;
    private String nombrePerro;
    private String raza;

    public Perro(String tipo, String nombre, int edad, String nombrePerro, String raza) {
        super(tipo, nombre);
        this.edad = edad;
        this.nombrePerro = nombrePerro;
        this.raza = raza;
    }



    @Override
    public void bañar() {
        System.out.println("Bañando a: "+this.nombrePerro);
    }

    @Override
    public void vacunar() {
        System.out.println("Vacunando a: "+this.nombrePerro);
    }

    @Override
    public void comer() {
        System.out.println("El Perro come Concentrado, en un plato");
    }

    @Override
    public void respirar() {
        System.out.println("El Perro respira solo.");
    }
}
