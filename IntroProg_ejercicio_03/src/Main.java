public class Main {
    public static void main(String[] args) {
        // Llamo a la función sumaTresValores y le paso los argumentos para realizar la suma
        sumaTresValores(10, 20, 30);

        // Creo una instancia de la clase y le añado una puerta
        Coche miCoche = new Coche();
        miCoche.addPuertas();
        System.out.println("El número de puertas es " + miCoche.puertas);
    }

    public static int sumaTresValores(int a, int b, int c) {
        int resultado;
        resultado = a + b + c;

        System.out.println("El resultado de la suma es " + resultado);
        return resultado;
    }

}

class Coche {
    public int puertas = 4;

    public void addPuertas(){
        this.puertas++;
    }
}