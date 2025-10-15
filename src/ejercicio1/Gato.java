package ejercicio1;

class Gato extends Animal {

    public Gato(String nombre) {
        super(nombre);
    }

    // Sobrescribimos el metodo
    public void hacerSonido() {
        System.out.println(nombre + " dice Miau!");
    }
}